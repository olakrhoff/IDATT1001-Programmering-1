import java.util.*;

/**
*Klassen Eiendom
*@version 1.01 2019-11-07
*@author Ola Kristoffer Hoff
*/

class Eiendom
{
  /**
  *Her deklareres objektvariablene
  */
  private int _kommuneNummer;
  private String _kommuneNavn;
  private int _gaardsNummer;
  private int _bruksNummer;
  private String _bruksNavn;
  private Double _areal;
  private String _eiendomseiersNavn;

  /**
  *Lager en konstruktør som oppretter et objekt av typen Eiendom
  * @param kommuneNummer Kommunenummeret
  * @param kommuneNavn Kommunenavnet
  * @param gaardsNummer Gårdsnummeret
  * @param bruksNummer Bruksnummeret
  * @param bruksNavn Bruksnavnet
  * @param areal Arealet
  * @param eiendomseiersNavn Eiendomseieren sitt navn
  */
  public Eiendom(int kommuneNummer, String kommuneNavn, int gaardsNummer, int bruksNummer, String bruksNavn, Double areal, String eiendomseiersNavn)
  {
    this._kommuneNummer = kommuneNummer;
    this._kommuneNavn = kommuneNavn;
    this._gaardsNummer = gaardsNummer;
    this._bruksNummer = bruksNummer;
    if (bruksNavn != "0")
    {
        this._bruksNavn = bruksNavn;
    }
    else
    {
      this._bruksNavn = null;
    }
    this._areal = areal;
    this._eiendomseiersNavn = eiendomseiersNavn;
  }

  //get/set-metoder
  //Her er det ingen set-metoder, dette grunnet at alle objektvariabelene er relativt langvarige og kunne nesten brukt 'final' foran
  //spesielt når vi også har en metode for å slette eiendommer og opprette, men ikke endre spesifikke variabeler.
  /**
   * @return returner kommunenummeret
   */
  public int getKommuneNummer()
  {
    return this._kommuneNummer;
  }

  /**
   * @return returner kommunenavnet
   */
  public String getKommuneNavn()
  {
    return this._kommuneNavn;
  }

  /**
   * @return returner gårdsnummeret
   */
  public int getGaardsNummer()
  {
    return this._gaardsNummer;
  }

  /**
   * @return returner burksnummeret
   */
  public int getBruksNummer()
  {
    return this._bruksNummer;
  }

  /**
   * @return returner bruksnavnet
   */
  public String getBruksNavn()
  {
    return this._bruksNavn;
  }

  /**
   * @return returner arealt
   */
  public Double getAreal()
  {
    return this._areal;
  }

  /**
   * @return returner eiendomseieren sitt navn
   */
  public String getEiendomseiersNavn()
  {
    return this._eiendomseiersNavn;
  }

  /**
   * @return returner den unike tomt-ID'en
   * @see unikTomtID()
   */
  public String getUnikTomtID()
  {
    return this.unikTomtID();
  }

  //metoder
  /**
   * @return returner den unike tomt-ID'en da kommunenummer, gårdsnummer og bruksnummer i formatet kommunenr-gnr/bnr
   */
  public String unikTomtID()
  {
    return getKommuneNummer() + "-" + getGaardsNummer() + "/" + getBruksNummer();
  }

  //toString
  /**
   * @return returner en toString på formatet: Kommunenavn: Kommunenr-gnr/bnr: Areal: Eiendomseier:
   */
  public String toString()
  {
    return "Kommunenavn: " + getKommuneNavn()
         + " Kommunenr-gnr/brn: " + this.unikTomtID()
         + " Areal: " + String.format("%.2f", getAreal())
         + " Eiendomseier: " + getEiendomseiersNavn();
  }
}
