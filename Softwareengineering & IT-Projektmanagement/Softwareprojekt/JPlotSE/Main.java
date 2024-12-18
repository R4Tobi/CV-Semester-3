import src.DataStructure.Polynomial;
import src.UserInterface.PolynomialGUI;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Polynomial p = new Polynomial(new double[]{2, 1});
        Polynomial p2 = new Polynomial("1 + 2x - 3x^2");
        Polynomial p3 = new Polynomial("x^3 - 6x^2 + 11x - 6");
        Polynomial p4 = new Polynomial("3x+1");
        Polynomial p5 = new Polynomial("x^3 + x - 5");
        Polynomial poly = new Polynomial(new double[]{-6, 11, -6, 1});

        Polynomial[] polynomials = {p, p2, p3, p4, p5, poly};

        for (Polynomial polynomial : polynomials) {
            System.out.println("\n");
            System.out.println(polynomial.toString());
            System.out.println(polynomial.derivative().toString());
            System.out.println(polynomial.findRoots());
        }

        //PolynomialGUI.main(new String[]{});
    }
}