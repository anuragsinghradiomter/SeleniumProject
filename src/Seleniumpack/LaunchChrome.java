package Seleniumpack;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
	//We need to point the chromedriver exe to the path of the executable
	System.setProperty("webdriver.chrome.driver","/home/anuragsinghradi/Downloads/chromedriver");   
	//Create an instance of ChromeDriver to launch chrome browser
	ChromeDriver driver = new ChromeDriver();
	//To navigate to the application url
	driver.get("https://www.calculator.net/calorie-calculator.html");
	Thread.sleep(2000);
	//driver.close();
	
	}

}
