package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplay {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN714G0&p=facebook.com");
driver.findElement(By.xpath("//a[text()='Login']")).click();
boolean logo = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
if(logo==true)
{
	System.out.println("displayed");}
else
	System.out.println("not displayed");
driver.quit();
	}

}
