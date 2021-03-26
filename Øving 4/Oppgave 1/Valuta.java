import java.util.*;
import java.time.*;


class Valuta
{
  private String valutaen;
  private Double verdien;
  private Double dollar = 9.00;
  private Double euro = 9.99;
  private Double svenskeKroner = 0.92;

  public Valuta(String val, Double ver)
  {
    valutaen = val;
    verdien = ver;
  }

  public String getValuta()
  {
    return valutaen;
  }

  public Double getVerdi()
  {
    return verdien;
  }

  public String nokToVal()
  {
    Double sum = 0.0;

    switch (valutaen)
    {
      case "1":
        sum = verdien / dollar;
        break;

      case "2":
        sum = verdien / euro;
        break;

      case "3":
        sum = verdien / svenskeKroner;
        break;
    }

    String sumS = Double.toString(sum);
    return sumS;
  }

  public String valToNOK()
  {
    Double sum = 0.0;

    switch (valutaen)
    {
      case "1":
        sum = verdien * dollar;
        break;

      case "2":
        sum = verdien * euro;
        break;

      case "3":
        sum = verdien * svenskeKroner;
        break;
    }

    String sumS = Double.toString(sum);
    return sumS;
  }

}
