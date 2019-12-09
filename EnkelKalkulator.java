import java.util.Scanner;

class EnkelKalkulator {
  public static void main(String[] args) {
    System.out.println("Skriv inn dine to tall.");
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    addisjon(a, b);
    subtrahere(a, b);
    multiplikasjon(a, b);
    divisjon(a, b);
  }

  public static void addisjon(int a, int b) {
    System.out.println("Addisjon: " + (a + b));
  }

  public static void subtrahere(int a, int b) {
    System.out.println("Subraksjon: " + (a - b));
  }

  public static void multiplikasjon(int a, int b) {
    System.out.println("Multiplikasjon: " + (a * b));
  }

  public static void divisjon(int a, int b) {
    System.out.println("Divisjon: " + (a / b));
  }
}
