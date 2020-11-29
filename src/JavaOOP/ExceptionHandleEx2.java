package JavaOOP;

public class ExceptionHandleEx2 {

	public static void main(String[] args){
		   try{
		    ValidateAge(17);
		   }catch(Exception e){
		     if(e.getMessage().equals("Age below 18 - Not allowed"))
			{
		  	   System.out.println("Please enter Age above 18 - you must be of age 18");
			}
		   }
		}
	
	public static void ValidateAge(int age) throws Exception{
		  if(age <18)
		     throw new Exception("Age below 18 - Not allowed");
		}

}