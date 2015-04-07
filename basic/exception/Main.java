package testexception;

import java.util.Scanner;
// http://www.tutorialspoint.com/java/java_exceptions.htm
// http://www.tutorialspoint.com/java/java_builtin_exceptions.htm

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a num: ");
        int arr[] = new int[5];
        try{
            int n = sc.nextInt();
            // Take input num as greater than 4
            // Take input num as less than 4
            // Take input num as 4.3

             arr[n] =543;               
             int x = n/0;
        }
        catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Error in Array: " + e);
         //return;    // finally block will execute even if there is a return
        }
        catch(ArithmeticException e){
         System.out.println("Error in Arithmetic: " + e);
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
        finally{
            //The finally block always executes.
            // It doesn't depend on error

            System.out.println("The End");
        }

        System.out.println("If we don't use try then we cann't see this line");
        System.out.println("-----------------------");
        System.out.println("My Thread");

        MyThrow account = new MyThrow(323);
        try{
            account.withdraw(423);
        }
        catch(InsufficientFundsException e){
            System.out.println("My Thread Errors "+e);
            System.out.println("required balance "+e.getAmount());
        }


    }

}
