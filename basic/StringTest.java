
/**
 *
 * @author Ashis Kumar Chanda
 * CSE, University of Dhaka
 */
public class StringTest {

    public static void main(String args[]) {
        char c[] = {'J', 'a', 'v', 'a'};
        String s1 = new String(c);
        String s2 = new String(s1);
        System.out.println(s1);
        System.out.println(s2);

        String as ="good day";
        String as2 = as;
        System.out.println(as+ " " + as2);
        char chars[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
        String s = new String(chars, 2, 3);

    /**
     Even though Java’s char type uses 16 bits to represent the Unicode character set, the
    typical format for strings on the Internet uses arrays of 8-bit bytes constructed from the
    ASCII character set. Because 8-bit ASCII strings are common
     **/

       byte ascii[] = {65, 66, 67, 68, 69, 70 };
       s1 = new String(ascii);
       System.out.println(s1);
       s2 = new String(ascii, 2, 3);
       System.out.println(s2);
       System.out.println("length "+ s.length());


      s = "Strings are immutable";
      s = s.concat(" all the time");
      System.out.println(s);
      System.out.println("Single character "+ s.charAt(2) );


        s = "This is a demo of the getChars method.";
        int start = 10;
        int end = 14;
        char buf[] = new char[end - start];
        // void getChars(int sourceStart, int sourceEnd, char target[ ], int targetStart)

        s.getChars(start, end, buf, 0);
        System.out.println(buf);

        s1 = "Hello";
        s2 = "Hello";
        String s3 = "hellow";

        System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));
        System.out.println(s1 + " equals " + s3 + " -> " + s1.equals(s3));
        // "Foobar".startsWith("Foo")

    /**
     It is important to understand that the equals( ) method and the == operator perform
    two different operations. As just explained, the equals( ) method compares the
    characters inside a String object. The == operator compares two object references to
    see whether they refer to the same instance
     */

    s1 = "Hello";
    s2 = new String(s1); // it will create new address
    System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));
    System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));
    s2= s1;     // now s2 will locate the same address
    System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));

    /** compareTo()
     Less than zero      The invoking string is less than str.
    Greater than zero    The invoking string is greater than str.
    Zero                 The two strings are equal
     **/

    System.out.println("indexOf(l) = " + s1.indexOf('l')); // here, s2 = "Hello"
    // if not find, then it will return -1

    }

}
