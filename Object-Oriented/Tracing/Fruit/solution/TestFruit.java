public class TestFruit{
    public static void testFruit(Fruit f){
        System.out.println("----Printing Detail-----");
        if(f.hasFormalin()){
            System.out.println("Do not eat the "+f.getName()+".");
            System.out.println(f);
            //you have to write toString method
        }else{
            System.out.println("Eat the "+f.getName()+".");
            System.out.println(f);
        }
    }
    public static void main(String [] args){
        Mango m = new Mango();
        testFruit(m);
        Jackfruit j = new Jackfruit();
        testFruit(j);
    }
}

/*
 ----Printing Detail-----
Do not eat the Mango.
Mangos are bad for you
----Printing Detail-----
Eat the Jackfruit.
Jackfruits are good for you
*/

 class Fruit{
    private boolean formalin = false;
    public String name = "";
    public Fruit(boolean formalin, String name){
        this.formalin = formalin;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public boolean hasFormalin(){
        return formalin;
    }
}

class Mango extends Fruit{
    public Mango(){
        super(true, "Mango");
        //As parent class has some parameters,
        // You have to set these values from child Or, call super
    }

    // now you have to write toString method
    public String toString(){
        return "Mangos are bad for you";
    }
}


class Jackfruit extends Fruit{
    public Jackfruit(){
        super(false , "Jackfruit");
        //As parent class has some parameters,
        // You have to set these values from child Or, call super
    }

}
