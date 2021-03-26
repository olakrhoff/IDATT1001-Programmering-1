import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    ArrayList<Meny> menyer = new ArrayList<Meny>();
    ArrayList<Rett> retter1 = new ArrayList<Rett>();
    ArrayList<Rett> retter2 = new ArrayList<Rett>();

    retter1.add(new Rett("Sjokoladekake", "dessert", 120, "abcdefg"));
    retter1.add(new Rett("Fløtegratinertepoteter", "hovedrett", 150, "abcdefg"));

    retter2.add(new Rett("Suppe", "forrett", 50, "abcdefg"));
    retter2.add(new Rett("Fårikål", "hovedrett", 300, "abcdefg"));

    Meny meny1 = new Meny("meny1", retter1);
    Meny meny2 = new Meny("meny2", retter2);

    menyer.add(meny1);
    menyer.add(meny2);

    MenyRegister menyRegi = new MenyRegister(menyer);

    Scanner imp = new Scanner(System.in);
    boolean ferdig = false;
    while(ferdig == false)
    {
      System.out.println("Hva vil du gjøre?\n\nRegistrere en ny rett 1:\nFinne en rett ved et gitt navn 2:\nFinne alle retter av en gitt type 3:\nRegistrere en ny meny 4:\nFinne alle menyene med en totalpris innenfor et gitt intervall 5:\nAvslutte y:");
      String sjekk = imp.nextLine();

      switch (sjekk)
      {
        case "1":
          System.out.println("Hva er navnet?\nHvor slags type rett er det?\nHva er prisen?\nHva er oppskriften?\n");
          String navn = imp.nextLine();
          String type = imp.nextLine();
          String pris = imp.nextLine();
          String oppskrift = imp.nextLine();
          Rett nyRett = new Rett(navn, type, Integer.parseInt(pris), oppskrift);
          menyRegi.registrerNyRett(nyRett);
          System.out.println(nyRett.toString());
          break;

        case "2":
          System.out.println("Hva heter retten du leter etter?");
          String navnRett = imp.nextLine();
          String resultatNavn = menyRegi.finnRett(navnRett.toLowerCase());

          if (resultatNavn == "")
          {
            System.out.println("Det er ingen retter under navnet: " + navnRett);
          }
          else
          {
            System.out.println(resultatNavn);
          }
          break;

        case "3":
          System.out.println("Hvilken type rett vil du sjekke?");
          String typeSjekker = imp.nextLine();
          String[] resultatType = menyRegi.finnAlleRetterAvType(typeSjekker);
          boolean testType = false;
          for (int i = 0; i < resultatType.length; i++)
          {
            if (resultatType[i] != null)
            {
              System.out.println(resultatType[i]);
              testType = true;
            }
          }
          if (testType == false)
          {
            System.out.println("Det er ingen type måltid under kategorien: " + typeSjekker);
          }
          break;

        case "4":
          System.out.println("Registrere ny meny:\nHva skal menyen hete?\nHvor mange retter skal menyen inneholde?");
          String navnMeny = imp.nextLine();
          int antallRetter = imp.nextInt();
          if (antallRetter > menyRegi.getRetter().size())
          {
            antallRetter = menyRegi.getRetter().size();
            System.out.println("Maximalt antall retter er: " + antallRetter);
          }
          ArrayList<Rett> retterIMeny = new ArrayList<Rett>();
          int runder = 0;
          menyRegi.printRetter();
          for (int i = 0; i < antallRetter; i++)
          {
            int valg = imp.nextInt();
            retterIMeny.add(menyRegi.getRetter().get(valg - 1));
          }
          Meny nyMeny = new Meny(navnMeny, retterIMeny);
          menyRegi.registrerNyMeny(nyMeny);
          break;

        case "5":
          System.out.println("Hvilke priser vil du sjekke mellom?\nStart: \nSlutt: ");
          int start = imp.nextInt();
          int slutt = imp.nextInt();
          String[] resultatIvll = menyRegi.finnMenyPrisIntervall(start, slutt);
          boolean sjekker = false;
          for (int i = 0; i < resultatIvll.length; i++)
          {
            if (resultatIvll[i] != null)
            {
              System.out.println(resultatIvll[i].toString() + "\n");
              sjekker = true;
            }
          }
          if (sjekker == false)
          {
            System.out.println("Det var ingen menyer i det gitte prisintervallet: fra: " + start + "kr til: " + slutt + "kr\n");
          }
          break;

        case "y":
          ferdig = true;
          System.out.println("Avsluttet");
          break;

        default:
          System.out.println("\nVennligst velg en av alternativene.\n");
          break;
      }
    }
  }
}
