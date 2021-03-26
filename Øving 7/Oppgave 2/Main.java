import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    String kake = "Kake er super kake godt. Synes ikke du? Jeg gjør det! Eller hva?";
    TekstBehandling test = new TekstBehandling(kake);

    System.out.println(test.getTekstiStoreBokstaver());
    System.out.println(test.antallOrd());
    System.out.println(test.gjennomsittligOrdLenge());
    System.out.println(test.gjennomsittOrdPerSetning());
    System.out.println(test.ordErstratter("kake", "banankake"));
  }
}
