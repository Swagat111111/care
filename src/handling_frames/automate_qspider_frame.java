package handling_frames;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automate_qspider_frame {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
driver.findElement(By.xpath("//section[text()='Frames']")).click();
driver.findElement(By.xpath("//section[text()='iframes']")).click();
driver.switchTo().frame(0);
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.id("password")).sendKeys("manager");
driver.findElement(By.id("submitButton")).click();
Thread.sleep(500);
Alert a = driver.switchTo().alert();
String text=a.getText();
System.out.println(text);
	}

}
