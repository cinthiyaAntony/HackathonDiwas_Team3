package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lms.qa.factory.driverFactory;
import lms.qa.pages.LoginPage;
import lms.qa.pages.RegistrationPage;

public class LoginSteps {

	private RegistrationPage regpage;
	private WebDriver driver;
	private LoginPage loginpage = new LoginPage(driverFactory.getDriver());
	private static String title;

	@Given("user is on home page")
	public void user_is_on_home_page() {
		driverFactory.getDriver().get("https://parabank.parasoft.com/parabank/index.htm"); // login
	}

	@When("user clicks login")
	public void user_clicks_login() {
		// regpage.loginbtnClick();
	}

	@Then("validate user is on login page")
	public void validate_user_is_on_login_page() {
		String lgTitle = loginpage.getTitleofPage();
		Assert.assertTrue(lgTitle.contains("ParaBank"));
		// Assert.assertEquals("ParaBank | Welcome | Online Banking",lgTitle);
	}

	// 1
	@When("user enters {string}  {string}  and click")
	public void user_enters_and_click(String username, String password) {
		loginpage.getUsername(username);
		loginpage.getPassword(password);
		loginpage.clicklogin();
	}

	@Then("user see {string} of the message")
	public void user_see_of_the_message(String status) {
		if (status == "Manage Program") {
			String title = loginpage.getTitleofPage();
			Assert.assertTrue(title.contains("Manage Program"));
		} else {
			String txt = loginpage.getStatus();
			Assert.assertTrue(txt.contains(status));
		}
	}

	@When("admin or staff enters {string} {string} {string} and click")
	public void admin_or_staff_enters_and_click(String name, String pwd, String code) {
		loginpage.getUsername(name);
		loginpage.getPassword(pwd);
		loginpage.codeForLogin(code);
		loginpage.clicklogin();
	}

	@Then("admin or staff see {string}")
	public void admin_or_staff_see(String message) {
		if (message == "Manage Program") {
			title = loginpage.getTitleofPage();
			Assert.assertTrue(title.contains("Manage Program"));
		} else {
			String txt = loginpage.getStatus();
			Assert.assertTrue(txt.contains(message));
		}
	}

	@When("Admin\\/User\\/Staff clicks Forgot password link")
	public void admin_user_staff_clicks_forgot_password_link() {
		loginpage.forgotclick();
	}

	@Then("It should redirected to forgot Password page")
	public void it_should_redirected_to_forgot_password_page() {
		title = loginpage.getTitleofPage();
		Assert.assertTrue(title.contains("Password"));
	}

	@Given("Admin\\/User\\/Staff is on Forgot Password Page")
	public void admin_user_staff_is_on_forgot_password_page() {
		loginpage.forgotclick();
	}

	@When("Admin\\/User\\/Staff  clicks continue after entering valid {string}")
	public void admin_user_staff_clicks_continue_after_entering_valid(String email) {
		loginpage.getEmail(email);
		loginpage.continueclick();
	}

	@Then("Admin\\/User\\/Staff should be redirected to enter verification code page and verification code will be sent to email")
	public void admin_user_staff_should_be_redirected_to_enter_verification_code_page_and_verification_code_will_be_sent_to_email() {
		title = loginpage.getTitleofPage();
		Assert.assertTrue(title.contains("Verification Code"));
	}

	@Given("Admin\\/User\\/Staff is on Enter verification code Page")
	public void admin_user_staff_is_on_enter_verification_code_page() {
		loginpage.getVerificationPage();
	}

	@When("Admin\\/User\\/Staff clicks continue after entering verification {string}")
	public void admin_user_staff_clicks_continue_after_entering_verification(String vcode) {
		loginpage.verificationCode(vcode);
		loginpage.continueclick();
	}

	@Then("Admin\\/User\\/Staff should be redirected reset password page")
	public void admin_user_staff_should_be_redirected_reset_password_page() {

		title = loginpage.getTitleofPage();
		Assert.assertTrue(title.contains("Password page"));
	}

	@When("Admin\\/User\\/Staff clicks Click here link to resend")
	public void admin_user_staff_clicks_click_here_link_to_resend() {
		loginpage.forgotclick();
		loginpage.clickresend();
	}

	@Then("The verification code should be resend to email")
	public void the_verification_code_should_be_resend_to_email() {
		// Assert.assertTrue(title.contains("Password page"));
	}

	@Given("Admin\\/User\\/Staff is on reset password page")
	public void admin_user_staff_is_on_reset_password_page() {
		loginpage.forgotclick();

	}

	@When("Admin\\/User\\/Staff clicks submit button after entering {string} and {string} password and click")
	public void admin_user_staff_clicks_submit_button_after_entering_and_password_and_click(String newpwd,
			String retypepwd) {
		loginpage.passwordPage(newpwd, retypepwd);
		loginpage.submitClick();
	}

	@Then("Admin\\/User\\/Staff  should be see {string}")
	public void admin_user_staff_should_be_see(String Pagemessage) {
		title = loginpage.getTitleofPage();
		Assert.assertTrue(title.contains(Pagemessage));

	}
}