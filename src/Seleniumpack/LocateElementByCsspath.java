package Seleniumpack;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementByCsspath {

	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","/home/anuragsinghradi/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html");
		WebElement ageTextbox = driver.findElement(By.cssSelector("#cage"));
		ageTextbox.clear();
		ageTextbox.sendKeys("56");
		WebElement ageLabelByCss = driver.findElement(By.cssSelector("#calinputtable > tbody > tr:nth-child(1) > td:nth-child(1)"));
		System.out.println(ageLabelByCss.getText());
		List<WebElement> tablelstbyclass = driver.findElements(By.cssSelector(".cinfoT"));
		System.out.println("Number of tables = " + tablelstbyclass.size());
		for(int i=0;i<tablelstbyclass.size();i++)
		{
			System.out.println(tablelstbyclass.get(i).getTagName() + " "+tablelstbyclass.get(i).getAttribute("class"));
		}
		Thread.sleep(5000);
		driver.close();
	}

}
