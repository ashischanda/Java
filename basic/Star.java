import java.util.Scanner;

public class Star{
  public static void main (String args[]){
   
   Scanner sc = new Scanner( System.in );
   int k = sc.nextInt();

   // Triangle
   for(int i =1; i<= k; i++){
     for(int a=k-i ; a>0 ; a--)
       System.out.print(" ");
     
     for(int j=1; j<= (2*i-1); j++)
       System.out.print("*");
     
     System.out.println();
   }
   
  } 
}
// Rhombus
// Print the triangle. then print the reverse
   
/*
 
    *  
   **
  * *
 *  *
*****

*/
// At first, print the first line and last line. Now, find logic between them. Space, Star, Space   
/*
    
   *
  * *
 *   *
*******

*/
 // At first print the triangle, then think about middle space.
 // At middle, we will print * if j==1 and j==(2*i-1). Otherwise print space

/*
 * You don't need to add any Math or String class like C/C++ (math.h, string.h)
 * 
  //double d = Math.pow(3,2)* Math.PI;
  //   String s = "good day";
  //   String as = s.substring(2, 6);
   
 * */
