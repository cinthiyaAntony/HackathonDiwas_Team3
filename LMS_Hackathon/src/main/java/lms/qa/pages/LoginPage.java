package lms.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;

	private RegistrationPage regPage;

	private LoginPage loginpage;

	public LoginPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "username")

	WebElement username;

	@FindBy(name = "password")

	WebElement password;

	@FindBy(xpath = "//input[@value = 'Log In']")

	WebElement btnlogin;

	@FindBy(xpath = "//div[@class='ErrorAlert']")

	WebElement pwdError;

	@FindBy(id = "code")

	WebElement logincode;

	@FindBy(linkText = "forgot password")

	WebElement forgotpwd;

	@FindBy(id = "email")

	WebElement eleEmail;

	@FindBy(xpath = "//input[@value = 'continue']")

	WebElement toContinue;

	@FindBy(xpath = "//div[contains(text(), 'verification code')]")

	WebElement codebtxt;

	@FindBy(xpath = "//div[contains(text(),'click here')]")

	WebElement clickhere;

	@FindBy(id = "new password")

	WebElement newPwd;

	@FindBy(id = "Retype passwpord")

	WebElement rePwd;

	@FindBy(id = "submit")

	WebElement submitbtn;

	@FindBy(id = "cancel")

	WebElement cancelbtn;

	public void getUsername(String uname) {

		username.sendKeys(uname);

	}

	public void getPassword(String pwd) {

		password.sendKeys(pwd);

	}

	public void clicklogin() {

		btnlogin.click();

	}

	public String getTitleofPage() {

		return driver.getTitle();

	}

	public String getStatus() {

		return pwdError.getText();

	}

	public void codeForLogin(String num) {

		logincode.sendKeys(num);

	}

	public void forgotclick() {

		forgotpwd.click();

	}

	public void getEmail(String email) {

		eleEmail.sendKeys(email);

	}

	public void continueclick() {

		toContinue.click();

	}

	public void verificationCode(String code) {

		codebtxt.sendKeys(code);

	}

	public void getVerificationPage() {

//regPage.loginbutton(); 

		forgotclick();

		toContinue.click();

	}

	public void clickresend() {

		clickhere.click();

	}

	public void passwordPage(String newpass, String repass) {

		newPwd.sendKeys(newpass);

		rePwd.sendKeys(repass);

	}

	public void submitClick() {

		submitbtn.click();

	}

	public void cancelClick() {

		cancelbtn.click();

	}

}