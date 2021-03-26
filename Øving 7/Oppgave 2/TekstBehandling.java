import java.util.*;

class TekstBehandling
{
  private final String _tekst;

  public TekstBehandling(String tekst)
  {
    this._tekst = tekst;
  }

  public int antallOrd()
  {
    String[] input = this._tekst.split(" ");

    int antall = input.length;

    return antall;
  }

  public int gjennomsittligOrdLenge()
  {
    String[] input = this._tekst.split(" ");
    int sum = 0;

    for (int i = 0; i < input.length; i++)
    {
      sum += input[i].length();
    }

    return sum / input.length;
  }

  public int gjennomsittOrdPerSetning()
  {
    char[] input = this._tekst.toCharArray();
    int spaceCounter = 0;
    int[] sums = new int[this._tekst.length()];
    int sumCount = 0;

    for (int i = 0; i < input.length; i++)
    {
      if (input[i] == '.' || input[i] == '!' || input[i] == ':' || input[i] == '?')
      {
        sums[sumCount] = spaceCounter;
        sumCount++;
        spaceCounter = 0;
      }
      else if (input[i] == ' ')
      {
        spaceCounter++;
      }
    }

    int[] output = slimDownArray(sums);
    output[0]++;
    int sum = 0;
    for (int i = 0; i < output.length; i++)
    {
      sum += output[i];
    }

    return sum / sumCount;
  }

  public String ordErstratter(String gammel, String ny)
  {
    String input = this._tekst;
    String ord = new String(gammel);
    String nytt = new String(ny);
    String[] delt = input.split(ord);
    String output = "";
    String middlertidig = "";
    for (int i = 0; i < delt.length; i++)
    {
      middlertidig = delt[i] + nytt;
      output += middlertidig;
    }

    char[] gammelOutput = output.toCharArray();
    char[] nyOutput = new char[output.length() - nytt.length()];

    for (int i = 0; i < nyOutput.length; i++)
    {
      nyOutput[i] = gammelOutput[i];
    }

    String finalOutput = new String(nyOutput);
    return finalOutput;
  }

  public String getTekst()
  {
    return this._tekst;
  }

  public String getTekstiStoreBokstaver()
  {
    return this._tekst.toUpperCase();
  }

  public int[] slimDownArray(int[] arr)
  {
    int indexMarker = 0;

    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] == 0)
      {
        indexMarker = i;
        i = arr.length + 1;
      }
    }

    if (indexMarker != 0)
    {
      int[] output = new int[indexMarker];

      for (int i = 0; i < indexMarker; i++)
      {
        output[i] = arr[i];
      }
      return output;
    }
    else
    {
      return arr;
    }
  }
}
