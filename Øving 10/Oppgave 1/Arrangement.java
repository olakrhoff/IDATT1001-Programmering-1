import java.util.*;

class Arrangement
{
  private int _entydigNummer;
  private String _navn;
  private String _sted;
  private String _arrangoor;
  private String _type;
  private Long _tidspunkt;

  public Arrangement(int entydigNummer, String navn, String sted, String arrangoor, String type, long tidspunkt)
  {
    this._entydigNummer = entydigNummer;
    this._navn = navn.toLowerCase();
    this._sted = sted.toLowerCase();
    this._arrangoor = arrangoor.toLowerCase();
    this._type = type.toLowerCase();
    this._tidspunkt = tidspunkt;
  }

  //get-set metoder

  public int getID()
  {
    return this._entydigNummer;
  }

  public String getNavn()
  {
    return this._navn;
  }

  public String getSted()
  {
    return this._sted;
  }

  public String getArrangoor()
  {
    return this._arrangoor;
  }

  public String getType()
  {
    return this._type;
  }

  public long getTidspunkt()
  {
    return this._tidspunkt;
  }

  //metoder

  public int compareToDato(Arrangement temp)
  {
    if (getTidspunkt() > temp.getTidspunkt())
    {
      return 1;
    }
    else if (getTidspunkt() < temp.getTidspunkt())
    {
      return -1;
    }
    else
    {
      return 0;
    }
  }
  //toString metode

  public String toString()
  {
    return "ID: " + getID() + " Navn: " + getNavn() + " Sted: " + getSted() + " Arrangør: " + getArrangoor() + " Type arrangement: " + getType() + " Dato: " + getTidspunkt();
  }
}
