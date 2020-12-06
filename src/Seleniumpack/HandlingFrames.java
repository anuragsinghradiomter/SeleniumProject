package Seleniumpack;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames
{
	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","/home/anuragsinghradi/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		WebElement frameElement = driver.findElement(By.className("demo-frame"));
		try
		{
			driver.switchTo().frame(frameElement);
			//driver.switchTo().frame(1);
			WebElement draggable = driver.findElement(By.id("draggable"));
			WebElement droppable = driver.findElement(By.id("droppable"));
			Actions actions = new Actions(driver);
			actions.dragAndDrop(draggable, droppable).build().perform();
			if(droppable.getText().equals("Dropped!"))
			{
				System.out.println("Drop is successful");
			}
			else
			{
				System.out.println("Drop was not successful");
			}
		}
		catch(NoSuchFrameException e)
		{
			System.out.println("Frame is not Found");
		}
		
		Thread.sleep(5000);
		driver.close();
	}
}