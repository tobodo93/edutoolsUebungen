import java.util.Scanner;

public class Main
{
    int eichhoernchen;
    int nuesse;
    int ergebnis;

    public static void main(String[] args)
    {
        new Main().start();
    }

    @SuppressWarnings("squid:S106")
    public void berechneUebriggebliebeneNuesse()
    {
        Scanner scanner = new Scanner(System.in);
        eichhoernchen = scanner.nextInt();
        nuesse = scanner.nextInt();
        ergebnis = nuesse % eichhoernchen;
        System.out.println(ergebnis);
    }

    public void start()
    {
        berechneUebriggebliebeneNuesse();
    }
}