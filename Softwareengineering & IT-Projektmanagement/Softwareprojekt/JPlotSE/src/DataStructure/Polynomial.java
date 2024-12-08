package src.DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Polynomial {
    private List<Double> coefficients;

    /**
     * Constructor for Polynomial
     * @param coeffs The coefficients of the polynomial in a simple Array
     */
    public Polynomial(double[] coeffs) {
        coefficients = new ArrayList<>();
        for (double c : coeffs) {
            coefficients.add(c);
        }
    }

    /**
     * Constructor for Polynomial out of a String
     * @param polynom
     */
    public Polynomial(String polynom) {
        //remove whitespaces from String using RegEx Pattern
        polynom = polynom.replaceAll("\\s+", "").replaceAll("\\+-", "-");
        System.out.println(polynom);

        //create Regex Pattern for Expressions like x^2, 2x^4, -3, 4x
        Pattern termPattern = Pattern.compile("([+-]?\\d*\\.?\\d*)x?(?:\\^(\\d+))?"); // This Pattern was created using AI: model GPT-4o, prompt: "Create a regex pattern for expressions like x^2, 2x^4, -3, 4x"

        //create Matcher for the given Polynomial to find expressions
        Matcher matcher = termPattern.matcher(polynom);
        //iterate through all expressions from the Polynomial and determine the degree of the polynom
        int maxDegree = 0;
        while (matcher.find()) {
            if (matcher.group(2) != null) {
                int exponent = Integer.parseInt(matcher.group(2));
                maxDegree = Math.max(maxDegree, exponent);
            }else if (matcher.group(0).contains("x")){
                maxDegree = Math.max(maxDegree, 1);
            }
        }

        //initialize coefficients Array with the size of the degree
        double[] coeffs = new double[maxDegree + 1];
        Arrays.fill(coeffs, 0);

        //reset matcher to find expressions and put them into the array
        matcher.reset();

        while(matcher.find()) {
            String coeffStr;
            //positive coeff
            if (matcher.group(1).isEmpty() || matcher.group(1).equals("+")) {
                coeffStr = "1";
            //negative coeff
            } else if (matcher.group(1).equals("-")) {
                coeffStr = "-1";
            } else {
                coeffStr = matcher.group(1);
            }
            double coeff = Double.parseDouble(coeffStr);
            //get degree to set the coefficient at the right position in the array
            int degree;
            if (matcher.group(2) != null) {
                degree = Integer.parseInt(matcher.group(2)); // Explicit power like x^2
            } else if (matcher.group(0).contains("x")) {
                degree = 1; // Linear term like "x"
            } else {
                degree = 0; // Constant term
            }
            coeffs[degree] += coeff;
        }
        //fix for too high coefficients, because the matcher appends one value at last iteration, where all Groups are blank or null, so its needs to removed
        coeffs[0] = coeffs[0] - 1;
        coefficients = new ArrayList<>();
        for (double c : coeffs) {
            coefficients.add(c);
        }
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coefficients.size(); i++) {
            result += coefficients.get(i) * Math.pow(x, i);
        }
        return result;
    }

    // Berechnet die Ableitung des Polynoms als neues Polynomial-Objekt
    public Polynomial derivative() {
        if (coefficients.size() <= 1) {
            return new Polynomial(new double[]{0});
        }
        double[] derivativeCoeffs = new double[coefficients.size() - 1];
        for (int i = 1; i < coefficients.size(); i++) {
            derivativeCoeffs[i - 1] = coefficients.get(i) * i;
        }
        return new Polynomial(derivativeCoeffs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coefficients.size() - 1; i >= 0; i--) {
            double coeff = coefficients.get(i);
            if (coeff == 0) continue;
            if (!sb.isEmpty()) {
                sb.append(coeff > 0 ? " + " : " - ");
            }
            if (Math.abs(coeff) != 1 || i == 0) {
                sb.append(Math.abs(coeff));
            }
            if (i > 0) {
                sb.append("x");
                if (i > 1) {
                    sb.append("^").append(i);
                }
            }
        }
        return sb.toString();
    }

    public List<Double> findRoots() {
        List<Double> roots = new ArrayList<>();
        Polynomial current = this;

        while (current.coefficients.size() > 2) {
            // Use Newton's method to find a root
            double root = findRoot(current);
            roots.add(root);

            // Perform polynomial division to get the reduced polynomial
            current = current.divideByLinearFactor(root);
        }

        // Handle the final quadratic or linear case
        if (current.coefficients.size() == 2) {
            // Linear case ax + b = 0 -> root = -b/a
            double a = current.coefficients.get(1);
            double b = current.coefficients.get(0);
            roots.add(-b / a);
        } else if (current.coefficients.size() == 3) {
            // Quadratic case ax^2 + bx + c = 0
            roots.addAll(solveQuadratic(current));
        }

        return roots;
    }

    // Helper function: Perform polynomial division by (x - r)
    private Polynomial divideByLinearFactor(double root) {
        int degree = this.coefficients.size() - 1;
        double[] newCoefficients = new double[degree]; // Reduced degree

        newCoefficients[degree - 1] = coefficients.get(degree);
        for (int i = degree - 2; i >= 0; i--) {
            newCoefficients[i] = coefficients.get(i + 1) + root * newCoefficients[i + 1];
        }

        return new Polynomial(newCoefficients);
    }

    // Helper function: Solve quadratic equation ax^2 + bx + c = 0
    private List<Double> solveQuadratic(Polynomial poly) {
        List<Double> roots = new ArrayList<>();
        double a = poly.coefficients.get(2);
        double b = poly.coefficients.get(1);
        double c = poly.coefficients.get(0);

        double discriminant = b * b - 4 * a * c;
        if (discriminant >= 0) {
            double sqrtD = Math.sqrt(discriminant);
            roots.add((-b + sqrtD) / (2 * a));
            roots.add((-b - sqrtD) / (2 * a));
        }
        return roots;
    }

    // Helper function: Find a single root using Newton's method
    private double findRoot(Polynomial poly) {
        double x0 = 0; // Initial guess
        double tolerance = 1e-8;
        int maxIterations = 1000;

        for (int i = 0; i < maxIterations; i++) {
            double fx = poly.evaluate(x0);
            double fPrimeX = poly.derivative().evaluate(x0);

            if (Math.abs(fx) < tolerance) {
                return Math.round(x0 * 1e6) / 1e6; // Root found
            }

            if (Math.abs(fPrimeX) < tolerance) {
                return 0;
            }

            x0 = x0 - fx / fPrimeX; // Newton's iteration
        }

        return 0; // No root found
    }
}
