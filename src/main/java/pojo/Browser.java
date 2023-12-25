package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver openchrome(String url)
	{
		System.setProperty("webDriver.chrome.driver","C:\\Users\\Admin\\Desktop\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		return driver;
		
	}

}
