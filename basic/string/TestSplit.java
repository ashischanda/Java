public class TestSplit {
       public static void main(String[] args)  {
           // don't need to import file
           // public String[] split(String regex, int limit)
           // or
           // public String[] split(String regex)
           // regex -- the delimiting regular expression.
           // limit -- the result threshold which means how many strings to be returned.
           

       String str = "Welcome-to-Tutorialspoint.com - This is a test";
       String[] result = str.split("-", 2);
     for (int x=0; x<result.length; x++)
         System.out.println(result[x]);

       }
}
