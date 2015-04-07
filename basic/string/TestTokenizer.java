
import java.util.StringTokenizer;

public class TestTokenizer {
      public static void main(String[] args)  {
      // You have to import java.util.StringTokenizer;
      StringTokenizer st = new StringTokenizer("this is a test. Isn't it?Yes", " '?");
      //StringTokenizer s = new String
     while (st.hasMoreTokens()) {
         System.out.println(st.nextToken());
     }

      }

}
