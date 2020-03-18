import java.util.Scanner;

public class Main
{

    public void bestimmeIndexVonMaximumElement()
    {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int index = 0;
        int max = 0;
        for (int i = 0; i < size; i++)
        {
            array[i] = scanner.nextInt();
        }
        if (array.length != 1)
        {
            for (int i = 0; i < size; i++)
            {
                if (array[i] > max)
                {
                    max = array[i];
                    index = i;
                }
            }
            System.out.println(index);
        }

    }

    public static void main(String[] args)
    {
        new Main().start();
    }

    public void start()
    {
        bestimmeIndexVonMaximumElement();
    }
}