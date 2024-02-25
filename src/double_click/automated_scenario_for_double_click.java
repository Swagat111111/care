package double_click;

import static org.testng.Assert.expectThrows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class automated_scenario_for_double_click {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.vtiger.com/");
WebElement target = driver.findElement(By.xpath("(//a[@id='navbarPages'])[2]"));
Actions s=new Actions(driver);
s.moveToElement(target).perform();
 driver.findElement(By.xpath("((//ul[@class='list'])[6]/li/a)[1]"));
 WebElement Double=driver.findElement(By.xpath("//span[text()='Login']"));
Actions a=new Actions(driver);
a.doubleClick(Double).perform();
boolean display = driver.findElement(By.xpath("//img[@class='mb-4']")).isDisplayed();
if(display==true)
{
	System.out.println("Login page is display and pass");
}
else
{
	System.out.println("Login page is not display and fail");
}
driver.close();

}
}