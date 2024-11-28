import src.DataStructure.Polynomial;

class Main {
    public static void main(String[] args) {
        Polynomial p = new Polynomial(new double[]{1, 2, 3});
        Polynomial p2 = new Polynomial("1 + 2x - 3x^2");
        Polynomial p3 = new Polynomial("1 + 2x^5 + 4x^2 - 3x^3 + 1x^5");
    }
}