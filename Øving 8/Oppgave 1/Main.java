import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    GregorianCalendar kalender = new GregorianCalendar();
    int aar = kalender.get(java.util.Calendar.YEAR);

    Person jens = new Person("Jens", "Petrus", 1985);
    ArbTaker taker = new ArbTaker(jens, 7654, 2000, 35000, 35);

    System.out.println(taker.skatteTrekk());
    System.out.println(taker.bruttoLoonnPerAar());
    System.out.println(taker.skatteTrekkPerAar());
    System.out.println(taker.navn());
    System.out.println(taker.alder());
    System.out.println(taker.antallAarAnsatt());
    int aarAnsatt = 5;
    boolean sjekk = taker.ansattLengerEn(aarAnsatt);
    if (sjekk == true)
    {
      System.out.println("Ja, " + taker.getPersonalia().getFornavn() +  " har vært ansatt i " + aarAnsatt + " år eller lenger.");
    }
    else if (sjekk == false)
    {
      System.out.println("Nei, " + taker.getPersonalia().getFornavn() +  " har vært ansatt i mindre en " + aarAnsatt + " år.");
    }

  }
}
