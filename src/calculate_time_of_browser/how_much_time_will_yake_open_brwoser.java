package calculate_time_of_browser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class how_much_time_will_yake_open_brwoser {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));

try
{
driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
System.out.println("page is loded within 5sec and pass");
}
catch(Exception e)
{
	System.out.println("page is not loded within 5sec and faill");
}
	}

}
