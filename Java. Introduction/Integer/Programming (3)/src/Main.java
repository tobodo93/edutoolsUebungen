import java.util.Scanner;

public class Main
{
    int ergebnis;
    int zahl;
    int ergebnis1;

    public static void main(String[] args)
    {
        new Main().start();

    }

    @SuppressWarnings("squid:S106")
    public void anzahlDerZehner()
    {
        Scanner scanner = new Scanner(System.in);
        zahl = scanner.nextInt();
        ergebnis = (zahl / 100) % 10;
        ergebnis1 = (zahl / 10) % 10;

        System.out.println(ergebnis1);

    }

    public void start()
    {
        anzahlDerZehner();
    }
}