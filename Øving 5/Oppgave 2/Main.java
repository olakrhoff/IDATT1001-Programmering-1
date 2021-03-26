import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    MinRandom test = new MinRandom();

    for (int i = 0; i < 10; i++)
    {
      test.nesteHeltall(40, 50);
      System.out.println();
      test.nesteDesimaltall(0, 15);
    }
  }
}
