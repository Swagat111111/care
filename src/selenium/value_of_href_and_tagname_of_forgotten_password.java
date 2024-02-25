package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class value_of_href_and_tagname_of_forgotten_password {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/login.php");

WebElement ok = driver.findElement(By.xpath("//a[.='Forgotten account?']"));

String value = ok.getAttribute("href");
String tagname = ok.getTagName();
String text=ok.getText();
System.out.println(value);
System.out.println(tagname);
System.out.println(text);
driver.close();
	}

}
