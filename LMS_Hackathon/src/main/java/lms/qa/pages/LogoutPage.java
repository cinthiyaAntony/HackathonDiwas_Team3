package lms.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	private WebDriver driver;

	public LogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "Logout")
	WebElement logoutbtn;

	public void logoutClick() {
		logoutbtn.click();
	}

	public String getTpage() {
		return driver.getTitle();
	}
}
