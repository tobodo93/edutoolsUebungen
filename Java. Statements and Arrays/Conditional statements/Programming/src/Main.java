import java.util.Scanner;
public class Main {

  Scanner scanner = new Scanner(System.in);
  int zuUeberpruefeneZahl = scanner.nextInt();
  public static void main(String[] args)
  {

    new Main().start();
  }
  public void ueberPruefeobPositiv()
  {
      if(zuUeberpruefeneZahl > 0)
      {
        System.out.println("YES");
      } else
        {
          System.out.println("NO");
        }
  }
  public void start()
  {
       ueberPruefeobPositiv();
  }
}