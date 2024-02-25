package handling_pop_up;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_popup {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://demoapps.qspiders.com/ui?scenario=1");
driver.findElement(By.xpath("//section[.='Popups']")).click();
driver.findElement(By.xpath("//section[.='Javascript']")).click();
driver.findElement(By.xpath("//button[.='Alert Box']")).click();
Thread.sleep(1000);
driver.switchTo().alert().accept();
	}

}
