import java.util.Scanner;

public class timer {

  public static void main(String[] args)
      throws InterruptedException {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the time in seconds: ");

    int start = scanner.nextInt();

    for (int i = start; i >= 0; i--) {
      System.out.println(i);
      Thread.sleep(1000);

    }
    System.out.println("How Are You Doing");
  }

}
