package handle_scroll_bar_and_disable_element;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_BBC_scroll_bar {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.bbc.com/");
JavascriptExecutor j=(JavascriptExecutor)driver;
j.executeScript("window.scrollBy(0,6000)");
//j.executeScript("window.scrollBy(0,3000)");
	}
}
