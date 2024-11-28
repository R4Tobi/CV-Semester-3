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
        System.out.println("Coefficients: " + coefficients);
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
        System.out.println("Degree: " + maxDegree);

        //initialize coefficients Array with the size of the degree
        double[] coeffs = new double[maxDegree + 1];
        Arrays.fill(coeffs, 0);

        //reset matcher to find expressions and put them into the array
        matcher.reset();

        while(matcher.find()) {
            System.out.println("Group 0: " + matcher.group(0));
            System.out.println("Group 1: " + matcher.group(1));
            System.out.println("Group 2: " + matcher.group(2));
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
        new Polynomial(coeffs);
    }
}
