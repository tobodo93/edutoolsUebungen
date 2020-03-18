import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        new Main().start();
    }

    public void start()
    {
        zahlenTauschen();
    }

    @SuppressWarnings("squid:S106")
    public void zahlenTauschen()
    {
        Scanner scanner = new Scanner(System.in);
        int zahl1 = scanner.nextInt();
        int zahl2 = scanner.nextInt();

        System.out.println(zahl2 + " " + zahl1);
    }
}