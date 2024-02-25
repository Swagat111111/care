package handling_pop_up;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_upload_popup {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/sagar/OneDrive/Desktop/cv.html");
File f=new File("./file/Sagar_3+year_Automation.pdf");
String absl = f.getAbsolutePath();
driver.findElement(By.id("cv")).sendKeys(absl);

	}

}
