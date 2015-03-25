public class TestEquals {
    public static void main(String args[]){
        Point ab = new Point();
        ab.x= 32;
        ab.y = 30;

        Point d = new Point();
        d.x = 32;
        d.y = 30;
        
        //d= ab;
        if( d.equals(ab) )
            System.out.println("good");
        else
            System.out.println("bad");
    }


}
 class Point {

  public int x, y;
  public boolean equals(Object other) {
    if (other == this) return true;     // it will true if exactly same Object
    
    
    if (other == null) return false;
    if (getClass() != other.getClass()) return false;
    
    Point point = (Point)other;
    return (x == point.x && y == point.y);
  
     }
  
}

 /*
  public boolean equals(Car c) {

    if (o instanceof Car) {
      Car c = (Car) o;
      if (this.licensePlate.equals(c.licensePlate)) return true;
    }
    return false;

  }


  */
