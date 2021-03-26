import java.util.*;

class Main
{
  public static void main (String[] args)
  {
    boolean loop = false;
    Scanner imp = new Scanner(System.in);

    while (loop == false)
    {
      System.out.println("Brøk kalkulator");
      System.out.println();
      System.out.println("1: Addere");
      System.out.println("2: Subtrahere");
      System.out.println("3: Multiplisere");
      System.out.println("4: Dividere");
      System.out.println("5: Avslutt");
      System.out.println();


      String førsteValg = imp.nextLine();

      switch (førsteValg)
      {
        case "1":
          System.out.println();
          System.out.println("Første brøk:");
          System.out.println("Hva er telleren?");
          System.out.println();
          int tellerC11 = imp.nextInt();

          System.out.println("Hva er nevneren?");
          System.out.println();
          int nevnerC11 = imp.nextInt();

          System.out.println("Andre brøk:");
          System.out.println("Hva er telleren?");
          System.out.println();
          int tellerC12 = imp.nextInt();

          System.out.println("Hva er nevneren?");
          System.out.println();
          int nevnerC12 = imp.nextInt();

          Brook brøk11 = new Brook(tellerC11, nevnerC11);
          Brook brøk12 = new Brook(tellerC12, nevnerC12);

          Brook brøk1ut = brøk11.Addere(brøk12);

          System.out.println(brøk1ut.getTeller() + " / " + brøk1ut.getNevner());

          break;

        case "2":
          System.out.println();
          System.out.println("Første brøk:");
          System.out.println("Hva er telleren?");
          System.out.println();
          int tellerC21 = imp.nextInt();

          System.out.println("Hva er nevneren?");
          System.out.println();
          int nevnerC21 = imp.nextInt();

          System.out.println("Andre brøk:");
          System.out.println("Hva er telleren?");
          System.out.println();
          int tellerC22 = imp.nextInt();

          System.out.println("Hva er nevneren?");
          System.out.println();
          int nevnerC22 = imp.nextInt();

          Brook brøk21 = new Brook(tellerC21, nevnerC21);
          Brook brøk22 = new Brook(tellerC22, nevnerC22);

          Brook brøk2ut = brøk21.Subtrahere(brøk22);

          System.out.println(brøk2ut.getTeller() + " / " + brøk2ut.getNevner());

          break;

        case "3":
          System.out.println();
          System.out.println("Første brøk:");
          System.out.println("Hva er telleren?");
          System.out.println();
          int tellerC31 = imp.nextInt();

          System.out.println("Hva er nevneren?");
          System.out.println();
          int nevnerC31 = imp.nextInt();

          System.out.println("Andre brøk:");
          System.out.println("Hva er telleren?");
          System.out.println();
          int tellerC32 = imp.nextInt();

          System.out.println("Hva er nevneren?");
          System.out.println();
          int nevnerC32 = imp.nextInt();

          Brook brøk31 = new Brook(tellerC31, nevnerC31);
          Brook brøk32 = new Brook(tellerC32, nevnerC32);

          Brook brøk3ut = brøk31.Multiplisere(brøk32);

          System.out.println(brøk3ut.getTeller() + " / " + brøk3ut.getNevner());

          break;

        case "4":
          System.out.println();
          System.out.println("Første brøk:");
          System.out.println("Hva er telleren?");
          System.out.println();
          int tellerC41 = imp.nextInt();

          System.out.println("Hva er nevneren?");
          System.out.println();
          int nevnerC41 = imp.nextInt();

          System.out.println("Andre brøk:");
          System.out.println("Hva er telleren?");
          System.out.println();
          int tellerC42 = imp.nextInt();

          System.out.println("Hva er nevneren?");
          System.out.println();
          int nevnerC42 = imp.nextInt();

          Brook brøk41 = new Brook(tellerC41, nevnerC41);
          Brook brøk42 = new Brook(tellerC42, nevnerC42);

          Brook brøk4ut = brøk41.Dividere(brøk42);

          System.out.println(brøk4ut.getTeller() + " / " + brøk4ut.getNevner());

          break;

        case "5":
          loop = true;
          break;

        default:
          System.out.println();
          System.out.println("Velg en av alternativene");
          System.out.println();
          break;
      }
    }
  }
}
