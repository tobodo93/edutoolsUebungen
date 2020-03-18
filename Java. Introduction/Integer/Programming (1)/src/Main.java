import java.util.Scanner;

public class Main
{
    Scanner scanner = new Scanner(System.in);
    int anzahlEichhoernchen;
    int anzahlNuesse;
    int anzahlNuesseJeEichhoernchen;
    public int eingabeEichHoernchen()
    {
        anzahlEichhoernchen = scanner.nextInt();
        return anzahlEichhoernchen;
    }
    public int eingabeNuesse()
    {
        anzahlNuesse = scanner.nextInt();
        return anzahlNuesse;
    }

    public int berechneNuesseJeEichhoernchen(int eichhoernchen, int nuesse)
    {
        anzahlNuesseJeEichhoernchen = nuesse / eichhoernchen;
        return anzahlNuesseJeEichhoernchen;
    }

    @SuppressWarnings("squid:S106")
    public void ausgabeDer(int anzahlNuesseJeEichhoernchen)
    {
        System.out.println(anzahlNuesseJeEichhoernchen);
    }

    public void startenDerMethoden()
    {
        anzahlEichhoernchen = eingabeEichHoernchen();
        anzahlNuesse= eingabeNuesse();
        anzahlNuesseJeEichhoernchen = berechneNuesseJeEichhoernchen(anzahlEichhoernchen, anzahlNuesse);
        ausgabeDer(anzahlNuesseJeEichhoernchen);
    }

    public static void main(String[] args)
    {
        new Main().startenDerMethoden();
    }
}