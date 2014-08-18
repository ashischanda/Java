/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	  Vector<Student> sampleData =new Vector<Student>();
    Student s= new Student("ashis", "a@ya.com");
    sampleData.add(s);
    s= new Student("rahim", "r@ya.com");
    sampleData.add(s);

    System.out.println("Value is :"+sampleData.get(1));
    Teacher teacher = new Teacher("Tapan","tap@gmail.com");
    Course sample= new Course(sampleData, teacher, "Physics");
    s= new Student("Jiban", "j@ya.com");
    sample.addStudent(s);

    System.out.println( sample.getTitle());
    s= sample.getStudent();
    System.out.println("Name: "+ s.getName()+ " Email: "+ s.getEmail());
	
	
	}
}


 abstract class Member {
    private String name;
    private String email;
    public Member(String name, String email){
        this.name= name;
        this.email= email;

    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

}

// *******************************************
 class Student extends Member {
    public Student(String name, String email){
        super(name, email);
    }
    public String toString()
    {
        return "st";
    }
}

 class Teacher extends Member{
    public Teacher(String name, String email){
        super(name, email);
    }

}
// *******************************************

 class Course {
    private  Vector<Student> myVector;
    private Teacher lecturer;
    private String title;
    public Course( Vector<Student> myVector, Teacher lecturer,String title){
        this.myVector= myVector;
        this.lecturer= lecturer;
        this.title= title;
    }
    public void addStudent(Student st){
        myVector.add(st);

    }
    public void removeStudent(int index){
        myVector.remove(index);
    }

    public Student getStudent(){
        Student s;
        s= myVector.get(0);
        return s;
    }
     public String getTitle(){
        return title;
    }
     public void assignTeacher(Teacher lec){
         lecturer= lec;
    }


}


