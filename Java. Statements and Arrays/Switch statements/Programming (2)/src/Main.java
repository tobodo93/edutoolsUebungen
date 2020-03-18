import java.util.Scanner;

public class Main {
  Scanner scanner = new Scanner(System.in);
  long zahl1 = scanner.nextLong();
  char operator = scanner.next().charAt(0);
  long zahl2 = scanner.nextLong();
  public void eingabe()
  {

  }
  @SuppressWarnings("squid:S106")
  public void calculator ()
  {
    switch(operator)
    {
      case '+':
        System.out.println(zahl1 + zahl2);
        break;
      case '-':
        System.out.println(zahl1 - zahl2);
        break;

      case '/':
        if(zahl2 == 0)
        {
          System.out.println("Division by 0!");
        }else
        {
          System.out.println(zahl1 / zahl2);
        }
        break;
      case '*':
        System.out.println(zahl1 * zahl2);
        break;

      default: System.out.println("Unknown operator");

    }

  }
  public void start()
  {
    calculator();
  }
  public static void main(String[] args)
  {
    new Main().start();

  }
}