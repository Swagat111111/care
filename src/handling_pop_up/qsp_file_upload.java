package handling_pop_up;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qsp_file_upload {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://demoapps.qspiders.com/ui?scenario=1");
driver.findElement(By.xpath("//section[.='Popups']")).click();
driver.findElement(By.xpath("//section[.='File Uploads']")).click();
File f=new File("./file/Sagar_3+year_Automation.pdf");
String path = f.getAbsolutePath();
driver.findElement(By.id("fileInput")).sendKeys(path);
//driver.quit();
	}

}
