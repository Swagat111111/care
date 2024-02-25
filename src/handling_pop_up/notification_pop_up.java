package handling_pop_up;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notification_pop_up {

	public static void main(String[] args) {
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
WebDriver driver=new ChromeDriver(ch);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://www.yatra.com/");

	}

}
