package handle_ListBox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class print_alloption_in_alphabetical_order {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/sagar/OneDrive/Desktop/MTR.html");
WebElement mtr = driver.findElement(By.id("mtr"));
TreeSet<String>t=new TreeSet<String>();
Select s=new Select(mtr);
List<WebElement> allop = s.getOptions();
for(WebElement all:allop)
{
	
	String text = all.getText();
	t.add(text);
}
for(String a:t)
{
	System.out.println(a);
}
driver.quit();
	}

}
