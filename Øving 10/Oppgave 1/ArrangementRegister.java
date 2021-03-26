import java.util.*;

class ArrangementRegister
{
  private ArrayList<Arrangement> _arrangement;
  private char[] _alfabetet = "abcdefghijklmnopqrstuvwxyzæøå".toCharArray();

  public ArrangementRegister(ArrayList<Arrangement> input)
  {
    this._arrangement = input;
  }

  //get-set metoder

  public ArrayList<Arrangement> getArrangementer()
  {
    return this._arrangement;
  }
  
  //metoder


  public void registrerNyttArg(Arrangement nyttArg)
  {
    this._arrangement.add(nyttArg);
  }

  public String[] finnArgVedSted(String sted)
  {
    String[] aktuelle = new String[this._arrangement.size()];
    String input = sted.toLowerCase();
    for (int i = 0; i < this._arrangement.size(); i++)
    {
      if (input.equals(this._arrangement.get(i).getSted()))
      {
        aktuelle[i] = this._arrangement.get(i).toString();
      }
    }
    return aktuelle;
  }

  public String[] finnArgPaaGittDato(long dato)
  {
    String[] aktuelle = new String[this._arrangement.size()];
    String input = Long.toString(dato);

    for (int i = 0; i < this._arrangement.size(); i++)
    {
      if (input.equals(retDato(this._arrangement.get(i).getTidspunkt())))
      {
        aktuelle[i] = this._arrangement.get(i).toString();
      }
    }
    return aktuelle;
  }

  public String[] finnArgIIntervall(long start, long slutt)
  {
    String[] aktuelle = new String[this._arrangement.size()];
    for (int i = 0; i < this._arrangement.size(); i++)
    {
      if (Long.parseLong(retDato(this._arrangement.get(i).getTidspunkt())) >= start && Long.parseLong(retDato(this._arrangement.get(i).getTidspunkt())) <= slutt)
      {
        aktuelle[i] = this._arrangement.get(i).toString();
      }
    }
    return aktuelle;
  }

  //skal sorteres etter sted -> type -> tidspunkt
  public void sorterNaa()
  {
    ArrayList<Arrangement> sortertListe = this._arrangement;

    boolean test = false;
    while (test == false)
    {
      test = true;

      for (int i = 0; i < sortertListe.size() - 1; i++)
      {
        if (sortertListe.get(i).getSted().compareTo(sortertListe.get(i + 1).getSted()) == 0)
        {
          if (sortertListe.get(i).getType().compareTo(sortertListe.get(i + 1).getType()) == 0)
          {
            if (sortertListe.get(i).compareToDato(sortertListe.get(i + 1)) > 0)
            {
              this._arrangement = swap(i, i + 1, sortertListe);
              test = false;
            }
          }
          else if (sortertListe.get(i).getType().compareTo(sortertListe.get(i + 1).getType()) > 0)
          {
            this._arrangement = swap(i, i + 1, sortertListe);
            test = false;
          }
        }
        else if (sortertListe.get(i).getSted().compareTo(sortertListe.get(i + 1).getSted()) > 0)
        {
          this._arrangement = swap(i, i + 1, sortertListe);
          test = false;
        }
      }
    }
  }


public ArrayList<Arrangement> swap(int a, int b, ArrayList<Arrangement> sortert)
{
  Arrangement k = sortert.get(a);
  sortert.set(a, sortert.get(b));
  sortert.set(b, k);

  return sortert;
}

public String retDato(long dato)
{
  String kake = Long.toString(dato);
  char[] input = kake.toCharArray();
  char[] output = new char[input.length - 4];
  for (int i = 0; i < output.length; i++)
  {
    output[i] = input[i];
  }
  String retOutput = new String(output);
  return retOutput;
}

public boolean sammenligneStoorelse(int[] a, int[] b)
{
  System.out.println("Sammenligning Called");
  boolean ret = false;
  int lengst = 0;
  if (a.length <= b.length)
  {
    lengst = a.length;
  }
  else if (a.length > b.length)
  {
    lengst = b.length;
  }
  for (int i = 0; i < lengst; i++)
  {
    if (a[i] < b[i])
    {
      i = lengst + 1;
      System.out.println("Sammenligning er lik false");
      ret = false;
    }
    else if (a[i] > b[i])
    {
      i = lengst + 1;
      System.out.println("Sammenligning er lik true");
      ret = true;
    }
  }
  System.out.println(ret);
  return ret;
}

public void zeroArray(int[] array)
{
  for (int i = 0; i < array.length; i++)
  {
    array[i] = 0;
  }
}
//toString metode
}
