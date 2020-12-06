package Seleniumpack;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertPopups
{

	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","/home/anuragsinghradi/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.online.citibank.co.in/products-services/online-services/internet-banking.htm");
		driver.manage().window().maximize();
		JavascriptExecutor js=null;
		Alert alert =null;
		String  alertMsg = null;
		js= (JavascriptExecutor)driver;
		js.executeScript("alert('User must valid credentials');"); ///create an informational alert
		//switch
		try{
			alert = driver.switchTo().alert();
			alertMsg = alert.getText();
			Thread.sleep(3000);
			alert.accept();//close the alert
			if(alertMsg.equals("User must enter valid credentials"))
			{
				System.out.println("Alert Message Match found");
			}
			else
			{
				System.out.println("Alert Message Match not found");
			}
		}
		catch(NoAlertPresentException e)
		{
			System.out.println("No Alert Present Exception");
		}
		try
		{	
			js.executeScript("confirm('Do you want to continue(y/n)?');"); ///create an informational alert
			alert = driver.switchTo().alert();
			alertMsg = alert.getText();
			Thread.sleep(3000);
			alert.dismiss();//Click on Cancel button
			if(alertMsg.equals("User must enter valid credentials"))
			{
				System.out.println("ALert Message Match found");
			}
			else
			{
				System.out.println("ALert Message Match not found");
			}
		}
		catch(UnhandledAlertException e)
		{
			System.out.println("Unhandled Alert Exception");
		}
	}
}