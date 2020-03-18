import java.util.Scanner;

public class Main
{

    Scanner scanner = new Scanner(System.in);
    int empfholenerMindestSchlaf = scanner.nextInt();
    int ueberSchlaf = scanner.nextInt();
    int annSchlaf = scanner.nextInt();
    @SuppressWarnings("squid:S106")
    public void berechneSchlaf()
    {
        if (annSchlaf >= empfholenerMindestSchlaf && annSchlaf <= ueberSchlaf)
        {
            System.out.println("Normal");
        }
        else if (annSchlaf < empfholenerMindestSchlaf)
        {
            System.out.println("Deficiency");
        }
        else
        {
            System.out.println("Excess");
        }

    }

    public void start()
    {
        berechneSchlaf();
    }

    public static void main(String[] args)
    {
        new Main().start();
    }
}