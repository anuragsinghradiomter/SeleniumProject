package Seleniumpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitExample {
	static WebDriver driver = null;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/anuragsinghradi/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ComponentsMenu =  driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[3]/a"));
		ComponentsMenu.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		try
		{
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='menu']/div[2]/ul/li[3]/div/div/ul/li[2]/a")));
		WebElement MonitorsLink = driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[3]/div/div/ul/li[2]/a"));
		MonitorsLink.click();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Monitors Link not found");
		}
	}
}