import java.util.Scanner;

public class Main
{
    Scanner scanner = new Scanner(System.in);
    int zahl = scanner.nextInt();
    int ergebniss;
    int ergebniss2;
    int ergebniss3;
    int summe;

    public static void main(String[] args)
    {
        new Main().start();
    }

    @SuppressWarnings("squid:S106")
    public void summeDerDreiZiffern()
    {
        ergebniss = (zahl / 100) % 10;
        ergebniss2 = (zahl / 10) % 10;
        ergebniss3 = zahl % 10;

        summe = ergebniss + ergebniss2 + ergebniss3;

        System.out.println(summe);
    }

    public void start()
    {
        summeDerDreiZiffern();
    }
}