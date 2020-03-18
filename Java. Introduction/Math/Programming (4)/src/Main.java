import java.util.Scanner;

public class Main
{
    Scanner scanner = new Scanner(System.in);
    int zahl = scanner.nextInt();

    public static void main(String[] args)
    {
        new Main().start();
    }

    @SuppressWarnings("squid:S106")
    public void berechneXOR()
    {
        int ziffer1 = (zahl / 10) % 10;
        int ziffer2 = (zahl) % 10;

        System.out.println((ziffer1) ^ (ziffer2));
    }

    public void start()
    {
        berechneXOR();
    }
}