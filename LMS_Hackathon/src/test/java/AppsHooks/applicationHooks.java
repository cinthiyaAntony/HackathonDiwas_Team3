package AppsHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import lms.qa.factory.driverFactory;
import lms.qa.util.configReader;

public class applicationHooks {

	// private WebDriver driver;
	private WebDriver driver;
	private WebDriverManager driverManager;
	private driverFactory dfactory;
	private configReader configReader;
	Properties prop;

	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		dfactory = new driverFactory();
		driver = dfactory.init_driver(browserName);
		// report = new
		// ExtentReports("C:\\Users\\cinth\\eclipse-workspace\\LMS_Hackathon\\report\\report,html",
		// true);

	}

	@Before(order = 0)
	public void getProperty() {
		configReader = new configReader();
		prop = configReader.init__prop();
	}

	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}

	@After(order = 1)
	public void teardown(Scenario scenario) {
		if (scenario.isFailed()) {
			// take screenshot
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
		}

	}

}
