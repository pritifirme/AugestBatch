package Test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;

import org.testng.annotations.Test;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import pojo.Browser;
import pom.FaceBookLoginPage;
import utility.Reports;


@Listeners(Listner.class)
public class FaceBookLoginTest extends BaseTest{
	//WebDriver driver;
	ExtentReports extentReports; 
	ExtentTest test;
	@BeforeTest
	public void configureReports() {
		extentReports=Reports.generateReports();
	}
    @BeforeMethod
	public void openbrowser() {
	driver=Browser.openchrome("https://www.facebook.com/");
	}
	
	
	@Test
	public void validnameanduserpassword() {
		
		FaceBookLoginPage facebookLoginPage=new FaceBookLoginPage(driver);
		facebookLoginPage.enterEmailId("Arise@gmail.com");
		facebookLoginPage.enterPassword("12345");
		facebookLoginPage. ClickLogin();
		facebookLoginPage. Forgetpassword();
	}
	@Test
	public void invalidnameandvalidpassword() {
		FaceBookLoginPage facebookLoginPage=new FaceBookLoginPage(driver);
		facebookLoginPage.enterEmailId("A.com");
		facebookLoginPage.enterPassword("12345");
		facebookLoginPage. ClickLogin();
		facebookLoginPage. Forgetpassword();
		
	}
	@Test
	public void validnameandinvalidpassword() {
		FaceBookLoginPage facebookLoginPage=new FaceBookLoginPage(driver);
		facebookLoginPage.enterEmailId("Arise@gmail.com");
		facebookLoginPage.enterPassword("11111");
		facebookLoginPage. ClickLogin();
		facebookLoginPage. Forgetpassword();
	}
	@Test
	public void verifyLogoisDisplay() {
		test=extentReports.createTest("verifyLogoisDisplay");
		FaceBookLoginPage facebookLoginPage=new FaceBookLoginPage(driver);
		boolean result=facebookLoginPage.isLogoDisplayed();
		
		SoftAssert soft=new SoftAssert();
		AssertJUnit.assertTrue(result);
		facebookLoginPage.enterEmailId("Arise@gmail.com");
		facebookLoginPage.enterPassword("12345");
		facebookLoginPage. ClickLogin();
		facebookLoginPage. Forgetpassword();
		AssertJUnit.assertTrue(true);
		
		
	}
	@Test
	public void verifyLoginPageTitle() {
		test=extentReports.createTest("verifyLoginPageTitle");
		FaceBookLoginPage facebookLoginPage=new FaceBookLoginPage(driver);
		String ExpectedTitle="Facebook – log in or sign up";
		String actualTitle=driver.getTitle();
		AssertJUnit.assertEquals(actualTitle, ExpectedTitle);
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
	@AfterMethod
	public void addTestStatus(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS,result.getName());
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL,result.getName());
			
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP,result.getName());
		}
		
	}
	

}
