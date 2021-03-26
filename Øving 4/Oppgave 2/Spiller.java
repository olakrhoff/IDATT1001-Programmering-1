import java.util.*;

class Spiller
{
  private int sumPoeng;

  java.util.Random terning = new java.util.Random();

  public Spiller()
  {

  }

  public int getSumPoeng(int kast)
  {
    return kast;
  }

  public int kastTerning()
  {
    int terningkast = terning.nextInt(6) + 1;

    return terningkast;
  }

  public boolean erFerdig(int totalSum)
  {
    if (totalSum >= 100)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}
