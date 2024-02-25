package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Status_actitime {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("http://localhost/login.do");
boolean is = driver.findElement(By.xpath("//label[@id='keepLoggedInLabel']")).isSelected();

if(is==true)
{
	System.out.println("selected");
}
else
	System.out.println("not selected");

driver.close();
	}

}
