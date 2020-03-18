import java.util.Scanner;

public class Main
{
    Scanner scanner = new Scanner(System.in);
    int xWertErsteQueen = scanner.nextInt();
    int yWertErsteQueen = scanner.nextInt();
    int xWertZweiteQueen = scanner.nextInt();
    int yWerrZweiteQueen = scanner.nextInt();
    @SuppressWarnings("squid:S106")
    public void bestimmeObDamenSichtreffen()
    {
      if(xWertErsteQueen == xWertZweiteQueen || yWertErsteQueen == yWerrZweiteQueen)
      {
        System.out.println("YES");
      } else if (Math.abs(xWertErsteQueen- xWertZweiteQueen) == Math.abs(yWertErsteQueen-yWerrZweiteQueen))
      {
           System.out.println("YES");
      }
      else
        {
            System.out.println("NO");
        }

    }

    public void start()
    {
       bestimmeObDamenSichtreffen();
    }

    public static void main(String[] args)
    {
       new Main().start();
    }

}