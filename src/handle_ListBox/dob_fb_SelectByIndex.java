package handle_ListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import selenium.select_and_paste_form_opensource;

public class dob_fb_SelectByIndex {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
WebElement day = driver.findElement(By.id("day"));
Select s=new Select(day);
s.selectByVisibleText("17");
WebElement month = driver.findElement(By.id("month"));
Select s1=new Select(month);
Thread.sleep(1000);
s1.selectByValue("2");
WebElement year = driver.findElement(By.id("year"));
Select s2=new Select(year);
Thread.sleep(1000);
s2.selectByValue("1996");
	}

}
