import java.util.*;

class MenyRegister
{
  private ArrayList<Meny> _menyReg;
  private ArrayList<Rett> _retter;

  public MenyRegister(ArrayList<Meny> menyer)
  {
    this._menyReg = menyer;
    this._retter = new ArrayList<Rett>();
    for (int i = 0; i < menyer.size(); i++)
    {
      for (int j = 0; j < menyer.get(i).getRetter().size(); j++)
      {
        registrerNyRett(menyer.get(i).getRetter().get(j));
      }
    }
  }

  //get-set metoder

  public ArrayList<Rett> getRetter()
  {
    return this._retter;
  }

  //metoder

  public void registrerNyRett(Rett nyRett)
  {
    boolean eksisterer = false;
    for (int i = 0; i < this._retter.size(); i++)
    {
      if (nyRett.getNavn().toLowerCase().compareTo(this._retter.get(i).getNavn().toLowerCase()) == 0)
      {
        eksisterer = true;
      }
    }
    if (eksisterer == false)
    {
      this._retter.add(nyRett);
    }
  }

  public String finnRett(String navn)
  {
    String aktuelle = "";
    for (int i = 0; i < this._retter.size(); i++)
    {
      if (this._retter.get(i).getNavn().compareTo(navn.toLowerCase()) == 0)
      {
        aktuelle = this._retter.get(i).toString();
      }

    }
    return aktuelle;
  }

  public String[] finnAlleRetterAvType(String type)
  {
    String[] aktuelle = new String[this._retter.size()];
    for (int i = 0; i < this._retter.size(); i++)
    {
      if (this._retter.get(i).getType().toLowerCase().compareTo(type.toLowerCase()) == 0)
      {
        aktuelle[i] = this._retter.get(i).toString();
      }
    }
    return aktuelle;
  }

  public void registrerNyMeny(Meny meny)
  {
    this._menyReg.add(meny);
  }

  public String[] finnMenyPrisIntervall(int bunnPris, int toppPris)
  {
    String[] aktuelle = new String[this._menyReg.size()];
    for (int i = 0; i < this._menyReg.size(); i++)
    {
      if (totalPrisIMeny(this._menyReg.get(i)) < toppPris && totalPrisIMeny(this._menyReg.get(i)) > bunnPris)
      {
        aktuelle[i] = this._menyReg.get(i).toString();
      }
    }
    return aktuelle;
  }

  public int totalPrisIMeny(Meny meny)
  {
    int summer = 0;
    for (int i = 0; i < meny.getRetter().size(); i++)
    {
      summer += meny.getRetter().get(i).getPris();
    }
    return summer;
  }

  public void printRetter()
  {
    int runde = 0;
    for (int i = 0; i < this._retter.size(); i++)
    {
      runde = i + 1;
      System.out.println(runde + ": " + this._retter.get(i).toString() + "\n");
    }
  }

  //toString
}
