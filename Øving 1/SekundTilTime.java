import java.util.Scanner;

class SekundTilTime
{
  public static void main(String[] args)
  {
    Scanner sek1 = new Scanner(System.in);
    System.out.println("Hvor mange sekunder?");
    int sek = sek1.nextInt();

    int time = sek / 3600;
    sek = sek - (time * 3600);
    int min = sek / 60;
    sek = sek - (min * 60);
    System.out.println("Timer: " + time + " Minutter: " + min + " Sekunder: " + sek);
  }
}
