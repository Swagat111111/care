package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniun_auttosugg_select_1st_index {
	public static void main(String[] args) {
		
	
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.google.com/");
driver.findElement(By.id("APjFqb")).sendKeys("selenium");
List<WebElement> allsug = driver.findElements(By.xpath("//span[contains(.,'selenium')]"));
for(WebElement all:allsug)
{
	System.out.println(all.getText());
}
System.out.println("KKKKKKKKK");
String text=allsug.get(0).getText();
System.out.println(text);
driver.close();
}
}