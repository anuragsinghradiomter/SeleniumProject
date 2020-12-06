package Seleniumpack;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleWindowNavigation
{
	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","/home/anuragsinghradi/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.online.citibank.co.in/products-services/online-services/internet-banking.htm");
		driver.manage().window().maximize();
		String ParentWindowID = driver.getWindowHandle();
		System.out.println("Parent Window ID = " + ParentWindowID);
		WebElement LoginNow = driver.findElement(By.xpath("//*[@title='LOGIN NOW']"));
		LoginNow.click();
		Set<String> winids = driver.getWindowHandles();
		Iterator <String> iter = winids.iterator(); //it is used to iterate through elements of set
		String mainWindowID = iter.next();
		String subWindowID = iter.next();
		System.out.println("Number of Open windows = " + winids.size());
		System.out.println("Main window id = " + mainWindowID);
		System.out.println("sub window id = " + subWindowID);
		//switch to sub window
		driver.switchTo().window(subWindowID); //switched to sub window
		WebDriverWait wait = new WebDriverWait(driver,30);
		try
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("User_Id")));
			WebElement User_Id = driver.findElement(By.id("User_Id"));
			User_Id.sendKeys("Selenium");
			Thread.sleep(3000);
			driver.close(); //this would close the sub window
			driver.switchTo().window(mainWindowID);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.id("topMnuinsurance")).click();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Element not found");
		}
		catch(NoSuchWindowException e)
		{
			System.out.println("Requires Switch to Main Window");
		}
		
		Thread.sleep(5000);
		driver.close();
	}
}