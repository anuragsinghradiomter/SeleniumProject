package JavaOOP;

public class HDFCBank implements Bank{

	  public void debit()
	  {
	    System.out.println("HDFCBank - debit");
	   }

	  public void credit()
	  {
	    System.out.println("HDFCBank - credit");
	   }

	  public void transfermoney()
	  {
	    System.out.println("HDFCBank - transfermoney");
	   }
	//Apart from the unimplemented methods of Bank interface
	//class can have its own methods
	  public void getHDFCSpecificROI(){
	     System.out.println("HDFCBank - ROI");
	  }  


}
