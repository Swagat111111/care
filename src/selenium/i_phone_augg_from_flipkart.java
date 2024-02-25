package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class i_phone_augg_from_flipkart {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("iphone");
List<WebElement> allsugg = driver.findElements(By.xpath("//div[@class='YGcVZO _2VHNef']"));
for(WebElement all:allsugg)
{
	System.out.println(all.getText());
}
System.out.println("lllll");
String s=allsugg.get(0).getText();
System.out.println(s);
	}

}
