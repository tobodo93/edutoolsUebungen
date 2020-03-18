import java.util.Scanner;

public class Main
{
    Scanner scanner = new Scanner(System.in);

    int zaehler = 0;
    int ergebnisAnzahlZahlen;
    public int berechneAnzahlZahlenBis0()
    {
        while (scanner.nextInt() != 0)
        {
            zaehler++;
        }
        return zaehler;
    }

    @SuppressWarnings("squid:S106")
    public void ausgabeAnzahl(int zaehler)
    {
        System.out.println(zaehler);
    }

    public void start()
    {
        ergebnisAnzahlZahlen = berechneAnzahlZahlenBis0();
        ausgabeAnzahl(zaehler);
    }

    public static void main(String[] args)
    {
        new Main().start();

    }
}