import java.util.Scanner;
public class Main
{
  Scanner scanner = new Scanner(System.in);
  int a = scanner.nextInt();

  public void bestimmePositiveundNegativeZahl()
  {
       if((a > -15 && a <= 12) || (a > 14 && a < 17) ||  (a >= 19))
       {
         System.out.println("True");
       }else
         {
           System.out.println("False");
         }
  }
  public void start()
  {
    bestimmePositiveundNegativeZahl();

  }
  public static void main(String[] args)
  {
    new Main().start();
  }


}



