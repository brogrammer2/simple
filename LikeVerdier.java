import java.util.Scanner;

class LikeVerdier {
  public static void main(String[] args) {
    Scanner tastatur = new Scanner(System.in);

    System.out.println("Hva er verdien til c?");
    int c = tastatur.nextInt();
    System.out.println("Hva er verdien til d?");
    int d = tastatur.nextInt();

    if (c == d) {
      System.out.println("c og d er like.");
    } else {
      System.out.println("c og d er ikke like.");
    }
  }
}
