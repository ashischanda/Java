import java.util.Scanner;
/*
    1
   121
  12321
 1234321
123454321

 */

// At first print the triangle. Now, look at the value. 
// It will increase upto row value, then it will decrease.

public class Startwo{
  public static void main (String args[]){
   
   Scanner sc = new Scanner( System.in );
   int k = sc.nextInt();
  
   // Triangle
   for(int i =1; i<= k; i++){
     for(int a=k-i ; a>0 ; a--)
       System.out.print(" ");
     
     int middleValue=1; 
     boolean flag = false;
     for(int j=1; j<= (2*i-1); j++){
      
       System.out.print(middleValue);
       if(middleValue==i)
         flag = true;
       
       if(flag) middleValue--;
       else middleValue++;
     }
     
     System.out.println();
   }
 
  }  
}
