package handling_tab;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime_tab_count {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> alltab = driver.getWindowHandles();
		int count = alltab.size();
		System.out.println(count);
		for(String all:alltab)
		{
			driver.switchTo().window(all);
			String tittle = driver.getTitle();
			System.out.println(tittle);
			driver.close();
		}
	}

}
