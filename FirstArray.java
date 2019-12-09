import java.util.Scanner;

class FirstArray {
  public static void main(String[] args) {
    String[] navnArray = new String[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("Skriv inn fem navn:");

    navnArray[0] = sc.nextLine();
    navnArray[1] = sc.nextLine();
    navnArray[2] = sc.nextLine();
    navnArray[3] = sc.nextLine();
    navnArray[4] = sc.nextLine();

    int[] tallArray = new int[4];
    int teller = 0;
    while (teller != tallArray.length) {
      tallArray[teller] = teller;
      teller++;
    }

    /*for (int i = 0; i < tallArray.length; i++) {
      System.out.println(tallArray[i]);
    }*/

    tallArray[0] = 1337;
    tallArray[3] = 1337;


    System.out.println("Innhold i int-arrayen:");
    for (int i = 0; i < tallArray.length; i++) {
      System.out.println(tallArray[i]);
    }

    System.out.println("Innhold i String-arrayen:");
    for (int i = 0; i < navnArray.length; i++) {
      System.out.println(navnArray[i]);
    }
  }
}
