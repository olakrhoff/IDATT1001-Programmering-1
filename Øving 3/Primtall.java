import java.util.*;

class Primtall
{
    public static void main(String[] args)
    {

        for (int p = 1; p > 0; p++)
        {

            Scanner imp = new Scanner(System.in);
            System.out.println("Hvilket tall vil du sjekke om er et primtall?");
            int tall = imp.nextInt();
            boolean sjekk = true;
            boolean ex = false;

            for (int i = 3; i < tall ^ 0.5; i += 2)
            {
                if (tall % i == 0)
                {
                    sjekk = false;
                    i = tall + 1;
                }
                else
                {
                    sjekk = true;
                }
            }
            if (tall % 2 == 0)
            {
                sjekk = false;
            }
            if (tall == 2)
            {
                sjekk = true;
            }

            if (sjekk == true)
            {
                System.out.println("Dette var et primtall ja!");
            }
            else
            {
                System.out.println("Dette var ikke noe primtall!");
            }
        }
    }
}
