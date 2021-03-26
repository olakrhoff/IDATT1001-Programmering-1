import java.util.*;

class Person
{
  private final String _fornavn;
  private final String _etternavn;
  private final int _foodselsaar;

  public Person(String fornavn, String etternavn, int foodselsaar)
  {
    this._fornavn = fornavn;
    this._etternavn = etternavn;
    this._foodselsaar = foodselsaar;
  }


  public String getFornavn()
  {
    return this._fornavn;
  }

  public String getEtternavn()
  {
    return this._etternavn;
  }

  public int getFoodselsaar()
  {
    return this._foodselsaar;
  }
}
