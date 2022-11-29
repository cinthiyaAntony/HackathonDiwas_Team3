package lms.qa.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import lms.qa.util.ElementUtil;

public class driverFactory {

	public WebDriver driver;

	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	/**
	 * This method is used to initialize the threadlocal driver on the basis of
	 * given browser
	 * 
	 * @param browser
	 * @return
	 */

	public WebDriver init_driver(String browser) {
		System.out.println("browser name: " + browser);

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		} else {
			System.out.println("Please correct the browser value: " + browser);
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(ElementUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		return getDriver();

	}

	/**
	 * This is used to get the driver with ThreadLocal
	 * 
	 * @return
	 */

	public static synchronized WebDriver getDriver() {
		return tlDriver.get();

	}
}
