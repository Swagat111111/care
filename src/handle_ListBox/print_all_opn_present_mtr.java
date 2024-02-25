package handle_ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class print_all_opn_present_mtr {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/sagar/OneDrive/Desktop/MTR.html");
WebElement mtr = driver.findElement(By.id("mtr"));
Select s=new Select(mtr);
List<WebElement> allop = s.getOptions();
for(WebElement all:allop)
{
	System.out.println(all.getText());
}
driver.quit();

	}

}
