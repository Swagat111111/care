package TakesScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class take {

	public static void main(String[] args) throws IOException {
WebDriver driver =new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.id("APjFqb")).sendKeys("fb"+Keys.ENTER);
TakesScreenshot t=(TakesScreenshot)driver;
File src = t.getScreenshotAs(OutputType.FILE);
File des=new File("./screenshot/ss.png");
FileUtils.copyFile(src, des);

	}

}
