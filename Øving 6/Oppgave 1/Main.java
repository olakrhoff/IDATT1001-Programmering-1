import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Random random = new Random();
    int[] antall = new int[10];

    for (int i = 0; i < 10000; i++)
    {
      int tall = random.nextInt(10);
      antall[tall]++;
    }

    for (int i = 0; i < antall.length; i++)
    {
      System.out.println("Antall " + i + "'ere er lik: " + antall[i]);
    }

  }
}
