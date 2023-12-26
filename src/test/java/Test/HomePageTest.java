package Test;

import org.testng.annotations.BeforeMethod;

import pojo.Browser;

public class HomePageTest extends BaseTest {
	@BeforeMethod
	public void OpenBrowser()
	{
		driver=Browser.openchrome("https://www.facebook.com/");
		
	}

}
