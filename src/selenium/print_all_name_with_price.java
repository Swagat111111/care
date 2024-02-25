package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_all_name_with_price {

	public static void main(String[] args) {
WebDriver driver =new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.findElement(By.name("q")).sendKeys("one plus mobile"+Keys.ENTER);
List<WebElement> alln = driver.findElements(By.xpath("//div[contains(@class,'_4rR01T')]"));
List<WebElement> price = driver.findElements(By.xpath("//div[contains(@class,'_30jeq3 _1_WHN1')]"));
for(int i=0;i<price.size();i++)
{
	String name = alln.get(i).getText();
	String rupees = price.get(i).getText();
	System.out.println(name+"==>>"+rupees);
}
driver.quit();
	}
	
}
