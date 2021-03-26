import java.util.Scanner;

class SekundOmgjøring
{
  public static void main(String[] args)
  {
    Scanner time1 = new Scanner(System.in);
    System.out.println("Hvor mange timer?");
    double timer = time1.nextDouble();

    Scanner min1 = new Scanner(System.in);
    System.out.println("Hvor mange minutter?");
    double min = min1.nextDouble();

    Scanner sek1 = new Scanner(System.in);
    System.out.println("Hvor mange sekunder?");
    double sek = sek1.nextDouble();
    //Hvor mange timer, minutter og sekunder som skal gjøres om til totalt antall sekunder

    System.out.println(Convert(timer, min, sek));
  }

public static double Convert(double t, double m, double s)
{
  double sum = t * 3600 + m * 60 + s;

  return sum;
}

}
