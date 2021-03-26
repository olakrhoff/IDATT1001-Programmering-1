import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Spiller a = new Spiller();
    Spiller b = new Spiller();

    int aTotalSum = 0;
    int bTotalSum = 0;

    boolean aFerdig = false;
    boolean bFerdig = false;

    while (aFerdig == false && bFerdig == false)
    {
      int aKast = a.kastTerning();
      int bKast = b.kastTerning();

      if (aKast == 1)
      {
        aTotalSum = 0;
      }
      else
      {
        aTotalSum += aKast;
      }

      if (bKast == 1)
      {
        bTotalSum = 0;
      }
      else
      {
        bTotalSum += bKast;
      }

      aFerdig = a.erFerdig(aTotalSum);
      bFerdig = b.erFerdig(bTotalSum);


      System.out.println("Spiller A: " + aTotalSum + " Spiller B: " + bTotalSum);
    }

  }
}
