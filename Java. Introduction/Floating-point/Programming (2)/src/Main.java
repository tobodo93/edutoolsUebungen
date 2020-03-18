import java.util.Scanner;

public class Main
{

    Scanner scanner = new Scanner(System.in);
    double zahl = scanner.nextDouble();
    int endergebnis;
    double ergebnis;
    double ergebnis1;

    public static void main(String[] args)
    {
        new Main().start();
    }


    public void start()
    {
        gebeDezimalPartAus();
    }

    @SuppressWarnings("squid:S106")
    public void gebeDezimalPartAus()
    {
        zahl = zahl * 100;
        ergebnis = (zahl / 100) % 10;
        ergebnis1 = (zahl / 10) % 10;
        endergebnis = (int) ergebnis1;
        System.out.println(endergebnis);
    }
}