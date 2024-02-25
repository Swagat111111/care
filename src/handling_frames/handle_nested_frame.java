package handling_frames;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_nested_frame {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://demoapps.qspiders.com/ui?scenario=1");
driver.findElement(By.xpath("//section[text()='Frames']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//section[text()='iframes']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
Thread.sleep(2000);
driver.switchTo().frame(0);
driver.switchTo().frame(0);
driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
driver.findElement(By.id("password")).sendKeys("Admin@1234");
driver.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
driver.findElement(By.id("submitButton")).click();
Thread.sleep(2000);
Alert a = driver.switchTo().alert();
String text = a.getText();
System.out.println(text);
if(text.equals("Signed Up Successfully"))
{
System.out.println("text is showing and pass");
}
else
{
System.out.println("text is not showing and fail");
}
a.accept();
driver.quit();
	}

}
