package reusability_of_code_by_upcasting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demodriver {
WebDriver driver;

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
demo.test(driver);
WebDriver driver1=new FirefoxDriver();
demo.test(driver1);
	}

}
