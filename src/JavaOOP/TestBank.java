package JavaOOP;

public class TestBank{
public static void main(String[] args){
   HDFCBank hdfc = new HDFCBank();
   hdfc.debit();
   hdfc.credit();
   hdfc.transfermoney();
   hdfc.getHDFCSpecificROI();
  
  CitiBank citi = new CitiBank();
   citi.debit();
   citi.credit();
   citi.transfermoney();
   citi.getMinBal();

   //we can point the classes implementing the interface to the interface object itself - then we have one object reference for both the citibank and HDFCBank classes and we can only access the common behavior of both the class which is nothing specified in the interface
  Bank b = new HDFCBank();
  b.debit();
  b.credit();
  b.transfermoney();
  //b.getHDFCSpecificROI(); //will not be accessible here since we are pointing to the interface
  Bank c = new CitiBank();
  c.debit();
  c.credit();
  c.transfermoney();
  }
}
