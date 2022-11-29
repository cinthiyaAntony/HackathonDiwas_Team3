package StepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lms.qa.factory.driverFactory;
import lms.qa.pages.LoginPage;
import lms.qa.pages.LogoutPage;
import lms.qa.pages.RegistrationPage;

public class LogoutSteps {
	private LoginPage loginpage;
	private RegistrationPage regpage;
	private LogoutPage logoutp = new LogoutPage(driverFactory.getDriver());

	@When("Admin\\/User\\/Staff is clicks on logout button")
	public void admin_user_staff_is_clicks_on_logout_button() {
		logoutp.logoutClick();
	}

	@Then("Admin\\/User\\/Staff should be navigated to Login Screen")
	public void admin_user_staff_should_be_navigated_to_login_screen() {
		regpage.loginbtnClick();
		String title = logoutp.getTpage();
		Assert.assertEquals("Registration form", title);
	}
}
