import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    ArrayList<Arrangement> argss = new ArrayList<Arrangement>();
    argss.add(new Arrangement(2345, "Ola", "Svarstad", "Olgaa", "Bryllup", 202005052000L));
    argss.add(new Arrangement(2346, "Ola", "Svarstad", "Olga", "Dåp", 202005052100L));
    argss.add(new Arrangement(2347, "Ola", "Kvelde", "Olga", "Bryllup", 202005051900L));
    argss.add(new Arrangement(2348, "Ola", "Kvelde", "Olga", "Konfirmasjon", 202005051800L));
    argss.add(new Arrangement(2349, "Ola", "Abelsgate", "Olga", "Konfirmasjon", 202005051100L));
    argss.add(new Arrangement(2350, "Ola", "Abelsgate", "Olga", "Dåp", 202005051800L));
    ArrangementRegister register = new ArrangementRegister(argss);
    ArrangementRegister kake = new ArrangementRegister(argss);
    Scanner imp = new Scanner(System.in);
    boolean ferdig = false;
    while(ferdig == false)
    {
      System.out.println("Hva vil du gjøre?\n\nOpprette et arrangement 1:\nFinne arrangement på et gitt sted 2:\nFinne arrangementer ved et gitt tidspunkt 3:\nFinne arrangementer i et gitt intervall 4:\nSe sortert liste over alle arrangementer 5:\nAvslutte y:");
      String sjekk = imp.nextLine();

      switch (sjekk)
      {
        case "1":
          System.out.println("Hva er navnet?\nHvor er stedet?\nHvem er arrangøren?\nHva slags type arrangement er det?\nNår er det? (YYYYMMDDHHMM)");
          String navn = imp.nextLine();
          String sted = imp.nextLine();
          String arrangoor = imp.nextLine();
          String type = imp.nextLine();
          String tidspunkt = imp.nextLine();
          Arrangement nyttArg = new Arrangement(1234, navn, sted, arrangoor, type, Long.parseLong(tidspunkt));
          kake.registrerNyttArg(nyttArg);
          System.out.println(nyttArg.toString());
          break;

        case "2":
          System.out.println("Hvor vil du sjekke?");
          String sted1 = imp.nextLine();
          String[] resultatSted = kake.finnArgVedSted(sted1.toLowerCase());
          boolean test = false;
          for (int i = 0; i < resultatSted.length; i++)
          {
            if (resultatSted[i] != null)
            {
              System.out.println(resultatSted[i]);
              test = true;
            }
          }
          if (test == false)
          {
            System.out.println("Det er ingen arrangementer på/i: " + sted1);
          }
          break;

        case "3":
          System.out.println("Hvilken dato vil du sjekke? (YYYYMMDD)");
          String dag = imp.nextLine();
          long inpu = Long.parseLong(dag);
          String[] resultatDato = kake.finnArgPaaGittDato(inpu);

          if (resultatDato[0] != null)
          {
            for (int i = 0; i < resultatDato.length; i++)
            {
              System.out.println(resultatDato[i].toString() + "\n");
            }
          }
          else if (resultatDato[0] == null)
          {
            System.out.println("Det er ingen arrangementer på denne datoen: " + dag);
          }
          break;

          case "4":
            System.out.println("Hvilke datoer vil du sjekke mellom?\nStart: (YYYYMMDD)\nSlutt: (YYYYMMDD)");
            String start = imp.nextLine();
            String slutt = imp.nextLine();
            String[] resultatIvll = kake.finnArgIIntervall(Long.parseLong(start), Long.parseLong(slutt));
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
              System.out.println("Det var ingen arrangementer i det gitte intervallet: fra: " + start + " til: " + slutt);
            }
            break;

          case "5":
            System.out.println("Sortert liste over arrangementer:\n");
            kake.sorterNaa();
            for (int i = 0; i < kake.getArrangementer().size(); i++)
            {
              System.out.println(kake.getArrangementer().get(i).toString() + "\n");
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
