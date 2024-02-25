package handling_pop_up;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_all_window_except_parent_window {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
driver.findElement(By.id("login-google-button")).click();
driver.findElement(By.id("apple-signin-button")).click();
String parent = driver.getTitle();
Set<String> allwd = driver.getWindowHandles();
for(String all:allwd)
{
	driver.switchTo().window(all);
	if((driver.getTitle().contains(parent)))
	{
		driver.close();
	}
}
	}

}
