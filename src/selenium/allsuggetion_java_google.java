package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allsuggetion_java_google {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.google.com/");
driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("java");
List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(.,'java')]"));
for(WebElement all:allsugg)
{
	System.out.println(all.getText());
}
driver.close();
	}

}
