import java.util.Scanner;

class Beslutninger {
  public static void main(String[] args) {
    System.out.println("Hvor gammel er du?");
    Scanner tastatur = new Scanner(System.in);

    int alder = tastatur.nextInt();

    if (alder >= 18) {
      System.out.println("Du er myndig.");
    } else {
      System.out.println("Du er ikke myndig.");
    }
  }
}
