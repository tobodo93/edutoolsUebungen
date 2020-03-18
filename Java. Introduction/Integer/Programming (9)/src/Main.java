import java.util.Scanner;

public class Main
{

    Scanner scanner = new Scanner(System.in);
    int anzahlErsteGruppeSchueler = scanner.nextInt();
    int anzahlZweiteGruppeSchueler = scanner.nextInt();
    int anzahlDritteGruppeSchueler = scanner.nextInt();

    public void ueberPruefeEingabeAufRest()
    {
        if (anzahlErsteGruppeSchueler % 2 != 0)
        {
            anzahlErsteGruppeSchueler += 1;
        }
        if (anzahlZweiteGruppeSchueler % 2 != 0)
        {
            anzahlZweiteGruppeSchueler += 1;
        }
        if (anzahlDritteGruppeSchueler % 2 != 0)
        {
            anzahlDritteGruppeSchueler += 1;
        }

    }

    @SuppressWarnings("squid:S106")
    public void berechneBenoetigteSchreibtische()
    {
        ueberPruefeEingabeAufRest();
        int ergebnisSchreibTischErsteGruppe = anzahlErsteGruppeSchueler / 2;
        int ergebnisSchreibTischZweiteGruppe = anzahlZweiteGruppeSchueler / 2;
        int ergenisSchreibTischDritteGruppe = anzahlDritteGruppeSchueler / 2;

        int gesamtSchreibTische = ergebnisSchreibTischErsteGruppe + ergebnisSchreibTischZweiteGruppe + ergenisSchreibTischDritteGruppe;

        System.out.println(gesamtSchreibTische);


    }

    public static void main(String[] args)
    {
        new Main().start();

    }

    private void start()
    {
        berechneBenoetigteSchreibtische();

    }
}