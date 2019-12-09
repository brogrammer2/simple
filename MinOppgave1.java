//Du skal naa lage et quiz-program med 3 sporsmaal.
import java.util.Scanner;

class MinOppgave1 {
  public static void main(String[] args) {
    quiz();
  }

  public static void quiz() {
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    int poengSum = 0;

    System.out.println("Hva heter onkelen til Donald?");
    String svar1 = sc.nextLine();
      if (svar1.equals("Skrue")) {
        System.out.println("Riktig!");
        poengSum++;
      } else {
        System.out.println("Galt...");
      }

    System.out.println("Hva er 2 + 2?");
    int svar2 = sc.nextInt();
      if (svar2 == 4) {
        System.out.println("Riktig!");
        poengSum++;
      } else {
        System.out.println("Galt...");
      }

    System.out.println("Hva er dette emnets fagkode?");
    String svar3 = sc2.nextLine();
      if (svar3.equals("INF1000")) {
        System.out.println("Riktig!");
        poengSum++;
      } else {
        System.out.println("Galt...");
      }

    System.out.println("Du fikk " + poengSum + "/3 riktige!");
  }
}
