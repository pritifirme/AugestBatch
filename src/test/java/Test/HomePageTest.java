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
	public void test1() {
		System.out.println("Test1");
	}
	@Test
	public void Test2() {
		System.out.println("test2");
	}

}
