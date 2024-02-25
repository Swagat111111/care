package handling_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame1 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/sagar/OneDrive/Desktop/frame-12.html");
WebElement a = driver.findElement(By.id("t1"));
a.sendKeys("s");
driver.switchTo().frame(0);
 WebElement b = driver.findElement(By.id("t2"));
 b.sendKeys("s");
 driver.switchTo().defaultContent();
 a.sendKeys("a");
 driver.switchTo().frame(0);
 b.sendKeys("w");
	}

}
