import java.util.Scanner;

public class Main
{
    Scanner scanner = new Scanner(System.in);
    int auswahl = scanner.nextInt();
    @SuppressWarnings("squid:S106")
    public void auswaehlen()
    {
        switch (auswahl)
        {
            case 1:
                System.out.println("You have chosen a square");
                break;
            case 2:
                System.out.println("You have chosen a circle");
                break;
            case 3:
                System.out.println("You have chosen a triangle");
                break;
            case 4:
                System.out.println("You have chosen a rhombus");
                break;
            default:
                System.out.println("There is no such shape!");

        }

    }

    public void start()
    {
       auswaehlen();
    }

    public static void main(String[] args)
    {
        new Main().start();
    }
}