package JavaOOP;

public class Stringmanipulation {
	public static void main(String[] args) {
		String s = "Selenium Training Online line   ";
		String s1 = "Selenium Training Online line";
		System.out.println("Length of the String s = "+ s.length());
		System.out.println("index Position of Online  = " + s.indexOf("Online"));
		//- 1 implies match not found 
		System.out.println("index Position of S = " + s.indexOf('S'));
		System.out.println("Change to Upper Case = " + s.toUpperCase());
		System.out.println("Change to Lower Case = " + s.toLowerCase());
		System.out.println("Char Position with help of Index = "+ s.charAt(0));
		System.out.println("Char Position with help of Index = "+ s.charAt(18));
		System.out.println("String Starting from index 18 = " + s.substring(18));
		System.out.println("String Starting at 18 and ending at 24 = " + s.substring(18,24));
		//Trim - it removes the left and right side padding of spaces
		if(s.trim().equals(s1))
			System.out.println("Stirng s and s1 - match found");
		else 
			System.out.println("String s and s1 - no match found");
		
		String browser1 = "Chrome ";
		String browser2 = "CHROME";
		//first remove the padding from both the strings if applicable
		//you have to convert the both the stirng to either lower or upper case or ignore case only can find a match
		boolean browserflag = browser1.trim().toUpperCase().equals(browser2);
		System.out.println("Does the browser match found = " + browserflag);
			
		String bmitext = "BMI = 20.1 kg/m2";
		int indexOfEq = bmitext.indexOf("=");
		int indexOfkg = bmitext.indexOf("kg");
		System.out.println("bmitext = " + bmitext + " indexOfEq = " + indexOfEq + " indexOfkg = " + indexOfkg);
		String sbmiextractedvalue = bmitext.substring(indexOfEq+1,indexOfkg-1).trim();
		System.out.println("Bmi Extracted Value = " + sbmiextractedvalue);
		//When the double value is in string format - though it is valid double value, i cant perform comparision, until i convert into double
		double bmivalue = Double.parseDouble(sbmiextractedvalue);
		boolean flg = Boolean.parseBoolean("true");
		System.out.println("Bmi value multiplied by 2 = "+ bmivalue*2);
		
		System.out.println("Replace line with at Simplilearn = " + s.replace("line", "at Simplilearn"));//replacing line with at Simplilearn
		System.out.println("Concatenation of 2 strings - " + s.concat("at Simplilearn")); //appending at the end
		System.out.println("Compare suing contains s1 and s = " + s1.contains(s));
		System.out.println("Compare suing contains s and s1 = " + s.contains(s1));
		System.out.println("Compare suing starts with  s1 and s = " + s1.startsWith(s));
		System.out.println("Compare suing starts with  s and s1 = " + s.startsWith(s1));
		//Conversion can be from Stting to number - int, double, float, boolean
		double price = 30.5;
		int qty = 10;
		double totalprice = price * qty;
		String stotalprice = String.valueOf(totalprice);
		String flag = String.valueOf(true);
		
	}

}