import java.util.Scanner;

public class Main
{
    Scanner scanner = new Scanner(System.in);
    String ticket = scanner.nextLine();
    String substring1 = ticket.substring(0, 3);
    String substring2 = ticket.substring(3, 6);
    int ergebnis1;
    int ergebnis2;

    public void ueberPruefeTciket()
    {
        for (int i = 0; i < ticket.length()/2; i++)
        {
            ergebnis1 += substring1.charAt(i);
            ergebnis2 += substring2.charAt(i);
        }
        if (ergebnis1 == ergebnis2)
        {
            System.out.println("Lucky");
        }
        else
        {
            System.out.println("Regular");
        }
    }

    public void start()
    {
        ueberPruefeTciket();
    }

    public static void main(String[] args)
    {
        new Main().start();

    }
}