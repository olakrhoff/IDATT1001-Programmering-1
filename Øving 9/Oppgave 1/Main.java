import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Student student1 = new Student("Jens", 2);
    Student student2 = new Student("Per", 4);
    Student[] studenter = new Student[2];
    studenter[0] = student1;
    studenter[1] = student2;
    Oppgaveoversikt oversikt = new Oppgaveoversikt(studenter);

    System.out.println(student1.getNavn());
    student2.getAntOppg();
    student2.ookAntOppg(2);
    System.out.println(student2.getAntOppg());

    oversikt.getAntallStudenter();
    oversikt.getAntallOppgaverAvStud(1);

    Student student3 = new Student("Ole", 1);
    oversikt.registerStudent(student3);
    oversikt.ookAntallOppgaverForSpesifikkStudent(2,5);


    System.out.println(student1.toString());
    System.out.println(oversikt.toString());

  }
}
