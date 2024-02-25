package handling_pop_up;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_all_window_without_specific_window {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the window");
String s=sc.nextLine();
WebDriver driver=new ChromeDriver();
driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
driver.findElement(By.id("login-google-button")).click();
driver.findElement(By.id("apple-signin-button")).click();
Set<String> allw = driver.getWindowHandles();
for(String all:allw)
{
	driver.switchTo().window(all);
	if(!(driver.getTitle().contains(s)))
	{
		driver.close();
	}
}

	}

}
