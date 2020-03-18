import static java.lang.Math.pow;

import java.util.Scanner;

public class Main
{
    Scanner scanner = new Scanner(System.in);
    double zahl = scanner.nextDouble();
    double zahlHochDrei;
    double zahlHochZwei;
    double ergebnis;

    public static void main(String[] args)
    {
        new Main().start();

    }

    public void start()
    {
        berechneErgebnis();
    }

    @SuppressWarnings("squid:S106")
    public void berechneErgebnis()
    {
        zahlHochDrei = pow(zahl, 3.0);
        zahlHochZwei = pow(zahl, 2.0);
        ergebnis = zahlHochDrei + zahlHochZwei + zahl + 1;
        System.out.println(ergebnis);
    }
}