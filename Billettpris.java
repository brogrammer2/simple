import java.util.Scanner;

class Billettpris {
  public static void main(String[] args) {
    System.out.println("Hvor gammel er du?");
    Scanner tastatur = new Scanner(System.in);

    int alder = tastatur.nextInt();
    if (alder < 12 || alder > 67) {
      System.out.println("Du betaler 25 kr.");
    } else {
      System.out.println("Du betaler 50 kr.");
    }
  }
}
