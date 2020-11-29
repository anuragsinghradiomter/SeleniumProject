package JavaOOP;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		try {
		int n1 = 100;
		int n2 = 10;
		int Result = n1/n2; //divide by zero - Arithmetic Exception
		int[] arr = new int[5];
		arr[4] = 56; //Upper boun dcan be maximum size - 1 = 4 because array starts from index 0 to 4 when size = 5
		System.out.println("Result = " + Result);
		String s = null;
		System.out.println("length = " + s.length());
		//this will throw null pointer exception - there is no value in the string assigned and it is null
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("Null Pointer Exception");
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		finally {
			   System.out.println("Finally block");
			   
		   }

		System.out.println("Run the Rest of the Code");
	}

}