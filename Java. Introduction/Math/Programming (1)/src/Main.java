import static java.lang.Math.sqrt;

import java.util.Scanner;

public class Main
{
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    double zwischenErgebnis;


    public static void main(String[] args)
    {
        new Main().start();
    }

    @SuppressWarnings("squid:S106")
    public void berechneQuatratischeGleichung()
    {
        zwischenErgebnis = b * b - 4 * a * c;
        zwischenErgebnis = Math.sqrt(zwischenErgebnis);
        double result1 = (zwischenErgebnis - b) / (2 * a);
        double result2 = (-b - zwischenErgebnis) / (2 * a);

        System.out.println(Math.min(result1, result2) + " " + Math.max(result1, result2));
    }

    public void start()
    {
        berechneQuatratischeGleichung();
    }
}