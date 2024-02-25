package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN714G0&p=facebook.com");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(1000);
		boolean is = driver.findElement(By.name("login")).isEnabled();
		if(is==true)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
