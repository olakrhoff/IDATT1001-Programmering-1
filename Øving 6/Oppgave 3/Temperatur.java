import java.util.*;

class Temperatur
{
  private int[][] _tabell;

  public Temperatur(int[][] tempTabell)
  {
    this._tabell = tempTabell;
  }

  public double[] MiddelHverDag()
  {
    double[] output = new double[this._tabell[0].length];
    for (int j = 0; j < this._tabell[0].length; j++)
    {
      double totalSumTemp = 0.0;
      for (int i = 0; i < this._tabell.length; i++)
      {
        totalSumTemp += this._tabell[i][j];
      }

      double gjennomsnitt = totalSumTemp / this._tabell.length;

      output[j] = gjennomsnitt;
    }
    return output;
  }

  public double[] MiddelHverTime()
  {
    double[] output = new double[this._tabell.length];
    for (int i = 0; i < this._tabell.length; i++)
    {
      double totalSumTemp = 0.0;
      for (int j = 0; j < this._tabell[0].length; j++)
      {
        totalSumTemp += this._tabell[i][j];
      }

      double gjennomsnitt = totalSumTemp / this._tabell[0].length;

      output[i] = gjennomsnitt;
    }

    return output;
  }

  public double MiddelHeleMnd()
  {
    double totalSumTemp = 0;

    for (int i = 0; i < this._tabell.length; i++)
    {
      for (int j = 0; j < this._tabell[0].length; j++)
      {
        totalSumTemp += this._tabell[i][j];
      }
    }

    double gjennomsnitt = totalSumTemp / (this._tabell[0].length * this._tabell.length);

    return gjennomsnitt;
  }

  public static int[] AnalyseAvTemperatur(Temperatur input)
  {
    double[] data = input.MiddelHverDag();
    //0: verdi < -5
    //1: -5 < verdi < 0
    //2: 0 < verdi < 5
    //3: 5 < verdi < 10
    //4: 10 < verdi
    int[] sortertData = new int[5];

    for (int i = 0; i < data.length; i++)
    {
      if (data[i] < -5.0)
      {
        sortertData[0]++;
      }
      else if (data[i] >= -5.0 && data[i] <= 0.0)
      {
        sortertData[1]++;
      }
      else if (data[i] > 0.0 && data[i] <= 5.0)
      {
        sortertData[2]++;
      }
      else if (data[i] > 5.0 && data[i] <= 10.0)
      {
        sortertData[3]++;
      }
      else if (data[i] > 10.0)
      {
        sortertData[4]++;
      }
    }

    return sortertData;
  }

  public int[][] getTabell()
  {
    return this._tabell;
  }
}
