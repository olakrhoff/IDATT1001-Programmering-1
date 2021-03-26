import java.util.*;

class NyString
{
  private final String _input;
  
  public NyString(String input)
  {
    this._input = input;
  }

  public String forkortelse()
  {
    String[] stykket = this._input.split(" ");
    char[] midOut = new char[stykket.length];

    for (int i = 0; i < stykket.length; i++)
    {
      char[] stykketChar = new char[stykket[i].length()];
      stykketChar = stykket[i].toCharArray();

      midOut[i] = stykketChar[0];
    }

    String output = new String(midOut);

    return output;
  }

  public String fjerning(char bokstav)
  {
    String boks = Character.toString(bokstav);
    String[] delt = this._input.split(boks);
    String output = "";
    for (int i = 0; i < delt.length; i++)
    {
      output += delt[i];
    }

    return output;
  }
}
