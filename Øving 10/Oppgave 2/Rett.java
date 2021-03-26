import java.util.*;

class Rett
{
  private String _navn;
  private String _type;
  private int _pris;
  private String _oppskrift;

  public Rett(String navn, String type, int pris, String oppskrift)
  {
    this._navn = navn.toLowerCase();
    this._type = type.toLowerCase();
    this._pris = pris;
    this._oppskrift = oppskrift.toLowerCase();
  }

  //get-set metoder

  public String getNavn()
  {
    return this._navn;
  }

  public String getType()
  {
    return this._type;
  }

  public int getPris()
  {
    return this._pris;
  }

  //metoder

  //toString

  public String toString()
  {
    return "Navn: " + this._navn + " Type rett: " + this._type + " Pris: " + this._pris + " Oppskrift: " + this._oppskrift;
  }
}
