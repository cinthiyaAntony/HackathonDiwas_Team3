package lms.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	private WebDriver driver;
	private RegistrationPage regpage;
	private LoginPage loginpage;
	private AssignmentPage assignpage;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt='Facebook']")
	WebElement repageform;

	@FindBy(name = "login")
	WebElement logintxt;

	@FindBy(name = "websubmit")
	WebElement signup;

	@FindBy(name = "Login")
	WebElement loginbtn;

	@FindBy(name = "firstname")
	WebElement firstn;

	@FindBy(name = "lastname")
	WebElement lastn;

	@FindBy(name = "address")
	WebElement addr;

	@FindBy(name = "street name")
	WebElement stname;

	@FindBy(name = "city")
	WebElement cty;

	@FindBy(name = "State")
	WebElement stat;

	@FindBy(name = "zip")
	WebElement zipcode;

	@FindBy(id = "datepicker")
	WebElement bdate;

	@FindBy(name = "username")
	WebElement uname;

	@FindBy(name = "Phonenumber")
	WebElement pnum;

	@FindBy(name = "email")
	WebElement mail;

	@FindBy(name = "password")
	WebElement passwd;

	public void loginbtnClick() {
		loginbtn.click();
	}

	public boolean repageText() {
		return repageform.isDisplayed();
	}

	public String lgText() {
		return logintxt.getText();
	}

	public String signText() {
		return signup.getText();
	}

	public void signupClick() {
		signup.click();
	}

	public void fname(String firstNa) {
		firstn.sendKeys(firstNa);
	}

	public void lname(String lastNa) {
		lastn.sendKeys(lastNa);
	}

	public void addres(String address) {
		addr.sendKeys(address);
	}

	public void street(String str) {
		stname.sendKeys(str);
	}

	public void zipN(String zipU) {
		zipcode.sendKeys(zipU);
	}

	public void birthD(String bd) {
		bdate.sendKeys(bd);
	}

	public void userName(String un) {
		uname.sendKeys(un);
	}

	public void phoneNum(String pn) {
		pnum.sendKeys(pn);
	}

	public void passUser(String pwdU) {
		passwd.sendKeys(pwdU);
	}

	public void mailU(String ma) {
		mail.sendKeys(ma);
	}

	public void getpgSource() {
		String p = driver.getPageSource();
	}
}