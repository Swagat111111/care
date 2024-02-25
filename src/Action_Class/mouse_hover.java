package Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_hover {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.vtiger.com/");
WebElement target = driver.findElement(By.xpath("(//a[@id='navbarPages'])[2]"));
Actions s=new Actions(driver);
s.moveToElement(target).perform();
driver.findElement(By.xpath("(//a[contains(.,' Contact Us')])[1]")).click();
String phoneno = driver.findElement(By.xpath("//p[contains(.,'Bengaluru, India')]/../p[2]")).getText();
System.out.println(phoneno);
driver.quit();
	}

}
