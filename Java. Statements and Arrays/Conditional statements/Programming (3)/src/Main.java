import java.util.Scanner;

public class Main
{

    Scanner scanner = new Scanner(System.in);
    int ueberpruefeneZahl = scanner.nextInt();
    int ersteZiffer;
    int zweiteZiffer;
    int dritteZiffer;
    int vierteZiffer;

    public static void main(String[] args)
    {
        new Main().start();
    }

    public void ueberPruefeAufPalindrom()
    {
        
        ersteZiffer = ueberpruefeneZahl/1000;
        zweiteZiffer = ueberpruefeneZahl / 100 % 10;
        dritteZiffer = ueberpruefeneZahl /10 %10;
        vierteZiffer = ueberpruefeneZahl %10;
        if(ersteZiffer == vierteZiffer && zweiteZiffer ==dritteZiffer)
        {
          System.out.println(1);
        }else
          {
            System.out.println(37);
          }

    }

    public void start()
    {
        ueberPruefeAufPalindrom();
    }
}