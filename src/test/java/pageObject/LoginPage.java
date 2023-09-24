package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver idriver;
	
	public LoginPage(WebDriver rdriver) {
		idriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
	@FindBy(id="Email")
	private WebElement emailtbx;
	@FindBy(id="Password")
	private WebElement pwdtbx;
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginbtn;

	public void userEmail(String email) {
		emailtbx.sendKeys(email);
	}
   
	public void password(String pwd) {
		pwdtbx.sendKeys(pwd);
	}
	public void login() {
		loginbtn.click();
	}
	
	
	
}
