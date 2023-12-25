package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLoginPage {
	@FindBy(xpath="//input[@name=\"email\"]")private WebElement email;
	@FindBy(xpath="//input[@name=\"pass\"]")private WebElement password;
	@FindBy(xpath="//buttont[@name=\"login\"]")private WebElement Login;
	@FindBy(xpath="//a[text()=\"Forgotten password?\"]")private WebElement Forgetpassword;
	@FindBy(xpath="//a[@role='button']")private WebElement CreatenewAccount;
	@FindBy(xpath="//img[@class='fb_logo _8ilh img']")private WebElement Logo;
	
	public FaceBookLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enterEmailId(String mailId)
	{
	 email.sendKeys(mailId);
	}
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
		
	}
	public void ClickLogin() {
		Login.click();
	}
	public void Forgetpassword()
	{
		Forgetpassword.click();
	}
	public void CreatenewAccount() {
		CreatenewAccount.click();
	}
	public boolean isLogoDisplayed()
	{
	
	return Logo.isDisplayed();
	}
}


