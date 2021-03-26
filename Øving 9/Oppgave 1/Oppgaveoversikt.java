import java.util.*;

class Oppgaveoversikt
{
  private Student[] _studenter;
  private int _antStud;

  public Oppgaveoversikt(Student[] student)
  {
    this._studenter = student;
    this._antStud = student.length;
  }

  //get-set metoder

  public int getAntallStudenter()
  {
    return this._antStud;
  }

  public int getAntallOppgaverAvStud(int student)
  {
    return this._studenter[student].getAntOppg();
  }

  //Metoder

  public void registerStudent(Student student)
  {
    Student[] nyStudentListe = new Student[this._antStud + 1];
    this._antStud += 1;
    nyStudentListe[this._antStud - 1] = student;

    this._studenter = nyStudentListe;
  }

  public void ookAntallOppgaverForSpesifikkStudent(int indexStudent, int ooking)
  {
    this._studenter[indexStudent].ookAntOppg(ooking);
  }

  //toString Metoder

  public String toString()
  {
    return "Antall studenter: " + Integer.toString(this._antStud);
  }
}
