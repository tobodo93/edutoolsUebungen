
import java.util.Scanner;
public class Main
{
  Scanner scanner = new Scanner(System.in);
  int a = scanner.nextInt();
  int b = scanner.nextInt();
  int c = scanner.nextInt();
  public static void main(String[] args)
  {
       new Main().start();
  }
  public void start()
  {
          ueberpruefeDreieck();
  }
  public void ueberpruefeDreieck()
  {

     if(a +b > c && a+c > b && b+c > a)
     {
       System.out.println("YES");

     } else
       {
         System.out.println("NO") ;
       }
  }
}

