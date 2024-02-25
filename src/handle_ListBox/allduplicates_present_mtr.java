package handle_ListBox;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class allduplicates_present_mtr {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/sagar/OneDrive/Desktop/MTR.html");
WebElement mtr = driver.findElement(By.id("mtr"));
Select s=new Select(mtr);
List<WebElement> allop = s.getOptions();
HashSet<String>h=new HashSet<String>();
for(WebElement all:allop)
{
	String text = all.getText();
	if(!(h.add(text)==false))
	{
		System.out.println(text);
	}
}
	}

}
