package handling_pop_up;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authentication_pop_up {

	public static void main(String[] args) throws InterruptedException  {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://demoapps.qspiders.com/ui?scenario=1");
driver.findElement(By.xpath("//section[.='Popups']")).click();
driver.findElement(By.xpath("//section[.='Authentication']")).click();
driver.findElement(By.linkText("Login")).click();
Thread.sleep(3000);
driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");

	}

}
