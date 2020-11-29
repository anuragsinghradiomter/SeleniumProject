package JavaOOP;
public class Employee{
	 int empid;
	 String empname;
	  static String company;
	  static int count=0;
	  static{
		   company = "Godrej";  
		}

	 public Employee(){
		  System.out.println("Employee - Default Constructor");
		  count++;
		}
	 public Employee(int empid, String empname)
	 {
		 System.out.println("Employee Constructor - 2 parameters");
	   this.empid = empid;
	   this.empname = empname;
	   count++;
	 }
	 
	 public Employee(int empid, String empname, String company)
	 {
	   System.out.println("Employee- Parameterized Constructor");	 
	   this.empid = empid;
	   this.empname = empname;
	    this.company = company;
	    count++;
	 }
	 
	 public static void ChangeCompany(String comp)
	 {  
	  company = comp;
	 }

	  public void InsertEmpRecord(int id,String name,String comp){
	   empid = id;
	   empname= name;
	   company = comp;
	 }
	 public void displayEmpRecord(){
		 System.out.println("count = " + count + " empid = "+ empid + " empname = " + empname + " company = " + company);

	 }
	
	}