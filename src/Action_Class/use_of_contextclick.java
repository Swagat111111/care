package Action_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class use_of_contextclick {

	public static void main(String[] args) throws AWTException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://localhost/login.do");
WebElement target = driver.findElement(By.linkText("actiTIME Inc."));
Actions s=new Actions(driver);
s.contextClick(target).perform();
Robot r=new Robot();
r.keyPress(KeyEvent.VK_W);



	}

}
