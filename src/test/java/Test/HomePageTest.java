package Test;

import org.junit.Test;
import org.testng.annotations.BeforeMethod;

import pojo.Browser;

public class HomePageTest extends BaseTest {
	@BeforeMethod
	public void OpenBrowser()
	{
		driver=Browser.openchrome("https://www.facebook.com/");
		
	}
	@Test
	public void Test() {
		System.out.println("test");		
	}

}
