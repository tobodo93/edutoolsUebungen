import java.util.Scanner;

public class Main
{
    Scanner scanner = new Scanner(System.in);
    String auswahl = scanner.next();

    double s;
    double ergebnisFlaeche;
    double ergebnisRectangle;
    double ergebnisRadius;
    double pi = 3.14;

     @SuppressWarnings("squid:S106")
    public void berechneFleache()
    {
        switch (auswahl)
        {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                s = (a + b + c) / 2;
                ergebnisFlaeche = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println(ergebnisFlaeche);
                break;
            case "rectangle":
                double a2 = scanner.nextDouble();
                double b2= scanner.nextDouble();
                ergebnisRectangle = a2 * b2;
                System.out.println(ergebnisRectangle);
                break;
            case "circle":
                double r = scanner.nextDouble();
                ergebnisRadius = pi * Math.pow(r, 2);
                System.out.println(ergebnisRadius);
                break;
            default:


        }
    }

    public void start()
    {
        berechneFleache();
    }

    public static void main(String[] args)
    {
        new Main().start();
    }
}