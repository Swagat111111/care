package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allLinks_amazon {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.flipkart.com/");


List<WebElement> all = driver.findElements(By.xpath("//a"));

for(int i=0;i<all.size();i++)
{
	String text = all.get(i).getText();
	System.out.println(text);
}
driver.quit();
	}

}
