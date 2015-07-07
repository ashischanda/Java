/*
RealPart: 1.0
ImaginaryPart: 1.0
--------------------
RealPart: 5.0
ImaginaryPart: 7.0
--------------------
I'm in ComplexNumber class
I'm in RealNumber class
Checking ended.

*/
public class TesterComplex {
    public static void main(String[] args) {
        RealNumber rn = new ComplexNumber();
        System.out.println(rn);
        
        System.out.println("--------------------");
        
        
        rn = new ComplexNumber(5, 7);
        System.out.println(rn);
        
        /*
        System.out.println("--------------------");
        ComplexNumber cn = new ComplexNumber();
        cn.check();
        */
    }
}
 class RealNumber {
    private double realValue = 3;
    public double getRealValue() {
        return realValue;
    }
    public void setRealValue(double r) {
        realValue = r;
    }
    public RealNumber() {
      this(0);// it will set zero on all variables
      // you can set any value in this. Not only zero
      
    }
    public RealNumber(double r) {
        setRealValue(r);
    }
    public String toString() {
        return "RealPart: "+getRealValue();
    }
    public void ping() {
        System.out.println("I'm in RealNumber class");
    }
}

 class ComplexNumber extends RealNumber{
   private double imaginaryValue = 4;
   public ComplexNumber() {
       setRealValue(1);
       setImagineValue(1);   
    }
    public ComplexNumber(double r, double r2) {
        // super(r);  // Or, you can use this line too
        setRealValue(r);
        setImagineValue(r2);  
    }
    
    
     public void setImagineValue(double r) {
        imaginaryValue = r;
    }
     
     public double getImagineValue() {
        return imaginaryValue;
    }
   
    public String toString() {
        //super.toString(); // it will not work
        return "RealPart: "+getRealValue() + " ImaginaryPart: "+getImagineValue();
    }
    
    public void check(){
    
    }
    
 }
