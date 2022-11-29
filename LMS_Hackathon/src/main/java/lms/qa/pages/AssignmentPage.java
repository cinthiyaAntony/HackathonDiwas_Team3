package lms.qa.pages;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import lms.qa.factory.driverFactory;

public class AssignmentPage {
	private WebDriver driver;
	private LoginPage loginpage;
	private List<WebElement> selects;
	private WebDriverWait wait;

	public AssignmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "Assignment")
	WebElement assignment;

	@FindBy(name = "Manage Assignment")
	WebElement pagehead;

	@FindBy(name = "Manage Assignment")
	WebElement pagefoot;

	@FindBy(xpath = "//span[contains(text(),'Next')]")
	WebElement nxt;

	@FindBy(xpath = "//span[contains(text(),'Next')]")
	WebElement prev;

	@FindBy(xpath = "//span[contains(text(),'Next')]")
	WebElement lxt;

	@FindBy(xpath = "//span[contains(text(),'Next')]")
	WebElement fxt;

	@FindBy(name = "search")
	WebElement srch;

	@FindBy(name = "A new assignment")
	WebElement newassign;

	@FindBy(name = "Assignment name")
	WebElement assgnn;

	@FindBy(name = "Assignment Description")
	WebElement assgnd;

	@FindBy(name = "Assignment Grade")
	WebElement assgngr;

	@FindBy(name = "Assignment DueDate")
	WebElement datepic;

	@FindBy(xpath = "//input[@value = 'save']")
	WebElement savebtn;

	@FindBy(xpath = "//input[@value = 'cancel']")
	WebElement cancelbtn;

	@FindBy(xpath = "//th/tr[1][contains(text(), 'Manage;)]")
	WebElement managebt;

	@FindBy(xpath = "//th/tr[1][contains(text(), 'Edit;)]")
	WebElement editbn;

	@FindBy(xpath = "//input[@value = 'firstname']")
	WebElement firtn;

	@FindBy(name = "submit")
	WebElement subtn;

	@FindBy(name = "clear")
	WebElement clearbtn;

	@FindBy(xpath = "//a[@value = 'Switch link']")
	WebElement switchlink;

	@FindBy(name = "delete")
	WebElement deltbtn;

	public void ascendarrow(String colname) {
		WebElement ascendng = driver
				.findElement(By.xpath("//th[contains(text(),' " + colname + " '/acending arrow )]"));
		ascendng.click();
	}

	public void descendarrow(String colname) {
		WebElement descendng = driver
				.findElement(By.xpath("//th[contains(text(),' " + colname + " '/descending arrow )]"));
		descendng.click();
	}

	public void elementList(String colname) {
		// capture all the webelement in list:
		List<WebElement> eleList = driver.findElements(By.xpath("//th[contains(text(),' " + colname + " tr/td[1]"));

		// capture the text of all webelements into new(original) list
		List<String> originalList = eleList.stream().map(s -> s.getText()).collect(Collectors.toList());

		// sort on the original list --> sorted list
		List<String> sortList = originalList.stream().sorted().collect(Collectors.toList());

		Assert.assertTrue(originalList.equals(sortList));
	}

	public void assignclick() {
		assignment.click();
	}

	public boolean headeravlue() {
		return pagehead.isDisplayed();
	}

	public boolean footvalue() {
		return pagefoot.isDisplayed();
	}

	public int getSelects() {
		selects = driverFactory.getDriver().findElements(By.cssSelector("div#center-column span"));
		return selects.size() - 1;
	}

	// compare original list vs sorted list

	public void nxtclick() {
		nxt.click();
	}

	public void prevclick() {
		nxt.click();
	}

	public void lxtclick() {
		nxt.click();
	}

	public void fxtclick() {
		nxt.click();
	}

	public void srchClick() {
		srch.click();
	}

	public void srchname(String assignName) {
		srch.sendKeys(assignName);
	}

	public void newassignClick() {
		newassign.click();
	}

	public String alerthand() {
		return driver.switchTo().alert().getText();
	}

	public String alertstaff() {
		String alert = driver.switchTo().alert().getText();
		return alert;
	}

	public void assgnname() {
		assgnn.sendKeys("Hackathon assignment");
	}

	public void assgndesc() {
		assgnd.sendKeys("Cucumber BDD");
	}

	public void assgngrad() {
		assgngr.sendKeys("Manage");
	}

	public void cancelClick() {
		cancelbtn.click();
	}

	public void saveClick() {
		savebtn.click();
	}

	public void mangClick() {
		managebt.click();
	}

	public void editClick() {
		editbn.click();
	}

	public String titlepage() {
		return driver.getTitle();
	}

	public void datapicClick() {
		datepic.click();
		String monthYearVal = datepic.getText();
		String month = monthYearVal.split(" ")[0].trim();
		String year = monthYearVal.split(" ")[1].trim();

		while (!(month.equals("dec") && year.equals("2022"))) {
			driver.findElement(By.xpath("//a[@title = 'Next']")).click();
		}
		driver.findElement(By.xpath("//a[text() = '23']")).click();
	}

	public String apageSource() {
		return driver.getPageSource();
	}

	public void firstLast() {
		firtn.sendKeys("AppleBanana");
	}

	public void subClick() {
		subtn.click();
	}

	public void clearClick() {
		clearbtn.click();
	}

	public void switchClick() {
		switchlink.click();
	}

	public void deltnClick() {
		deltbtn.click();
	}
//	public List<String> getcountList() {
//
//		List<String> countList = new ArrayList<>();
//		List<WebElement> headcountList = driver.findElements(By.cssSelector("div#center-column span"));
//
//		for (WebElement e : headcountList) {
//			String txt = e.getText();
//			countList.add(txt);
//		}
//		return countList;
//	}

}
