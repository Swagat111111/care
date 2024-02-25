package handling_pop_up;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert1 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://demo.automationtesting.in/Alerts.html");
driver.findElement(By.xpath("//a[.='Alert with OK ']")).click();
driver.findElement(By.xpath("//button[contains(text(),' click the button to display an  alert b')]")).click();
Alert a = driver.switchTo().alert();
a.accept();
driver.quit();

	}

}
