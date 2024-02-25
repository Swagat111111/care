package handle_ListBox;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class allopn_without_duplicate {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sagar/OneDrive/Desktop/MTR.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select s=new Select(mtr);
		List<WebElement> allop = s.getOptions();
		LinkedHashSet <String>sh=new LinkedHashSet<String>();
		for(int i=0;i<allop.size();i++)
		{
			String text = allop.get(i).getText();
		sh.add(text);
		}
		
		
		for( String all:sh)
		{
			System.out.println(all);
		}
	}

}
