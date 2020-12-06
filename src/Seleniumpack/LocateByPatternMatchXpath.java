package Seleniumpack;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByPatternMatchXpath {

	static WebDriver driver = null;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/anuragsinghradi/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html");
		driver.manage().window().maximize();
		System.out.println("Perform on a search on attribute id starting with c using xpath");
		List<WebElement> startsiwthidxpath = driver.findElements(By.xpath("//*[starts-with(@id,'c')]"));
		System.out.println("Number of elements starting with c = " + startsiwthidxpath.size());
		for(WebElement element : startsiwthidxpath){
			System.out.println(element.getAttribute("id"));
		}
		
		System.out.println("Perform on a search on attribute name containing on height using xpath");
		List<WebElement> containsnameheightxpath = driver.findElements(By.xpath("//*[contains(@name,'height')]"));
		System.out.println("Number of elements containing height = " + containsnameheightxpath.size());
		for(WebElement element : containsnameheightxpath){
			System.out.println(element.getAttribute("name"));
		}
		//does not work - comment it
/*		System.out.println("Perform on a search on attribute id ending with weight using xpath");
		List<WebElement> endswithidweightxpath = driver.findElements(By.xpath("//*[ends-with(@id,'weight')]"));
		System.out.println("Number of elements ends with weight = " + endswithidweightxpath.size());
		for(WebElement element : endswithidweightxpath){
			System.out.println(element.getAttribute("id"));
		}
*/		
	}

}
