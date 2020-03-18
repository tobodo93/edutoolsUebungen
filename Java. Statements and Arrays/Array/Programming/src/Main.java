import java.util.Scanner;

public class Main
{
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[] zahlen = new int[size];


    public void auslesenArray()
    {
        for (int i = 0; i < size; i++)
        {
            zahlen[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean condition = false;
        for (int i = 0; i < size; i++)
        {
             if(i+1 <size)
             {
                 if((zahlen[i]==n && zahlen[i+1]==m)||(zahlen[i]==m && zahlen[i+1]==n))
                 {
                     condition = true;
                 }
             }
        }
        System.out.println(condition);
    }

    public static void main(String[] args)
    {
       new Main().start();
    }
    public void start()
    {
        auslesenArray();
    }
}