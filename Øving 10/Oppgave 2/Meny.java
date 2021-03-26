import java.util.*;

class Meny
{
  private String _navn;
  private ArrayList<Rett> _meny;

  public Meny(String navn, ArrayList<Rett> retter)
  {
    this._navn = navn.toLowerCase();
    this._meny = retter;
  }

  //get-set metoder

  public String getNavn()
  {
    return this._navn;
  }

  public ArrayList<Rett> getRetter()
  {
    return this._meny;
  }

  //metoder

  //toString

  public String toString()
  {
    return "Navn: " + this._navn + " Antall retter: " + this._meny.size();
  }
}
