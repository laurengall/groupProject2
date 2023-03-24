import java.util.Scanner;

public class Tools {

  public static String getInput() {

    System.out.print("\r> ");
    Scanner scanIn = new Scanner(System.in);
    String input = scanIn.nextLine();
    return input.toLowerCase();
  }

  public static int getInputInt() {
    System.out.print("\r> ");
    Scanner scanIn = new Scanner(System.in);
    return scanIn.nextInt();
  }

  public static void waitms(int ms) {
    try {
      Thread.sleep(ms);
    } catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }

  public static void clear() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
