package TestJava;

public class DataType {

    public static void main(String[] args) {
        long l = 34;       // 64 bit or 8B     -2^63 to 2^63 -1
        int i = 322;       // 32 bit or 4B     -2^31 to 2^31 -1
        short s = 32;      // 16 bit
        byte b = 4;        // 8 bit
        // thus, byte bb = 200;  will not store properly

        // s = i+ 34;      // problem
        i = s + 34;         // no problem

        double d = 200000;      // 64 bit or 8B
        float f = 42;          // 32 bit or 4B
        float ff = 34.23f;  // Or you can do this:  float ff = (float) 34.543;

        System.out.println("Sum : " + d + f);       // Look it will not show the sum
        System.out.println("Real Sum : " + (d + f));

        char ch1 = 'a';   // In C/C++, char is 8b or 1B
        // But Java considers char as Unicode. Thus, the size is 16b
        char ch2 = 65;
        System.out.println("Char : " + ch1 + " " + ch2);

        for (; ch2 < 75; ch2++) {
            System.out.print(ch2);
        }

        String str = "ashis";    // Size ?


        boolean flag = true;   // 1b ?
        //This data type represents one bit of information, but its "size" isn't something that's precisely defined.
        // Default value: False
        // Link: http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
        /* A Boolean has 8 bytes of header, plus 1 byte of payload, for a total of 9 bytes of information.
         The JVM then rounds it up to the next multiple of 8. so the one instance of
         java.lang.Boolean takes up 16 bytes of memory.
         *
         */

        System.out.println("\n Array");
        int arr[];
        arr = new int[1];
        arr[0] = 32;
        //arr[1] = 31;
        // System.out.println(arr[0]+ " "+ arr[1]);
        arr = new int[2];
        System.out.println(arr[0] + " " + arr[1]);




        /// ****************** casting
        /// ****************** Variable life time


    }
}
