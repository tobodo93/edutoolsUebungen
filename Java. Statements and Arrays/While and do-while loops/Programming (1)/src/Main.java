
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scan = new Scanner(System.in);
    int numOfElements = scan.nextInt();
    int tries = 0;
    int number = 0;
    while (tries < numOfElements) {
      int y = scan.nextInt();
      if (y % 4 == 0)
        if (y > number)
          number = y;
      tries++;
    }
    System.out.println(number);
  }
}
