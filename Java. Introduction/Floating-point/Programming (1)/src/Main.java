

import java.util.Scanner;

public class Main
{

    Scanner scanner = new Scanner(System.in);
    double zahl = scanner.nextDouble();
    int gerundeteZahl;
    double ergebnis;

    @SuppressWarnings("squid:S106")
    void berechneFractionalPart()
    {

        gerundeteZahl = (int) zahl;
        ergebnis = zahl - gerundeteZahl;
        System.out.println(ergebnis);
    }

    public static void main(String[] args)
    {
        new Main().start();
    }

    public void start()
    {
        berechneFractionalPart();

    }
}