package Seleniumpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementByCssSelector {

	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
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
		for(int i=0;i<tablelstbyclass.size();i++){
		System.out.println(tablelstbyclass.get(i).getTagName() + " "+tablelstbyclass.get(i).getAttribute("class"));
		}
		WebElement calButtonByCss = driver.findElement(By.cssSelector("#content > div.panel2 > table:nth-child(4) > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=image]:nth-child(2)"));
		System.out.println("Button Name " + calButtonByCss.getAttribute("value"));
		
		Thread.sleep(5000);
		driver.close();
	}

}
