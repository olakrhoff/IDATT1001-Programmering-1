import java.util.*;

/**
*Klassen EiendomsRegister
*@version 1.01 2019-11-07
*@author Ola Kristoffer Hoff
*/

class EiendomsRegister
{
  /**
  *Her deklareres objektvariablene
  *Her brukes en ArrayList pga. de innebakte metodene og den lettere manipulasjonen av tabellen.
  */
  private ArrayList<Eiendom> _eiendommer;

  /**
  * Lager en tom konstruktør som oppretter et objekt av typen EiendomRegister
  */
  public EiendomsRegister()
  {
    this._eiendommer = new ArrayList<Eiendom>();
  }

  /**
  * Lager en konstruktør som oppretter et objekt av typen EiendomsRegister
  * @param eiendommer
  */
  public EiendomsRegister(ArrayList<Eiendom> eiendommer)
  {
    this._eiendommer = eiendommer;
  }

  //get/set-metoder
  /**
  * @return returnerer en ArrayList med Eiendom som type
  */
  public ArrayList<Eiendom> getEiendommer()
  {
    return this._eiendommer;
  }

  //metoder
  /**
   * @return returner true eller false, basert på om den nye eiendommen ble registrert eller ikke
   */
  public boolean registrerEiendom(Eiendom nyEiendom)
  {
    if (nyEiendom.getKommuneNummer() >= 101 && nyEiendom.getKommuneNummer() <= 5054 && nyEiendom.getGaardsNummer() > 0 && nyEiendom.getBruksNummer() > 0 && nyEiendom.getAreal() > 0.0)
    {
      this._eiendommer.add(nyEiendom);
      return true;
    }
    else
    {
      return false;
    }
  }

  /**
   * @return returner true eller false, basert på om den gitte eieindommen ble slettet eller ikke
   */
  public boolean slettEiendom(String unikTomtID)
  {
    return (this._eiendommer.remove(finnEiendomMedKommunenrGnrBnr(unikTomtID)));
  }

  /**
   * @return returner antall eiendommer
   */
  public int antallEiendomer()
  {
    this._eiendommer.trimToSize();
    return this._eiendommer.size();
  }

  /**
  *@return returnerer det gjennsomsnittlige arealet i eiendomsregisteret
  *
  *"snittArealIRegisteret"-metoden finner det gjennomsnittlige arealet i eindomsregisteret
  *ved å først forskire seg om at vi ikke har noen tomme plasser i ArrayList'en, så ved å gå
  *gjennom alle eiendommene i ArrayList'en og summere det totale areal, til slutt returneres
  *det summerte arealet delt på antall eiendommer i registere, ergo det gjennomsnittlige arelaet.
  */
  public Double snittArealIRegisteret()
  {
    this._eiendommer.trimToSize();
    Double summerer = 0.0;
    for (int i = 0; i < this._eiendommer.size(); i++)
    {
      summerer += this._eiendommer.get(i).getAreal();
    }
    return summerer / this._eiendommer.size();
  }

  /**
  *@return returnerer en ArrayList av objektet Eiendom med eiendommer med et gitt Gårdsnummer
  *
  *"finnEiendomMedGnr"-metoden finner alle eiendommer med et gårdsnummer likt det det søkes etter
  *ved å først forskire seg om at vi ikke har noen tomme plasser i ArrayList'en, så ved å gå
  *gjennom alle eiendommene i ArrayList'en og sjekker dem opp mot søkeverdien. Hvis de er like så
  *blir eiendomen lagt til i en ny ArrayList som blir returnert når for-loop'en er ferdig.
  */
  public ArrayList<Eiendom> finnEiendomMedGnr(int gnr)
  {
    ArrayList<Eiendom> returliste = new ArrayList<Eiendom>();
    this._eiendommer.trimToSize();
    for (Eiendom i : this._eiendommer)
    {
      if (i.getGaardsNummer() == gnr)
      {
        returliste.add(i);
      }
    }
    return returliste;
  }

  public ArrayList<Eiendom> finnEiendomMedKnr(int knr)
  {
    ArrayList<Eiendom> returliste = new ArrayList<Eiendom>();
    this._eiendommer.trimToSize();
    for (Eiendom i : this._eiendommer)
    {
      if (i.getKommuneNummer() == knr)
      {
        returliste.add(i);
      }
    }
    return returliste;
  }

  public ArrayList<Eiendom> finnEiendomMedBnr(int bnr)
  {
    ArrayList<Eiendom> returliste = new ArrayList<Eiendom>();
    this._eiendommer.trimToSize();
    for (Eiendom i : this._eiendommer)
    {
      if (i.getBruksNummer() == bnr)
      {
        returliste.add(i);
      }
    }
    return returliste;
  }

  /**
   * @return returner et objekt av typen Eiendom, hvis en eiendom med en unik tomt-ID lik input finnes, hvis ikke returners null
   */

  public Eiendom finnEiendomMedKommunenrGnrBnr(String unikTomtID)
  {
    this._eiendommer.trimToSize();
    for (int i = 0; i < this._eiendommer.size(); i++)
    {
      if (unikTomtID.equals(this._eiendommer.get(i).getUnikTomtID()))
      {
        return this._eiendommer.get(i);
      }
    }
    return null;
  }

  //toString
  public String toString()
  {
    return this._eiendommer.toString();
  }

}
