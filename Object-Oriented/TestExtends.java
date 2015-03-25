class Vehicle {

	public int x, y;
	public Vehicle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}

        // /* Custom toString() Method.
	public String toString() {
		return "X=" + x + " " + "Y=" + y;
	}
        // /*

        public void moveForward(){
            this.x++;
        }

        public void moveLeft(){
            this.y++;
        }

  

}

class VehicleMove extends Vehicle{

    public VehicleMove(int x, int y){
        super(x,y);// If there is no parameter then you don't need to write it
    }

    public void moveRightDiagonal(){
        moveForward();
        moveLeft();
    }


}

 class PointToString {

	public static void main(String args[]) {
		Vehicle point = new Vehicle(10, 10);
		// using the Default Object.toString() Method
		System.out.println("Object toString() method : " + point);
		// implicitly call toString() on object as part of string concatenation
		String s = point + " testing";
		System.out.println(s);
	}
}
