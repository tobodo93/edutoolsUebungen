import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  Scanner scanner = new Scanner(System.in);
  List<String> list = new ArrayList<>();
  public static void main(String[] args)
  {
    //put your code here
  }
  public void readString()
  {

    while(scanner.hasNext())
    {
      list.add(scanner.next());
    }
    System.out.println(list);
  }
}