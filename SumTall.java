import java.util.Scanner;

class SumTall {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 0;
    int b = 1;
    System.out.println(a);
    while (b != 0) {
      b = sc.nextInt();
      a += b;
        if (b != 0) {
          System.out.println(a);
        }
    }
    System.out.println("Program avsluttet.");
  }
}
