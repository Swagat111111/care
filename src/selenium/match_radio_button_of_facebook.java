package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class match_radio_button_of_facebook {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
Thread.sleep(1000);
int rd = driver.findElement(By.xpath("//label[text()='Female']")).getLocation().getY();
int rd1=driver.findElement(By.xpath("//label[text()='Male']")).getLocation().getY();
int rd2=driver.findElement(By.xpath("//label[text()='Custom']")).getLocation().getY();

System.out.println(rd);
System.out.println(rd1);
System.out.println(rd2);
if(rd==rd1&&rd1==rd2)
{
	System.out.println("perfectly aligen and pass");
}
else
{
	System.out.println("perfectly not aligen and fail");
}
	}

}
