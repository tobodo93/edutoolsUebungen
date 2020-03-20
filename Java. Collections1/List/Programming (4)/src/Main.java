import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public void readInTheNumbers() {
        List<Integer> numberList = new ArrayList<>();
        while (scanner.hasNextInt()) {
            numberList.add(scanner.nextInt());


        }
        for (int i = numberList.size() - 1; i >= 0; i--)
        {
            if (i % 2 != 0) {
                System.out.print(numberList.get(i) + " ");
            }
        }
    }


    public static void main(String[] args) {
        new Main().readInTheNumbers();
    }
}