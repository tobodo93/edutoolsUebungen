import java.util.Scanner;

public class Main
{

    Scanner scanner = new Scanner(System.in);
    int pfahlHoehe = scanner.nextInt();
    int hochgegangerWeg = scanner.nextInt();
    int herarbgeangenerWeg = scanner.nextInt();
    int gebrauchteTage;
    @SuppressWarnings("squid:S106")
    public void berechneBenoetigteTageFuerPfahlHoehe()
    {
        for (gebrauchteTage = 1; pfahlHoehe != 0; gebrauchteTage++)
        {
            pfahlHoehe -= hochgegangerWeg;
            if (pfahlHoehe == 0 || pfahlHoehe < 0)
            {
                break;

            }
            else
            {
                pfahlHoehe += herarbgeangenerWeg;
            }

        }

        System.out.println(gebrauchteTage);
    }

    public static void main(String[] args)
    {
        new Main().startDerMehtode();

    }

    public void startDerMehtode()
    {
        berechneBenoetigteTageFuerPfahlHoehe();

    }
}