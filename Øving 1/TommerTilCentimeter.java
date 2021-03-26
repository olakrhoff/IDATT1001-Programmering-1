import java.util.Scanner;

class TommerTilCentimeter
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Hvor mange tommer?");
    double inp = in.nextDouble();
    double ans = inp * 2.54;


    System.out.println(inp + " tomme(r) er lik " + ans + " cm");
  }
}
