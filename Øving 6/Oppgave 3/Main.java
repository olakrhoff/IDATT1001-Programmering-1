import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    int timer = 4;
    int dager = 7;
    Temperatur januar = new Temperatur(nyTabell(timer, dager));
    int[][] test = januar.getTabell();
    for (int i = 0; i < timer; i++)
    {
      for (int e = 0; e < dager; e++)
      {
        System.out.print(" [ " + test[i][e] + " ] ");
      }
      System.out.println();
    }

    double[] gjen1 = januar.MiddelHverDag();
    double[] gjen2 = januar.MiddelHverTime();
    double gjen3 = januar.MiddelHeleMnd();
    int[] analyse = januar.AnalyseAvTemperatur(januar);
    System.out.println("\n Gjennomsnitts temperatur hver dag i måneden: \n");
    for (int i = 0; i < gjen1.length; i++)
    {
      int dag = i + 1;
      System.out.println("\n Gjennomsnittet på dag " + dag + " er: " + gjen1[i] + "C");
    }

    System.out.println("\n Gjennomsnitts temperatur klokka ved klokkeslett er: \n");
    for (int i = 0; i < gjen2.length; i++)
    {
      int klokkeslett = i + 1;
      System.out.println("\n Gjennomsnitts temperatur klokka " + klokkeslett + " er: " + gjen2[i] + "C");
    }

    System.out.println("\n Gjennomsnitts temperatur hele måneden er: " + gjen3 + "C");

    System.out.println("\n Analyse av gjennomsnitts temperatur til dagene:");
    System.out.println("\n Antall dager med temperatur mellom:");
    System.out.println("\n  Under -5C:       " + analyse[0]);
    System.out.println("\n  Mellom -5C & 0C: " + analyse[1]);
    System.out.println("\n  Mellom 0C & 5C:  " + analyse[2]);
    System.out.println("\n  Mellom 5C & 10C: " + analyse[3]);
    System.out.println("\n  Over 10C:        " + analyse[4]);
  }

  public static int[][] nyTabell(int timer, int dager)
  {
    int[][] tabell = new int[timer][dager];
    Random random = new Random();

    for (int i = 0; i < timer; i++)
    {
      for (int e = 0; e < dager; e++)
      {
        tabell[i][e] = random.nextInt(50) - 20;
      }
    }

    return tabell;
  }
}
