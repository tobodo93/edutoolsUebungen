import java.util.Scanner;

public class Main
{
    Scanner scanner = new Scanner(System.in);
     int auswahl;
     int ergebnis;
    public int eingabeAuswahl()
    {
        auswahl = scanner.nextInt();
        return auswahl;
    }
    @SuppressWarnings("squid:S106")
    public int bestimmeBewegungsRichtung(int auswahl)
    {
        switch (auswahl)
        {
            case 1:
                System.out.println("move up");
                break;
            case 2:
                System.out.println("move down");
                break;
            case 3:
                System.out.println("move left");
                break;
            case 4:
                System.out.println("move right");
                break;
            case 0:
                System.out.println("do not move");
                break;
            default:
                System.out.println("error!");

        }
        return auswahl;
    }

    public void startenDerMethoden()
    {
        auswahl = eingabeAuswahl();
        ergebnis = bestimmeBewegungsRichtung(auswahl);
    }

    public static void main(String[] args)
    {
        new Main().startenDerMethoden();
    }
}