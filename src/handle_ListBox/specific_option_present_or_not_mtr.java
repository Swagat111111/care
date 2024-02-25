package handle_ListBox;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class specific_option_present_or_not_mtr {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/sagar/OneDrive/Desktop/MTR.html");
 String s="idl";
 WebElement mtr = driver.findElement(By.id("mtr"));
 Select m=new Select(mtr);
 List<WebElement> allop = m.getOptions();
 int count=0;
 for(int i=0;i<allop.size();i++)
 {
	 String text = allop.get(i).getText();
	 if(s.equals(text))
	 {
 count++;
 
	 }
 }
	 if(count>=1)
	 {
		 System.out.println("item is present");
	 }
else
{
 System.out.println("item is not present");
 
}
	 driver.quit();
 }
 
 
	}


