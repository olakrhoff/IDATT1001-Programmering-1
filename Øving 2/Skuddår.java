import java.util.Scanner;

class Skuddår
{
  public static void main(String[] args)
  {
    System.out.println("Hvilket år er det?");
    Scanner inpu = new Scanner(System.in);
    Double aar = inpu.nextDouble();

    if (aar % 4 == 0 && aar != 0)
    {
      if (aar % 400 == 0)
      {
        System.out.println("Wow, et skuddår i et århundre som kan deles på 400!");
      }
      else if (aar % 100 == 0 && aar % 400 != 0)
      {
        System.out.println("Filler'n et århundre som ikke er delelig med 400!");
      }
      else if (aar % 100 != 0)
      {
        System.out.println("Et helt vanlig skuddår!");
      }
    }
    else if (aar == 0)
    {
      System.out.println("År 0 ja, er vel et skuddår det også!");
    }
    else
    {
      System.out.println("Filler'n ikke et skuddår!");
    }
  }
}
