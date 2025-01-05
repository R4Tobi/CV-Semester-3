package ComputeTax;
public class ComputeTax {

  public static double calculateTax(double income) {
    if (income <= 10000) {
      return 0;
    } else if (income <= 20000) {
      return (income - 10000) * 0.10;
    } else if (income <= 30000) {
      return (income - 20000) * 0.20 + 1000;
    } else {
      return (income - 30000) * 0.30 + 1000 + 2000;
    }
  }

  // --- Insert Code below
  public static boolean testCalculation() {
    // ToDo: add TestCase 1
    double tax1 = calculateTax(5000);
    if (tax1 != 0) {
      System.out.println("Test 1 fehlgeschlagen: " + tax1);
      return false;
    }else{
      System.out.println("Test 1 erfolgreich");
    }
    // ToDo: add TestCase 2
    double tax2 = calculateTax(15000);
    if (tax2 != 500) {
      System.out.println("Test 2 fehlgeschlagen: " + tax2);
      return false;
    }else{
      System.out.println("Test 2 erfolgreich");
    }
    // ToDo: add TestCase 3
    double tax3 = calculateTax(25000);
    if (tax3 != 2000) {
      System.out.println("Test 3 fehlgeschlagen: " + tax3);
      return false;
    }else{
      System.out.println("Test 3 erfolgreich");
    }
    // ToDo: add TestCase 4
    double tax4 = calculateTax(35000);
    if (tax4 != 4500) {
      System.out.println("Test 4 fehlgeschlagen: " + tax4);
      return false;
    }else{
      System.out.println("Test 4 erfolgreich");
    }
    // ToDo: add TestCase 5
    double tax51 = calculateTax(9999.54);
    double tax52 = calculateTax(10000.34);
    double tax53 = calculateTax(10001.01);
    if (tax51 != 0 || tax52 != 0.034 || tax53 != 0.101) {
      System.out.println("Test 5 fehlgeschlagen: " + tax51 + " " + tax52 + " " + tax53);
      return false;
    }else{
      System.out.println("Test 5 erfolgreich");
    }
    // ToDo: add Test case 6
    double tax61 = calculateTax(19999.86);
    double tax62 = calculateTax(20000.26);
    double tax63 = calculateTax(20001.04);
    if (tax61 != 999.986 || tax62 != 1000.052 || tax63 != 1000.104) {
      System.out.println("Test 6 fehlgeschlagen: " + tax61 + " " + tax62 + " " + tax63);
      return false;
    }else{
      System.out.println("Test 6 erfolgreich");
    }
    // ToDo: add Test case 7
    double tax71 = calculateTax(29999.69);
    double tax72 = calculateTax(30000.03);
    if (tax71 != 2999.938 || tax72 != 3000.009) {
      System.out.println("Test 7 fehlgeschlagen: " + tax71 + " " + tax72);
      return false;
    }else{
      System.out.println("Test 7 erfolgreich");
    }
    return true;
}
  // --- Insert Code above

  public static void main(String args[]) {
    if (testCalculation()) {
      System.out.println("Alle Tests bestanden.");
    } else {
      System.out.println("Die Berechnung ist fehlerhaft.");
    }
  }
}