package reusability_of_code_by_upcasting;

import org.openqa.selenium.WebDriver;

public class demo {

	WebDriver driver;
	
	public static void test(WebDriver driver)
	{
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}
}
