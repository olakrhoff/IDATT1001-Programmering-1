import java.util.*;
import java.time.*;


public class Main
{
  public static void main (String[] args)
  {

for (int i = 0; i < 10; i++)
{
    System.out.println();
    System.out.println("Velg valuta:");
    System.out.println();
    System.out.println("1: Dollar");
    System.out.println("2: Euro");
    System.out.println("3: Svenske Kroner");
    System.out.println("4: Avslutt");


    Scanner imp = new Scanner(System.in);
    String inpu = imp.nextLine();

    switch (inpu)
    {
      //Logikk for NOK og USD
      case "1":
        i = 0;
        System.out.println();
        System.out.println("1: NOK --> USD");
        System.out.println("2: USD --> NOK");
        String dolInpu = imp.nextLine();

        switch (dolInpu)
        {
          case "1":
            System.out.println();
            System.out.println("Hvor mange norske kroner vil du konvertere?");
            Double dolAns = imp.nextDouble();
            System.out.println();
            Valuta dolVal = new Valuta(inpu, dolAns);
            String ret0 = dolVal.nokToVal();
            System.out.println(dolAns + " NOK er lik " + ret0 + " USD");

            break;

          case "2":
            System.out.println();
            System.out.println("Hvor mange amerikanske dollar vil du konvertere?");
            Double ndolAns = imp.nextDouble();
            System.out.println();
            Valuta ndolVal = new Valuta(inpu, ndolAns);
            String ret1 = ndolVal.valToNOK();
            System.out.println(ndolAns + " USD er lik " + ret1 + " NOK");

            break;
        }
        break;
      //Logikk for NOK og EUR
      case "2":
        i = 0;
        System.out.println();
        System.out.println("1: NOK --> EUR");
        System.out.println("2: EUR --> NOK");
        String eurInpu = imp.nextLine();

        switch (eurInpu)
        {
          case "1":
            System.out.println();
            System.out.println("Hvor mange norske kroner vil du konvertere?");
            Double eurAns = imp.nextDouble();
            System.out.println();
            Valuta eurVal = new Valuta(inpu, eurAns);
            String ret3 = eurVal.nokToVal();
            System.out.println(eurAns + " NOK er lik " + ret3 + " EUR");

            break;

          case "2":
            System.out.println();
            System.out.println("Hvor mange euro vil du konvertere?");
            Double neurAns = imp.nextDouble();
            System.out.println();
            Valuta neurVal = new Valuta(inpu, neurAns);
            String ret4 = neurVal.valToNOK();
            System.out.println(neurAns + " EUR er lik " + ret4 + " NOK");

            break;
        }
        break;
      //Logikk for NOK og SEK
      case "3":
        i = 0;
        System.out.println();
        System.out.println("1: NOK --> SEK");
        System.out.println("2: SEK --> NOK");
        String sekInpu = imp.nextLine();

        switch (sekInpu)
        {
          case "1":
            System.out.println();
            System.out.println("Hvor mange norske kroner vil du konvertere?");
            Double sekAns = imp.nextDouble();
            System.out.println();
            Valuta sekVal = new Valuta(inpu, sekAns);
            String ret5 = sekVal.nokToVal();
            System.out.println(sekAns + " NOK er lik " + ret5 + " SEK");

          break;

          case "2":
          System.out.println();
          System.out.println("Hvor mange svenske kroner vil du konvertere?");
          Double nsekAns = imp.nextDouble();
          System.out.println();
          Valuta nsekVal = new Valuta(inpu, nsekAns);
          String ret6 = nsekVal.valToNOK();
          System.out.println(nsekAns + " SEK er lik " + ret6 + " NOK");

          break;
        }
        break;
      //Logikk for å avslutte
      case "4":
        i = 100;
        System.out.println();
        System.out.println("Avsluttet");
        break;
    }
  }


  }
}
