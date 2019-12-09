import java.util.Scanner;

class Metoder {
  public static void main(String[] args) {
    //Scanner sc = new Scanner(System.in);
    siNavn();
    siNavn();
    siNavn();
  }

  public static void siNavn() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Skriv inn navn:");
    String navn = sc.nextLine();
    System.out.println("Skriv inn bosted:");
    String bosted = sc.nextLine();
    System.out.println("Hei, " + navn + "! Du er fra " + bosted + ".");
  }
}
