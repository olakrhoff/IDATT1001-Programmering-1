import java.util.*;

/**
*Klassen Main
* @version 1.01 2019-11-07
* @author Ola Kristoffer Hoff
*/

class Main
{
  public static void main(String[] args)
  {
    EiendomsRegister register = new EiendomsRegister();
    Eiendom eiendom1 = new Eiendom(1445, "Gloppen", 77, 631, "0", 1017.6, "Jens Olsen");
    Eiendom eiendom2 = new Eiendom(1445, "Gloppen", 77, 131, "Syningom", 661.3, "Nicolay Madsen");
    Eiendom eiendom3 = new Eiendom(1445, "Gloppen", 75, 19, "Fugletun", 650.6, "Evilyn Jensen");
    Eiendom eiendom4 = new Eiendom(1445, "Gloppen", 74, 188, "0", 1457.2, "Karl Ove Bråten");
    Eiendom eiendom5 = new Eiendom(1445, "Gloppen", 69, 47, "Høiberg", 1339.4, "Elsa Indregård");
    register.registrerEiendom(eiendom1);
    register.registrerEiendom(eiendom2);
    register.registrerEiendom(eiendom3);
    register.registrerEiendom(eiendom4);
    register.registrerEiendom(eiendom5);

    boolean fortsett = true;
    while(fortsett)
    {
      System.out.println("\n***** Property Register Application v0.1 *****\n");
      System.out.println("1: Registrer eiendom");
      System.out.println("2: List alle eiendommer");
      System.out.println("3: Søk etter eiendom med gitt unik tomt-ID");
      System.out.println("4: Gjennomsnittlige areal");
      System.out.println("5: Slett en eiendom");
      System.out.println("6: Antall eiendommer");
      System.out.println("7: Søk etter eiendom med gitt kommunenummer");
      System.out.println("8: Søk etter eiendom med gitt gårdsnummer");
      System.out.println("9: Søk etter eiendom med gitt bruksnummer");
      System.out.println("10: Quit");
      System.out.println("\nVelg et tall mellom 1 og 9.\n");

      Scanner sc = new Scanner(System.in);

      String menuChoice = sc.nextLine();


      switch (menuChoice)
      {
        case "1":
          System.out.println("\nSkriv inn følgende informasjon:\nKommunenummer:\nKommunenavn:\nGårdsnummer:\nBruksnummer:\nBruksnavn: (Hvis ikke eiendommen har et bruksnummer skriv: 0)\nAreal:\nEiendomseiers navn:");
          String kommuneNummer = sc.nextLine();
          String kommuneNavn = sc.nextLine();
          String gaardsNummer = sc.nextLine();
          String bruksNummer = sc.nextLine();
          String bruksNavn = sc.nextLine();
          String areal = sc.nextLine();
          String eiendomseiersNavn = sc.nextLine();

          Eiendom nyEiendom = new Eiendom(Integer.parseInt(kommuneNummer), kommuneNavn, Integer.parseInt(gaardsNummer), Integer.parseInt(bruksNummer), bruksNavn, Double.parseDouble(areal), eiendomseiersNavn);
          if (register.registrerEiendom(nyEiendom))
          {
            System.out.println("Eiendom lagt til i register!");
            break;
          }
          else
          {
            System.out.println("Eiendom ikke lagt til i register!");
            break;
          }

        case "2":
          System.out.println(register.toString());
          break;

        case "3":
          System.out.println("\nSkriv inn kommunenummer, gårdsnummer og bruksnummer: (kommunenr-gnr/bnr)");
          String kommunenrGnrBnr = sc.nextLine();
          System.out.println(register.finnEiendomMedKommunenrGnrBnr(kommunenrGnrBnr));
          break;

        case "4":
          System.out.println(register.snittArealIRegisteret() + " kvadratmeter");
          break;

        case "5":
          System.out.println("Skriv inn den unike-ID'en til eiendommen du vil slette");
          String unikID = sc.nextLine();
          if (register.slettEiendom(unikID))
          {
            System.out.println("Eiendom slettet!");
          }
          else
          {
            System.out.println("Eiendomen eksisterer ikke!");
          }
          break;

        case "6":
          System.out.println(register.antallEiendomer());
          break;

        case "7":
          System.out.println("\nSkriv inn kommunenummer");
          String Knummer = sc.nextLine();
          System.out.println(register.finnEiendomMedKnr(Integer.parseInt(Knummer)));
          break;

        case "8":
          System.out.println("\nSkriv inn gårdsnummer");
          String Gnummer = sc.nextLine();
          System.out.println(register.finnEiendomMedGnr(Integer.parseInt(Gnummer)));
          break;

        case "9":
          System.out.println("\nSkriv inn bruksnummer");
          String Bnummer = sc.nextLine();
          System.out.println(register.finnEiendomMedBnr(Integer.parseInt(Bnummer)));
          break;

        case "10":
          fortsett = false;
          System.out.println("Avsluttet");
          break;

        default:
          System.out.println("Du må velge et tall mellom 1 og 9");
          break;
      }
    }
  }
}

//Oppgave 5 besvarelse
//Som vi ser i klassediagramet så kan vi få en grei oversikt over at programet er relativt "loose coupled".
//Det vil si at de forskjellige klassene avhengetr minimalt av hverandre og man kan endre på det meste innad
//i en klasse uten at det påvirker de andre. Vi ser også at vi ikke har unødvendige koblinger som f. eks. mellom
//Main klassen og Eiendom, siden Eiendom er koblet til EiendomsRegister og EiendomsRegisterer koblet til Main trenger
//vi da ikke en kobling mellom Eiendom og Main, ergo vi har lav kobling. Hvis vi ser på motodene til klassene også
//så er det ikke noe overlapping av funksjonalitet og vi har dermed ikke skrevet samme koden flere steder,
//ergo vi har høy samstemthet.
