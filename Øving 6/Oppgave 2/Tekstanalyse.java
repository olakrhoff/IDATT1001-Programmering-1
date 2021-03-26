import java.util.*;

class Tekstanalyse
{
  private int[] antallTegn = new int[30];
  public char[] alfabetLiten = "abcdefghijklmnopqrstuvwxyzæøå".toCharArray();
  public char[] alfabetStor = "ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ".toCharArray();
  private int lengdeInput;
  
  public Tekstanalyse(String userInput)
  {
    lengdeInput = userInput.length();
    char[] lengde = userInput.toCharArray();
    boolean bokstav = false;
    for (int i = 0; i < lengde.length; i++)
    {
      bokstav = false;

      for (int e = 0; e < 29; e++)
      {
        if (userInput.charAt(i) == alfabetLiten[e])
        {
          bokstav = true;
          antallTegn[e]++;
        }
        else if (userInput.charAt(i) == alfabetStor[e])
        {
          bokstav = true;
          antallTegn[e]++;
        }
      }
      if (bokstav == false)
      {
        antallTegn[29]++;
      }
    }
  }

  public void getAntallForskjelligeBokstaver()
  {
    int antallForskjellige = 0;

    for (int i = 0; i < this.antallTegn.length - 1; i++)
    {
      if (this.antallTegn[i] != 0)
      {
        antallForskjellige++;
      }
    }
    System.out.println("Antall forskjellige bokstaver i teksten er: " + antallForskjellige);
    System.out.println();
  }

  public int getTotalAntallBokstaver()
  {
    int totalAntall = 0;

    for (int i = 0; i < this.antallTegn.length - 1; i++)
    {
      totalAntall += this.antallTegn[i];
    }
    System.out.println("Totalt antall bokstaver i teksten er: " + totalAntall);
    System.out.println();

    return totalAntall;
  }

  public void getProsetIkkeBokstaver()
  {
    int antallIkkeBokstaver = this.antallTegn[29];
    int prosent = antallIkkeBokstaver * 100 / this.lengdeInput;

    System.out.println("Prosent andelen ikke-bokstaver utgjør er: " + prosent + "%");
    System.out.println();
  }

  public void getBestemtBokstav(char bokstav)
  {
    int antallAvGittBokstav = 0;
    for (int i = 0; i < alfabetLiten.length; i++)
    {
      if (bokstav == alfabetLiten[i] || bokstav == alfabetStor[i])
      {
        antallAvGittBokstav = this.antallTegn[i];
      }
    }
    System.out.println("Antall " + bokstav + "'er i teksen er lik: " + antallAvGittBokstav);
    System.out.println();
  }

  public void getForekommerMest()
  {
    int høyesteVerdi = 0;
    int eier = 30;
    int[] vinnere = new int[29];
    for (int i = 0; i < antallTegn.length - 1; i++)
    {
      if (antallTegn[i] > høyesteVerdi)
      {
        høyesteVerdi = antallTegn[i];
        eier = i;
      }
    }
    vinnere[eier] = 1;

    for (int i = 0; i < antallTegn.length - 1; i++)
    {
      if (antallTegn[i] == høyesteVerdi && i != eier)
      {
        vinnere[i] = 1;
      }
    }

    for (int i = 0; i < vinnere.length; i++)
    {
      if (vinnere[i] == 1)
      {
        System.out.println("'" + alfabetLiten[i] + "' forekom flest ganger, med et antall på: " + this.antallTegn[i]);
      }
    }
    System.out.println();
  }
}
