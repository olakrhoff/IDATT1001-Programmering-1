import java.util.*;
import javax.swing.*;

class MenyStyrt
{
  public static void main(String[] args)
  {
    GregorianCalendar kalender = new GregorianCalendar();
    int aar = kalender.get(java.util.Calendar.YEAR);

    Person jens = new Person("Jens", "Petrus", 1985);
    ArbTaker taker = new ArbTaker(jens, 7654, 2000, 35000, 35);

    Scanner read = new Scanner(System.in);
    Scanner readInt = new Scanner(System.in);
    boolean ferdig = false;
    while (ferdig == false)
    {
      System.out.println("Hva vil du endre på? \nFornavn       1: \nEtternavn     2: \nMånedslønn    3: \nSkatteprosent 4: \nAvslutt       5:");
      System.out.println("Nåværende informasjon: " + taker.navn() + " " + taker.getMaanedsLoonn() + "kr " + taker.getSkatteProsent() + "%");
      String input = read.nextLine();
      switch(input)
      {
        case "1":
          System.out.println("Hva vil du endre fornavnet til?");
          String endreFornavn = read.nextLine();

          taker.getPersonalia().setFornavn(endreFornavn);
          System.out.println("\n\n");
          break;

        case "2":
          System.out.println("Hva vil du endre etternavnet til?");
          String endreEtternavn = read.nextLine();

          taker.getPersonalia().setEtternavn(endreEtternavn);
          System.out.println("\n\n");
          break;

        case "3":
          System.out.println("Hva vil du endre månedslønnen til?");
          int endreMaanedsloon = readInt.nextInt();

          taker.setMaanedsLoon(endreMaanedsloon);
          System.out.println("\n\n");
          break;

        case "4":
          System.out.println("Hva vil du endre skatteprosenten til?");
          int endreSkatteprosent = readInt.nextInt();

          taker.setSkatteProsent(endreSkatteprosent);
          System.out.println("\n\n");
          break;

        case "5":
          ferdig = true;
          System.out.println("Avsluttet");
          break;

        default:
          break;
      }
    }
  }
}
