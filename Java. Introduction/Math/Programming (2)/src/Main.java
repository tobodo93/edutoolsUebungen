import java.util.Scanner;

public class Main
{
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    double p;
    double s;

    public static void main(String[] args)
    {

        new Main().start();
    }

    public void start()
    {
        berechneFlaecheDreieck();
    }

    @SuppressWarnings("squid:S106")
    public void berechneFlaecheDreieck()
    {
        p = (a + b + c) / 2;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(s);
    }
}