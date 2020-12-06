package Seleniumpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChangingDropDownValues
{
	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","/home/anuragsinghradi/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html");
		WebElement activitydd = driver.findElement(By.id("cactivity"));
		Select dd = new Select(activitydd);
		System.out.println("Default Dropdown value is " + dd.getFirstSelectedOption().getText());
		dd.selectByIndex(0);
		Thread.sleep(3000);
		System.out.println("Changed Dropdown value to Basal at index 0  " + dd.getFirstSelectedOption().getText());
		dd.selectByValue("1.55");
		Thread.sleep(3000);
		System.out.println("Changed Dropdown value to Value = 1.55 " + dd.getFirstSelectedOption().getText());
		dd.selectByVisibleText("Extra Active: very intense exercise daily, or physical job");
		Thread.sleep(3000);
		System.out.println("Changed Dropdown value by VisibleText = Extra Active " + dd.getFirstSelectedOption().getText());
		System.out.println("Is the dropdown multiselect - yes/no - " + dd.isMultiple());//it is not a multiselect drop - it will fail
		
		List<WebElement> containsActiveList = driver.findElements(By.xpath("//*[@id='cactivity']/option[contains(text(),'Active')]"));
		for(WebElement element : containsActiveList)
		{
			System.out.println(element.getText());
		}
		
		WebElement extraActive = driver.findElement(By.xpath("//*[@id='cactivity']/option[text()='Extra Active: very intense exercise daily, or physical job']"));
		System.out.println(extraActive.getText());	
		
		Thread.sleep(5000);
		driver.close();
	}
}