import java.util.*;

class MultiTabell
{
    public static void main(String[] args)
    {
      Scanner imp = new Scanner(System.in);
      System.out.println("Hvilken gange vil du ha fra?");
      int gang = imp.nextInt();

      System.out.println("Hvilken gange vil du ha til?");
      int til = imp.nextInt();


      for (int i = gang; i <= til; i++)
      {
        for (int e = 0; e <= 10; e++)
        {
          int sum = e * i;
          System.out.println(i + " x " + e + " = " + sum);
        }
        System.out.println();
      }

    }
}
