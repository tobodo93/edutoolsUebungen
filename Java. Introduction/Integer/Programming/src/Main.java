import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        new Main().start();
    }

    @SuppressWarnings("squid:S106")
    public void berechneFunktion()
    {
        Scanner scanner = new Scanner(System.in);
        int zahl1 = scanner.nextInt();
        int ergebnis = ((zahl1 + 1) * zahl1 + 2) * zahl1 + 3;
        System.out.println(ergebnis);
    }

    public void start()
    {
        berechneFunktion();
    }
}