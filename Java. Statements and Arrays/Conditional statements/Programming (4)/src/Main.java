import java.util.Scanner;

public class Main
{
    Scanner scanner = new Scanner(System.in);
    int ueberpruefeneZahl = scanner.nextInt();

    public static void main(String[] args)
    {
        new Main().start();
    }

    public void ueberpruefeSchaltJahr()
    {
        if (ueberpruefeneZahl % 4 == 0 && ueberpruefeneZahl % 100 != 0)
        {
            System.out.println("Leap");
        }
        else if(ueberpruefeneZahl % 400 == 0)
        {
            System.out.println("Leap");
        }else
            {
                System.out.println("Regular") ;
            }

    }

    public void start()
    {
        ueberpruefeSchaltJahr();
    }
}