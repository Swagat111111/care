package handle_scroll_bar_and_disable_element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_disable_element {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/sagar/OneDrive/Desktop/disabled.html");
driver.findElement(By.id("d1")).sendKeys("admin");
JavascriptExecutor j=(JavascriptExecutor)driver;
j.executeScript("document.getElementById('d2').value='manager'");
j.executeAsyncScript("document.getElementById('d2').value=''");
driver.findElement(By.id("d3")).click();
	}

}
