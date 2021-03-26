import java.util.*;

class Brook
{
  private int _teller;
  private int _nevner;

  //Tar teller og nevner
  public Brook(int teller, int nevner)
  {
    this._teller = teller;
    this._nevner = nevner;

    if (nevner == 0)
    {
      throw new IllegalArgumentException("/ by zero");
    }
  }

  //Tar kun teller, nevner er alltid lik 1
  public Brook(int teller)
  {
    this._teller = teller;
    this._nevner = 1;
  }

  public int getTeller()
  {
    return this._teller;
  }

  public int getNevner()
  {
    return this._nevner;
  }

  public void Addere(Brook sum)
  {
    int teller2 = sum.getTeller();

    this._teller *= sum.getNevner();
    teller2 *= this._nevner;

    int nevnerFinal = sum.getNevner() * this._nevner;
    int tellerFinal = this._teller + teller2;


    Brook output = new Brook(tellerFinal, nevnerFinal);
    this.teller = tellerFinal;
    this.nevner = nevnerFinal;
  }

  public Brook Subtrahere(Brook sum)
  {
    int teller2 = sum.getTeller();

    this._teller *= sum.getNevner();
    teller2 *= this._nevner;

    int nevnerFinal = sum.getNevner() * this._nevner;
    int tellerFinal = this._teller - teller2;

    Brook output = new Brook(tellerFinal, nevnerFinal);
    return output;
  }

  public Brook Multiplisere(Brook sum)
  {
    int tellerFinal = this._teller * sum.getTeller();
    int nevnerFinal = this._nevner * sum.getNevner();


    Brook output = new Brook(tellerFinal, nevnerFinal);
    return output;
  }

  public Brook Dividere(Brook sum)
  {
    Brook andre = new Brook(sum.getNevner(), sum.getTeller());
    Brook først = new Brook(this._teller, this._nevner);

    Brook output = først.Multiplisere(andre);
    return output;
  }
}
