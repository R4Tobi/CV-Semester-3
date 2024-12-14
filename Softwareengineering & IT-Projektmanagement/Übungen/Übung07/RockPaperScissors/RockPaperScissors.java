package RockPaperScissors;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
  public static void soutChoice(int choice, String player) {
    System.out.print(player + " wählt ");
    switch (choice) {
      case 1: {
        System.out.print("Schere");
      }
        break;
      case 2: {
        System.out.print("Stein");
      }
        break;
      case 3: {
        System.out.print("Papier");
      }
        break;
    }
    System.out.println();
  }

  public static void soutResult(int choice, int enemy) {
    System.out.print("Ergebnis: ");
    if (choice == enemy) {
      System.out.println("Unentschieden");
    } else if (choice == 1 && enemy == 2 || choice == 2 && enemy == 3 || choice == 3 && enemy == 1) {
      System.out.println("Gegner gewinnt");
    } else {
      System.out.println("Spieler gewinnt");
    }
  }

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Schere-Stein-Papier");
    System.out.println("===================");
    System.out.println("Wähle Deine Waffe!");
    System.out.println("(1) Schere");
    System.out.println("(2) Stein");
    System.out.println("(3) Papier");

    //Player Choice
    int choice = 0;
    while (choice < 1 || choice > 3) {
      System.out.print("Eingabe:");
      choice = input.nextInt();
    }
    //close input after valid choice
    input.close();
    soutChoice(choice, "Spieler");

    //Enemy Choice (Bot)
    Random random = new Random();
    int enemy = random.nextInt(3) + 1;
    soutChoice(choice, "Gegner");

    soutResult(choice, enemy);
    System.out.println("Ende des Spiels");
    System.exit(0);
  }
}