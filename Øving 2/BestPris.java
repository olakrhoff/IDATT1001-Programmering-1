import java.util.*;

class BestPris
{
  public static void main(String[] args)
  {
      Double aVekt = 0.450;
      Double aPris = 35.90;
      Double bVekt = 0.500;
      Double bPris = 39.50;

      Compare(Kilopris(aVekt, aPris), Kilopris(bVekt, bPris));

  }
public static Double Kilopris(Double vekt, Double pris)
{
  Double kp = pris / vekt;

  return kp;
}

public static void Compare(Double a, Double b)
{
  if (a > b)
  {
    System.out.println("B er billigere!");
  }
  else if (a < b)
  {
    System.out.println("A er billigere!");
  }
  else if (a == b)
  {
    System.out.println("Kiloprisen er lik.");
  }
}

}
