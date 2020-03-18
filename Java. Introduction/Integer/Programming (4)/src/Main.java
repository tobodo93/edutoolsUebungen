import java.util.Scanner;

public class Main
{
    int zahl1;
    int ergebnis;

    public static void main(String[] args)
    {
        new Main().start();

    }

    @SuppressWarnings("squid:S106")
    public void ausgabeErsteZiffer()
    {
        Scanner scanner = new Scanner(System.in);
        zahl1 = scanner.nextInt();
        ergebnis = (zahl1 / 10) % 10;
        System.out.println(ergebnis);

    }

    public void start()
    {
        ausgabeErsteZiffer();
    }

}