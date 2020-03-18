import java.util.Scanner;

public class Main
{
    Scanner scanner = new Scanner(System.in);
    int zahl1 = scanner.nextInt();

    public static void main(String[] args)
    {
        new Main().start();
    }

    @SuppressWarnings("squid:S106")
    public void bestimmeFolgendeGreadeZahl()
    {

        zahl1 += 1;
        if (zahl1 % 2 != 0)
        {
            zahl1 += 1;
        }
        System.out.println(zahl1);

    }

    public void start()
    {
        bestimmeFolgendeGreadeZahl();
    }
}