import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    boolean avslutt = false;
    Scanner imp = new Scanner(System.in);

    while (avslutt == false)
    {
      System.out.println("Tast inn en tekst eller tast inn '4' for å avslutte");

      String input = imp.nextLine();

      switch (input)
      {
        case "4":
          avslutt = true;
          System.out.println("Avsluttet");
          break;

        default:
          Tekstanalyse analyse = new Tekstanalyse(input);
          System.out.println();
          analyse.getAntallForskjelligeBokstaver();
          analyse.getTotalAntallBokstaver();
          analyse.getProsetIkkeBokstaver();
          analyse.getBestemtBokstav('e');
          analyse.getForekommerMest();
          break;
      }
      System.out.println();


    }
  }
}
