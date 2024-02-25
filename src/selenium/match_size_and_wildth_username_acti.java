package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class match_size_and_wildth_username_acti {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("http://localhost/login.do");
WebElement id = driver.findElement(By.id("username"));
int height = id.getSize().getHeight();
int width = id.getSize().getWidth();

WebElement psw = driver.findElement(By.name("pwd"));
int height1 = psw.getSize().getHeight();
int width1 = psw.getSize().getWidth();

if(height==height1 && width==width1)
{
	System.out.println("all same");
}
else
{
	System.out.println("notsame");
}
driver.close();
	}

}
