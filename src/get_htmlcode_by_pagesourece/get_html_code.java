package get_htmlcode_by_pagesourece;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_html_code {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
String url = driver.getPageSource();
System.out.println(url);

	}

}
