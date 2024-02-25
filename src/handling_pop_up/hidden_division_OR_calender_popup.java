package handling_pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hidden_division_OR_calender_popup {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
driver.findElement(By.name("policynumber")).sendKeys("123");
driver.findElement(By.id("dob")).click();
WebElement month = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
Select s=new Select(month);
s.selectByVisibleText("Feb");
WebElement year = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
Select s1=new Select(year);
s1.selectByVisibleText("1996");
driver.findElement(By.xpath("//a[@data-date='17']")).click();
driver.findElement(By.id("alternative_number")).sendKeys("7008561299");
	}

}
