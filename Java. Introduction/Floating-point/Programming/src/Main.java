import java.util.Scanner;

public class Main
{

    Scanner scanner = new Scanner(System.in);
    double milen = scanner.nextInt();
    double fahrZeit = scanner.nextInt();

    @SuppressWarnings("squid:S106")
    public void berechneDurchschnittGeschwindigkeit()
    {
        double durchschnittgeschwindigkeit = milen / fahrZeit;
        System.out.println(durchschnittgeschwindigkeit);
    }

    public static void main(String[] args)
    {
        new Main().start();
    }

    public void start()
    {
        berechneDurchschnittGeschwindigkeit();
    }
}