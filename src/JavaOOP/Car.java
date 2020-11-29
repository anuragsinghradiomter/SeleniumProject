package JavaOOP;

public class Car extends Vehicle{
	   double speed = 100;
	   public void Run(){
		   // System.out.println("Car class - Run method");
		      super.Run();
		      System.out.println(super.speed);

	   }

	  public static void main(String[] args){
		     Car c = new Car();
		     //c.speed = 60;
		     System.out.println("Speed is " + c.speed);
		     c.Run();
		   }

}
