package handling_pop_up;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmation_popup {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://demo.automationtesting.in/Alerts.html");
driver.findElement(By.xpath("//a[.='Alert with OK & Cancel ']")).click();
driver.findElement(By.xpath("//button[.='click the button to display a confirm box ']")).click();
Alert a=driver.switchTo().alert();
a.dismiss();
boolean msg = driver.findElement(By.xpath("//p[.='You Pressed Cancel']")).isDisplayed();
if(msg==true)
{
	System.out.println("displayed and pass");
}
else
{
	System.out.println("not displayed and failed");
}
driver.quit();
	}

}
