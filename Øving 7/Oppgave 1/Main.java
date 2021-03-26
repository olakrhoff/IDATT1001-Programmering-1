import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    String kake = "kake er kjempe godt";

    NyString test = new NyString(kake);
    String output1 = test.forkortelse();
    String output2 = test.fjerning('k');
    System.out.println(output1);
    System.out.println(output2);
  }
}
