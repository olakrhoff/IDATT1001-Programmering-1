import java.util.*;

class MinRandom
{
  private Random random = new Random();

  public void nesteHeltall(int nedre, int ovre)
  {
    int diff = ovre - nedre;
    int kake = random.nextInt(diff) + nedre;

    System.out.print(" " + kake + " ");
  }

  public void nesteDesimaltall(double nedre, double ovre)
  {
    double diff = ovre - nedre;
    double kake = random.nextDouble() * diff + nedre;

    System.out.print(" " + kake);
  }
}
