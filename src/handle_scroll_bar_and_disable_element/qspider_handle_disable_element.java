package handle_scroll_bar_and_disable_element;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qspider_handle_disable_element {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://demoapps.qspiders.com/ui?scenario=1");
driver.findElement(By.xpath("//li[.='Disabled']")).click();
Thread.sleep(2000);
JavascriptExecutor j=(JavascriptExecutor)driver;
j.executeScript("document.getElementById('name').value='sagar'");
Thread.sleep(2000);
j.executeScript("document.getElementById('email').value='sagar.swagat@gmail.com'");
Thread.sleep(2000);
j.executeScript("document.getElementById('password').value='hahahahah'");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}

}
