import src.DataStructure.Polynomial;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Polynomial p = new Polynomial(new double[]{2, 1});
        Polynomial p2 = new Polynomial("1 + 2x - 3x^2");
        Polynomial p3 = new Polynomial("1 + 2x^5 + 4x^2 - 3x^3 + 1x^5 + 4 + 7 - 9");
        Polynomial p4 = new Polynomial("3x");

        Polynomial[] polynomials = {p, p2, p3, p4};

        for (Polynomial polynomial : polynomials) {
            System.out.println(polynomial.toString());
            System.out.println(polynomial.derivative().toString());
            System.out.println(polynomial.findRoots());
        }
    }
}