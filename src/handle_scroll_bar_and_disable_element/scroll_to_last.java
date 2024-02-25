package handle_scroll_bar_and_disable_element;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_to_last {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.bbc.com/");
JavascriptExecutor j=(JavascriptExecutor)driver;
j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
Thread.sleep(1000);
j.executeScript("window.scrollTo(0,0)");
	}

}
