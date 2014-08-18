/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


abstract class Employee {
   private String name;
   private String address;
   protected double salary;

   public Employee(String name, String address, double salary) {
             this.name = name;
             this.address = address;
             this.salary = salary;
       }
   public String getName(){
       return name;
   }
   public abstract double raise(); // abstract method
   public abstract String getEmployeeType(); // abstract method

}

class Programmer  extends Employee{
    private double commission;
    private double projectRate;
    private double projectNum;

    public Programmer(String name, String address, double salary, double projectRate, double projectNum) {
        super(name, address, salary);
        setProjectRate(projectRate);
        setProjectNum(projectNum);
     }
     private void setProjectRate(double projectRate){
         this.projectRate= (projectRate>0)? (salary*projectRate) : 0 ;
         // checking: ensure no negative value
     }
     private void setProjectNum(double projectNum){
         this.projectNum= (projectNum>0)? projectNum : 0 ;
     }
     private double getProjectRate(){
        return projectRate;
     }
     private double getProjectNum(){
        return projectNum;
     }

    public double raise() {
       commission= getProjectRate() * getProjectNum();  // what a nice Idea
       salary = salary + commission;
       return salary;
     }
     public String getEmployeeType(){
     	return "Programmer";
     }
}

 class Manager extends  Employee {
    Manager(String name, String address,double salary) {
      super(name, address, salary);
    }
    public double raise(){
           salary = salary + salary * .05;
           return salary;
     }
    public String getEmployeeType(){
     	return "Manager";
     }
  }

class Worker extends Employee {
    Worker(String name, String address, double salary) {
       super(name, address, salary);
    }
    public double raise() {
           return salary;
     }

      public String getEmployeeType(){
     	return "Worker";
     }
}
public class Main {

 public static void main(String[] args) {   
     Programmer a=new Programmer("Ashis","Chanda", 3500, 0.30, 2);
     Manager b=new Manager("hossein","shiraz", 4000);
     Worker c= new Worker("reza","tehran",1000);
      
        
        Employee ArrayEmployee[]=new Employee[3];
        ArrayEmployee[0]=a;
        ArrayEmployee[1]=b;
        ArrayEmployee[2]=c;

        for(int i=0;i<ArrayEmployee.length;i++){
            double s=ArrayEmployee[i].raise();
            System.out.println("Name : "+ ArrayEmployee[i].getName()
                    + " Post: "+ ArrayEmployee[i].getEmployeeType() + " salary: "+s);
            // you can write two in this manner
        }
        // getName() comes from the first class: Employee
        // getEmployeeType() comes from diff class which is abstract method
    }
}
