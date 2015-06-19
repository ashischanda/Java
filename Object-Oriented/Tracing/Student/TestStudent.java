/*
You have to show this output:

Name : Default BBA Student Department: BBA
Name : Humty Dumty Department: BBA
Name : Little Bo Peep Department: BBA
*/

public class TestStudent{
  public static void printName(Student s){
    System.out.println(s.toString());
  }
  public static void main(String [] args){
    printName(new BBAStudent());
    printName(new BBAStudent("Humty Dumty"));
    printName(new BBAStudent("Little Bo Peep"));    
  }
}


public class Student{
  private String name = "Just a Student";  
  private String department = "nothing";
  public void setDepartment(String dpt){
    this.department = dpt;
  }
  protected String getName(){
    return name;
  }
  protected void setName(String name){
    this.name = name;
  }
  public String toString(){
    return "Name : " + name + " Department: " + department;
  }
}
