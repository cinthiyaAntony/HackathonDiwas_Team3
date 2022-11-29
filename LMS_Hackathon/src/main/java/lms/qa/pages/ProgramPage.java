
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

public class ProgramPage {

	private WebDriver driver;
	private LoginPage loginpage;
	private List<WebElement> selects;
	private WebDriverWait wait;
	private AssignmentPage assignpage;

	public ProgramPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	// header text - Manage Program
	@FindBy(id = "header")
	WebElement header;

	// footer text
	@FindBy(id = "footer")
	WebElement footer;

	// paginator text
	@FindBy(id = "paginator")
	WebElement paginator;

	// search text box
	@FindBy(name = "search")
	WebElement search;

	// no of rows - 5
	@FindBy(name = "noofrows")
	WebElement noofrows;

	// delete button
	@FindBy(name = "btndelete")
	WebElement btndelete;

	// paginator - next button
	@FindBy(name = "btnnext")
	WebElement btnnext;

	// paginator - previous button
	@FindBy(name = "btnprevious")
	WebElement btnprevious;

	// paginator - last button
	@FindBy(name = "btnlast")
	WebElement btnlast;

	// paginator - first button
	@FindBy(name = "btnfirst")
	WebElement btnfirst;

	// page number
	@FindBy(name = "pgnumber")
	WebElement pgnumber;

	// program name
	@FindBy(id = "proname")
	WebElement proname;

	// program description
	@FindBy(id = "prodesc")
	WebElement prodesc;

	// program status
	@FindBy(id = "prostatus")
	WebElement prostatus;

	// program name ascending order
	@FindBy(id = "btnnameasc")
	WebElement btnnameasc;

	// program description ascending order
	@FindBy(id = "btndescasc")
	WebElement btndescasc;

	// program status ascending order
	@FindBy(id = "btnstatusasc")
	WebElement btnstatusasc;

	// program name descending order
	@FindBy(id = "btnnamedes")
	WebElement btnnamedes;

	// program description descending order
	@FindBy(id = "btndescdes")
	WebElement btndescdes;

	// program status descending order
	@FindBy(id = "btnstatusdes")
	WebElement btnstatusdes;

	// ***************** Add A New Program Functionality - Starts Here
	// *************************

	// Add New Program button - only admin can add

	@FindBy(id = "btnnewprogram")
	WebElement btnnewprogram;

	// new program header - Program Details
	@FindBy(id = "newproheader")
	WebElement newproheader;

	// new program name
	@FindBy(name = "txtname")
	WebElement txtname;

	// new program description
	@FindBy(name = "txtdesc")
	WebElement txtdesc;

	// new program status
	// active
	@FindBy(name = "rdstatusactive")
	WebElement rdstatusactive;

	// inactive
	@FindBy(name = "rdstatusinactive")
	WebElement rdstatusinactive;

	// new program save button
	@FindBy(name = "btnsave")
	WebElement btnsave;

	// new program cancel button
	@FindBy(name = "btncancel")
	WebElement btncancel;

	// Add New Program - error message
	@FindBy(id = "errormsg")
	WebElement errormsg;

	// Add New Program - success message
	@FindBy(id = "successmsg")
	WebElement successmsg;

	// ***************** Add A New Program Functionality - Ends Here
	// *************************

	// error message - Only Admin have Access
	@FindBy(id = "accesserrormsg")
	WebElement accesserrormsg;

	// ***************** Edit Functionality - Starts Here *************************

	// edit button (admin only)
	@FindBy(name = "btnedit")
	WebElement btnedit;

	@FindBy(id = "btndeleteright")
	WebElement btndeleteright;

	// header text in new window - "Delete Confirm"

	@FindBy(id = "deleteheader")
	WebElement deleteheader;

	// yes button in Delete Confirm window
	@FindBy(id = "btnyes")
	WebElement btnyes;

	// no button in Delete Confirm window
	@FindBy(id = "btnno")
	WebElement btnno;

	// ***************** Delete Functionality - Ends Here *********************

	// ***************** Delete Multiple Records Functionality - Starts Here
	// *****************

	@FindBy(id = "chkenabled")
	WebElement chkenabled;

	@FindBy(id = "chkselectall")
	WebElement chkselectall;

	public void nxtclick() {
		btnnext.click();
	}

	public void prevclick() {
		btnprevious.click();
	}

	public void lxtclick() {
		btnlast.click();
	}

	public void fxtclick() {

		btnfirst.click();
	}

	public String titlepage() {
		return driver.getTitle();
	}

	public String getHeaderText() {
		return header.getText();
	}

	public String getFooterText() {
		return footer.getText();
	}

	public String getpaginatortext() {
		return paginator.getText();
	}

	public String getpagenumber() {
		return pgnumber.getText();
	}

	public String getErrorMsg() {
		return errormsg.getText();
	}

	public String getSuccessMsg() {
		return successmsg.getText();
	}

	public String getAccessErrorMsg() {
		return accesserrormsg.getText();
	}

	public String getDeleteHeader() {
		return deleteheader.getText();
	}

	public void srchClick() {
		search.click();
	}

	public void srchname(String assignName) {
		search.sendKeys(assignName);
	}

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

	public void newprogramClick() {
		btnnewprogram.click();
	}

	public void setProgramName() {
		txtname.sendKeys("Hackathon assignment");
	}

	public void setProgramDesc() {
		txtdesc.sendKeys("Cucumber BDD");
	}

	public void setStatusActive() {
		rdstatusactive.click();
	}

	public void cancelClick() {
		btncancel.click();
	}

	public void saveClick() {
		btnsave.click();
	}

	public void editClick() {
		btnedit.click();
	}

	public void deleteRightClick() {
		btndeleteright.click();
	}

	public void deleteClick() {
		btndelete.click();
	}

	public void clickyes() {
		btnyes.click();
	}

	public void clickno() {
		btnno.click();
	}

	public void clickselectall() {
		chkselectall.click();
	}

}
