package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
WebElement block1 = driver.findElement(By.xpath("//h1[.='Block 1']"));
WebElement block2 = driver.findElement(By.xpath("//h1[.='Block 4']"));
Actions s=new Actions(driver);
s.dragAndDrop(block1, block2).perform();
//s.dragAndDrop(block2, block1).perform();
driver.quit();
	}

}
