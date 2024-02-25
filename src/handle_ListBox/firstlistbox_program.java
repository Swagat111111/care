package handle_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class firstlistbox_program {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/sagar/OneDrive/Desktop/MTR.html");
WebElement mtr = driver.findElement(By.id("mtr"));

Select s=new Select(mtr);
 s.selectByIndex(0);
	}

}
