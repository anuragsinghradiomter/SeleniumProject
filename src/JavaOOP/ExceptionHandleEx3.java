package JavaOOP;

public class ExceptionHandleEx3 {

	public static void method1(){
		  System.out.println("method1 invoked");
		  throw new ArithmeticException();
		}
	public static void ValidateAge(int age) throws Exception{
		  if(age <18)
		     throw new Exception("Age below 18 - Not allowed");
		}

	public static void main(String[] args) throws Exception{
		   
		   try{
			    ValidateAge(17);
			   }catch(Exception e){
			     if(e.getMessage().equals("Age below 18 - Not allowed"))
				{
			  	   System.out.println("Please enter Age above 18 - you must be of age 18");
				}
			   }
		   
		   try{
				method1();
			}catch(Exception e)
			{  
			   System.out.println(e.getMessage());
			}
		   finally {
			   System.out.println("Finally block");
			   
		   }
		}

}
