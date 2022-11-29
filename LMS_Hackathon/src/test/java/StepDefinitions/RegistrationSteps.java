package StepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lms.qa.factory.driverFactory;
import lms.qa.pages.LoginPage;
import lms.qa.pages.RegistrationPage;

public class RegistrationSteps {
	private static String title;
	private RegistrationPage regpage = new RegistrationPage(driverFactory.getDriver());
	private LoginPage loginpage = new LoginPage(driverFactory.getDriver());

	@Given("Admin\\/User\\/Staff Logged on to LMS website")
	public void admin_user_staff_logged_on_to_lms_website() {
		driverFactory.getDriver().get("https://www.facebook.com/reg/");

	}

	@Then("Admin\\/User\\/Staff sees the heading on the form as {string}")
	public void admin_user_staff_sees_the_heading_on_the_form_as(String expectedtxt) {
		boolean t = regpage.repageText();
		System.out.println(t);
		Assert.assertEquals(true, t);
		// Assert.assertTrue(title.contains(expectedtxt));
	}

	@Then("Admin\\/User\\/Staff sees a button with text {string} on the form")
	public void admin_user_staff_sees_a_button_with_text_on_the_form(String expecttxt) {
		title = regpage.lgText();
		Assert.assertTrue(title.contains(expecttxt));
	}

	@Then("Admin\\/User\\/Staff verify a text {string} on the form")
	public void admin_user_staff_verify_a_text_on_the_form(String expectOut) {
		title = regpage.signText();
		Assert.assertTrue(title.contains(expectOut));
	}

	@When("Admin\\/User\\/Staff clicks the Log in button")
	public void admin_user_staff_clicks_the_log_in_button() {
		regpage.loginbtnClick();
	}

	@Then("Admin\\/User\\/Staff lands on Log in page")
	public void admin_user_staff_lands_on_log_in_page() {
		title = loginpage.getTitleofPage();
		Assert.assertTrue(title.contains("Login LMS Application"));

	}

	@When("Admin\\/User\\/Staff enters following {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} to click signup button")
	public void admin_user_staff_enters_following_to_click_signup_button(String fName, String lName, String addressUser,
			String Streetname, String zip, String city, String state, String phonenum, String bDate,
			String validPassword, String validUsername, String email, String display) {
		regpage.fname(fName);
		regpage.lname(lName);
		regpage.lname(addressUser);
		regpage.street(Streetname);
		regpage.zipN(zip);
		regpage.birthD(bDate);
		regpage.userName(validUsername);
		regpage.phoneNum(phonenum);
		regpage.passUser(validPassword);
		regpage.mailU(email);
		regpage.signupClick();

	}

	@Then("Admin\\/User\\/Staff sees the message {string}")
	public void admin_user_staff_sees_the_message(String display) {
		if (display == "Scuccessful") {
			title = loginpage.getTitleofPage();
			Assert.assertTrue(title.contains(display));
		} else {
			Assert.assertTrue(false);

		}
	}

}