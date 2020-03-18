import java.util.Scanner;

public class Main
{
    Scanner scanner = new Scanner(System.in);
    double ersterVektor = scanner.nextDouble();
    double ersterVektor2teZahl = scanner.nextDouble();
    double zweiterVektor = scanner.nextDouble();
    double zweiterVektor2teZahl = scanner.nextDouble();
    double winkelErgebnisObererTeil;
    double winkelErgebnisUntererTeil;
    double winkelErgebnisUntenZweiterTeil;
    double winkelEndErgebnis;

    public static void main(String[] args)
    {
        new Main().start();
    }

    @SuppressWarnings("squid:S106")
    public void berechneWinkel()
    {
        winkelErgebnisObererTeil = ersterVektor * zweiterVektor + ersterVektor2teZahl * zweiterVektor2teZahl;
        winkelErgebnisUntererTeil = Math.sqrt(Math.pow(ersterVektor, 2) + Math.pow(ersterVektor2teZahl, 2));
        winkelErgebnisUntenZweiterTeil = Math.sqrt(Math.pow(zweiterVektor, 2) + Math.pow(zweiterVektor2teZahl, 2));
        winkelEndErgebnis = Math.acos(winkelErgebnisObererTeil / (winkelErgebnisUntererTeil * winkelErgebnisUntenZweiterTeil));
        System.out.println((int) Math.toDegrees(winkelEndErgebnis));
    }

    public void start()
    {
        berechneWinkel();
    }
}

