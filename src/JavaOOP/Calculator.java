package JavaOOP;

public class Calculator{

/*  public void sum(int n1,int n2)
  {
    System.out.println("sum(int,int)");
  }
*/
  public void sum(int n1, int n2, int n3)
  {
       System.out.println("sum(int,int,int)");
  }

  
  public void sum(double n1,int n2) {
	  System.out.println("sum(double,int)");
  
 }
 
  public static void main(String[] args){
    Calculator c = new Calculator();
    c.sum(100,200);
    c.sum(100,200,300);
    c.sum(20.5, 100);
  }
}