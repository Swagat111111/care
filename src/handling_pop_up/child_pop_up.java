package handling_pop_up;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_pop_up {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
String parent = driver.getWindowHandle();
driver.findElement(By.xpath("//button[@id='login-google-button']")).click();
driver.findElement(By.xpath("//button[@id='apple-signin-button']")).click();
Set<String> allwd = driver.getWindowHandles();

for(String all:allwd)
{
	driver.switchTo().window(all);
	String title = driver.getTitle();
	System.out.println(title);
}
	}

}
