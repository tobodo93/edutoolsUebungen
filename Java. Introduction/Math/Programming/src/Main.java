import java.util.Scanner;

import static java.lang.Math.pow;

public class Main
{
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double ergebnis;

    public static void main(String[] args)
    {
        new Main().start();
    }

    public void start()
    {
        berechneaHochb();
    }

    @SuppressWarnings("squid:S106")
    public void berechneaHochb()
    {
        ergebnis = pow(a, b);
        System.out.println(ergebnis);
    }
}