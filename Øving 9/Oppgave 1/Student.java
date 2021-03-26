import java.util.*;

class Student
{
  private String _navn;
  private int _antOppg;


  public Student(String navn, int antallOppgaver)
  {
    this._navn = navn;
    this._antOppg = antallOppgaver;
  }

  //get-set metoder

  public String getNavn()
  {
    return this._navn;
  }

  public int getAntOppg()
  {
    return this._antOppg;
  }

  //Andre metoder

  public void ookAntOppg(int ookning)
  {
    this._antOppg += ookning;
  }

  //to string metoder

  public String toString()
  {
    return "Navn: " + this._navn + " Antall oppgaver godkjent: " + Integer.toString(this._antOppg);
  }
}
