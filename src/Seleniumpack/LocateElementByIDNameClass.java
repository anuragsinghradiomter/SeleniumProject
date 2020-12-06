package Seleniumpack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class LocateElementByIDNameClass {
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
		
		//Task 2
		System.out.println("attribute value of type of ageTextbox = " + ageTextbox.getAttribute("type"));
		System.out.println("attribute value of id of ageTextbox = " + ageTextbox.getAttribute("id"));
		System.out.println("attribute value of name of ageTextbox = " + ageTextbox.getAttribute("name"));
		System.out.println("attribute value of class of ageTextbox = " + ageTextbox.getAttribute("class"));
		System.out.println("attribute value of value of ageTextbox = " + ageTextbox.getAttribute("value"));
		System.out.println("CSS value of width of ageTextbox = " + ageTextbox.getCssValue("width"));
		System.out.println("Tagname of ageTextbox = " + ageTextbox.getTagName());
		
		//Task 3
		//for List import the right package java.util.List
		List <WebElement> genderList = driver.findElements(By.name("csex"));
		for(WebElement gender:genderList)
		{
		  if(gender.getAttribute("value").equals("m"))
		     if(!gender.isSelected())
		     {
		           gender.click();
		           break;
		     }
		}
		
		//Task 4 Working with table
		WebElement table = driver.findElement(By.className("cinfoT"));
		List <WebElement> rows = table.findElements(By.tagName("tr"));
		
		//we loop through all the rows - then with respect to each row, we get the cell values
		
		for(WebElement row : rows)
		{
		  List <WebElement> cols = row.findElements(By.tagName("td"));
		  for(WebElement col : cols)
		   {
		      System.out.print(col.getText() + "\t");
		   }
		   System.out.print("\n"); 
		}
		
		Thread.sleep(5000);
		driver.close();
	}

}

