package Seleniumpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElemetByxpath {

	public static WebDriver driver =null;
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","/home/anuragsinghradi/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html");
		WebElement metricUnit = driver.findElement(By.xpath("//*[@id=\"topmenu\"]/ul/li[2]/a"));
		metricUnit.click();
		Thread.sleep(1000);
		WebElement ageTextbox = driver.findElement(By.id("cage"));
		WebElement genderRadio = driver.findElement(By.id("csex2"));
		WebElement heightTextbox = driver.findElement(By.id("cheightmeter"));
		WebElement weightTextbox = driver.findElement(By.id("ckg"));
		ageTextbox.clear();
		ageTextbox.sendKeys("35");
		Thread.sleep(1000);
		genderRadio.click();
		Thread.sleep(1000);
		heightTextbox.clear();
		heightTextbox.sendKeys("190");
		Thread.sleep(1000);
		weightTextbox.clear();
		weightTextbox.sendKeys("115");
		WebElement calculateButton = driver.findElement(By.xpath("//*[@id='content']/div[5]/table[4]/tbody/tr[3]/td[2]/input[2]"));
		calculateButton.click();  
			
		Thread.sleep(5000);
		driver.close();
	}

}
