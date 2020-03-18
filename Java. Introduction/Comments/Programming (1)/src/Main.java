public class Main
{

    public static void main(String[] args)
    {

        new Main().start();
    }

    @SuppressWarnings("squid:S106")
    public void ausgabe()
    {
        System.out.print("Hello, ");
        System.out.print("Java");
        System.out.print(" platform");
    }

    public void start()
    {
        ausgabe();
    }
}