import java.util.Scanner;

class Application
{
    String application = "SimpleApplication";

    public Application(String application)
    {
        this.application = application;
    }

    void ausgabeDerZeichenKette()
    {
        Scanner scanner = new Scanner(System.in);
        String[] zeichenKette = new String[20];
        for (int i = 0; i < zeichenKette.length; i++)
        {
            String wort = scanner.next();
            zeichenKette[i]= wort;
        }
        System.out.println(zeichenKette);
    }

    public void main(String[] args)
    {
        System.out.println(application);
        ausgabeDerZeichenKette();

    }
}