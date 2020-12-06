package amazonProject;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAppleProductList
{
	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","/home/anuragsinghradi/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Amazon Site Search box Element 
		WebElement amazonSearchTextBox =  driver.findElement(By.id("twotabsearchtextbox"));
		amazonSearchTextBox.sendKeys("Apple Mac Book");
		WebElement amazonSearchButton =  driver.findElement(By.xpath("//*[@id=\"nav-search-submit-text\"]/input"));
		amazonSearchButton.click();
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
