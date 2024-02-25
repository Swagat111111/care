package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetFrontColor {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
 WebElement type = driver.findElement(By.linkText("Forgotten password?"));
String color = type.getCssValue("color");
String size = type.getCssValue("font-size");
String type1 = type.getCssValue("font-family");
System.out.println(color);
System.out.println(type1);
System.out.println(size);
driver.quit();
	}

}
