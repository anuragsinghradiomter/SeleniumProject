package JavaOOP;

public class TestCar{
	   public static void main(String[] args){
	     Car c = new Car();
	     c.speed = 60;
	     System.out.println("Speed is " + c.speed);
	     c.Run();
	   }
	}