package handling_pop_up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class print_pop_up {

	public static void main(String[] args) throws AWTException, InterruptedException {
WebDriver driver=new FirefoxDriver();
driver.get("https://www.selenium.dev/");
Robot r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_P);
r.keyRelease(KeyEvent.VK_CONTROL);
Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_TAB);

for(int i=0;i<4;i++)
{
	r.keyPress(KeyEvent.VK_DOWN);
}
	}

}
