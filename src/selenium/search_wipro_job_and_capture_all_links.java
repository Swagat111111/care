package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class search_wipro_job_and_capture_all_links {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.google.com/");
driver.findElement(By.id("APjFqb")).sendKeys("wipro jobs"+Keys.ENTER);
List<WebElement> alllinks = driver.findElements(By.xpath("//a[@jsname='UWckNb']"));
for(WebElement all:alllinks)
{
	System.out.println(all.getAttribute("href"));
}
driver.quit();
	}

}
