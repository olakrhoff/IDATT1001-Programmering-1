import java.util.*;

class ArbTaker
{
  private final Person _personalia;
  private final int _arbtakernr;
  private final int _ansettelseaar;
  private int _maanedsloonn;
  private int _skatteprosent;

  public GregorianCalendar kalender;
  public int aar;

  //konstruktør

  public ArbTaker(Person person, int arbTakerNr, int ansettelseAar, int maanedsLoon, int skatteProsent)
  {
    this._personalia = person;
    this._arbtakernr = arbTakerNr;
    this._ansettelseaar = ansettelseAar;
    this._maanedsloonn = maanedsLoon;
    this._skatteprosent = skatteProsent;

    kalender = new GregorianCalendar();
    arr = kalender.get(java.util.Calendar.YEAR);
  }

  //metodert i classen

  public int skatteTrekk()
  {
    return this._maanedsloonn * this._skatteprosent / 100;
  }

  public int bruttoLoonnPerAar()
  {
    return this._maanedsloonn * 12;
  }

  public int skatteTrekkPerAar()
  {
    return ((this._maanedsloonn * 105) / 10) * this._skatteprosent / 100;
  }

  public String navn()
  {
    String fornavn = this._personalia.getFornavn();
    String etternavn = this._personalia.getEtternavn();

    return etternavn + ", " + fornavn;
  }

  public int alder()
  {
    return aar - this._personalia.getFoodselsaar();
  }

  public int antallAarAnsatt()
  {
    return aar - this._ansettelseaar;
  }

  public Boolean ansattLengerEn(int antallAar)
  {
    if (antallAar < antallAarAnsatt())
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  //under er det kun get-/set-metoder

  public Person getPersonalia()
  {
    return this._personalia;
  }

  public int getArbTakerNr()
  {
    return this._arbtakernr;
  }

  public int getAnsettelseAar()
  {
    return this._ansettelseaar;
  }

  public int getMaanedsLoonn()
  {
    return this._maanedsloonn;
  }

  public double getSkatteProsent()
  {
    return this._skatteprosent;
  }

  public void setMaanedsLoon(int set)
  {
    this._maanedsloonn = set;
  }

  public void setSkatteProsent(int set)
  {
    this._skatteprosent = set;
  }
}
