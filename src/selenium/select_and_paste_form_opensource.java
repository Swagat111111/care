package selenium;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class select_and_paste_form_opensource {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
Thread.sleep(1000);
driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"ac");
Thread.sleep(1000);
driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"av");
Thread.sleep(1000);
driver.close();
	}

}
