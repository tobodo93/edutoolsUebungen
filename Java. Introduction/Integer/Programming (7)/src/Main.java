import java.util.Scanner;

public class Main
{
    Scanner scanner = new Scanner(System.in);
    int zahl1 = scanner.nextInt();
    int zahl2 = scanner.nextInt();
    int zahl3 = scanner.nextInt();
    int zahl4 = scanner.nextInt();
    int zahl5 = scanner.nextInt();
    int zahl6 = scanner.nextInt();


    int summeStunden;
    int summeMinuten;
    int summeSekunden;

    int ergebnisStunden;
    int ergebnisMinuten;

    public static void main(String[] args)
    {
        new Main().start();

    }

    @SuppressWarnings("squid:S106")
    public void berechneSekunden()
    {
        summeStunden = zahl4 - zahl1;
        summeMinuten = zahl5 - zahl2;
        summeSekunden = zahl6 - zahl3;

        ergebnisStunden = summeStunden * 3600;
        ergebnisMinuten = summeMinuten * 60;
        System.out.println(ergebnisStunden + ergebnisMinuten + summeSekunden);
    }

    public void start()
    {
        berechneSekunden();
    }
}