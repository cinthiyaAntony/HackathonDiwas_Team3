package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lms.qa.factory.driverFactory;
import lms.qa.pages.LoginPage;
import lms.qa.pages.ProgramPage;
import lms.qa.pages.RegistrationPage;

public class ProgramSteps {

	private RegistrationPage regpage;
	private WebDriver driver;
	private LoginPage loginpage = new LoginPage(driverFactory.getDriver());
	private static String title;
	private ProgramPage programpage = new ProgramPage(driverFactory.getDriver());
	/*
	 * @Given("Admin\\/User\\/Staff is on registration  page") public void
	 * admin_user_staff_is_on_registration_page() { driverFactory.getDriver().get(
	 * "https://parabank.parasoft.com/parabank/index.htm"); }
	 * 
	 * @When("Admin\\/User\\/Staff enters following details to click login button")
	 * public void admin_user_staff_enters_following_to_click_login_button(DataTable
	 * dataTable) { // regpage.loginbtnClick(); List<Map<String, String>> userlist =
	 * dataTable.asMaps(String.class, String.class);
	 * 
	 * for (Map<String, String> e : userlist) {
	 * loginpage.getUsername(e.get("username"));
	 * loginpage.getPassword(e.get("password"));
	 * System.out.println(e.get("username")); System.out.println(e.get("password"));
	 * System.out.println(e.get("code")); if (e.get("code") == null) {
	 * loginpage.clicklogin(); } else { loginpage.codeForLogin(e.get("code"));
	 * loginpage.clicklogin(); } } }
	 * 
	 * @Then("Admin\\/User\\/Staff is on {string} page") public void
	 * admin_user_staff_is_on_page(String expectPage) { title =
	 * loginpage.getTitleofPage(); Assert.assertTrue(title.contains(expectPage)); }
	 */

	@Given("Admin\\/User\\/Staff  Logged on to LMS Website")
	public void admin_user_staff_logged_on_to_lms_website() {

	}

	@When("Admin\\/User\\/Staff  is on the Manage Program page")
	public void admin_user_staff_is_on_the_manage_program_page() {

	}

	// Header validation
	@Then("Admin\\/User\\/Staff see header text as {string}")
	public void admin_user_staff_see_header_text_as(String expectHeader) {
		String actualText = programpage.getHeaderText();
		Assert.assertEquals(actualText, expectHeader);
	}

// Footer Validation
	@Then("Admin\\/User\\/Staff see Footer text as {string}")
	public void admin_user_staff_see_footer_text_as(String expectFooter) {
		System.out.println("******Footer******");
		String actualText = programpage.getFooterText();
		Assert.assertEquals(actualText, expectFooter);
	}

	// Paginator Validation
	@Then("Admin\\/User\\/Staff see the text as {string}")
	public void admin_user_staff_see_the_text_as(String expectedtext) {

		String actualText = programpage.getpaginatortext();
		Assert.assertEquals(actualText, expectedtext);

	}

	@Then("Admin\\/User\\/Staff see the Search Text box has text as {string}")
	public void admin_user_staff_see_the_search_text_box_has_text_as(String string) {

	}

	@Then("Admin\\/User\\/Staff counts number of rows as {int} in a table")
	public void admin_user_staff_counts_number_of_rows_as_in_a_table(Integer int1) {

	}

	@Then("Admin\\/User\\/Staff see the Delete button on the top left hand side")
	public void admin_user_staff_see_the_delete_button_on_the_top_left_hand_side() {

	}

	@Given("Admin\\/User\\/Staff is on Manage Program page")
	public void admin_user_staff_is_on_manage_program_page() {

	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator-next button")
	public void admin_user_staff_clicks_on_enabled_paginator_next_button() {
		programpage.nxtclick();

	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator-prev button")
	public void admin_user_staff_clicks_on_enabled_paginator_prev_button() {
		programpage.prevclick();

	}

	@Then("Admin\\/User\\/Staff see Paginator text as {string}")
	public void admin_user_staff_see_paginator_text_as(String expectedtext) {
		String actualText = programpage.getpaginatortext();
		Assert.assertEquals(actualText, expectedtext);

	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator-last button")
	public void admin_user_staff_clicks_on_enabled_paginator_last_button() {
		programpage.lxtclick();

	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator-first button")
	public void admin_user_staff_clicks_on_enabled_paginator_first_button() {
		programpage.fxtclick();

	}

	@Then("Admin\\/User\\/Staff see Page number navigated to {string}")
	public void admin_user_staff_see_page_number_navigated_to(String expectedpageno) {
		String actualpageno = programpage.getpagenumber();
		Assert.assertEquals(actualpageno, expectedpageno);

	}

	// Search Functionality...

	/*
	 * @When("Admin\\/User\\/Staff enters Program Name to be searched") public void
	 * admin_user_staff_enters_program_name_to_be_searched() { //
	 * assignpage.srchClick(); //assignpage.srchname(expectName);
	 * 
	 * }
	 * 
	 * @Then("Entries for the searched Program Name are shown.") public void
	 * entries_for_the_searched_program_name_are_shown() {
	 * 
	 * }
	 * 
	 * @When("Admin\\/User\\/Staff enters Program Description to be searched")
	 * public void admin_user_staff_enters_program_description_to_be_searched() {
	 * 
	 * }
	 * 
	 * @Then("Entries for the searched Program Description are shown.") public void
	 * entries_for_the_searched_program_description_are_shown() {
	 * 
	 * }
	 * 
	 * @When("Admin\\/User\\/Staff enters Program Status to be searched") public
	 * void admin_user_staff_enters_program_status_to_be_searched() {
	 * 
	 * }
	 * 
	 * @Then("Entries for the searched Program Status are shown.") public void
	 * entries_for_the_searched_program_status_are_shown() {
	 * 
	 * }
	 */

	@When("Admin\\/User\\/Staff enters Program Name {string} to be searched")
	public void admin_user_staff_enters_program_name_to_be_searched(String expectName) {
		programpage.srchClick();
		programpage.srchname(expectName);

	}

	@Then("Entries for the searched Program Name {string} are shown.")
	public void entries_for_the_searched_program_name_are_shown(String expectName) {

		programpage.elementList(expectName);
	}

	@When("Admin\\/User\\/Staff enters Program Description {string} to be searched")
	public void admin_user_staff_enters_program_description_to_be_searched(String expectDesc) {
		programpage.srchClick();
		programpage.srchname(expectDesc);

	}

	@Then("Entries for the searched Program Description {string} are shown.")
	public void entries_for_the_searched_program_description_are_shown(String expectDesc) {

		programpage.elementList(expectDesc);
	}

	@When("Admin\\/User\\/Staff enters Program Status {string} to be searched")
	public void admin_user_staff_enters_program_status_to_be_searched(String expectStatus) {
		programpage.srchClick();
		programpage.srchname(expectStatus);
	}

	@Then("Entries for the searched Program Status {string} are shown.")
	public void entries_for_the_searched_program_status_are_shown(String expectStatus) {
		programpage.elementList(expectStatus);
	}

	/*
	 * @When("Admin\\/User\\/Staff Clicks on Program Name Ascending Arrow") public
	 * void admin_user_staff_clicks_on_program_name_ascending_arrow() {
	 * assignpage.ascendarrow(assignDate); }
	 * 
	 * @Then("Admin\\/User\\/Staff see the Program Name displayed in Ascending order"
	 * ) public void
	 * admin_user_staff_see_the_program_name_displayed_in_ascending_order() {
	 * assignpage.elementList(assignDate); }
	 * 
	 * @When("Admin\\/User\\/Staff Clicks on Program Description Ascending Arrow")
	 * public void admin_user_staff_clicks_on_program_description_ascending_arrow()
	 * { assignpage.ascendarrow(assignDate); }
	 * 
	 * @Then("Admin\\/User\\/Staff see the Program Description displayed in Ascending order"
	 * ) public void
	 * admin_user_staff_see_the_program_description_displayed_in_ascending_order() {
	 * assignpage.elementList(assignDate); }
	 * 
	 * @When("Admin\\/User\\/Staff Clicks on Program Status Ascending Arrow") public
	 * void admin_user_staff_clicks_on_program_status_ascending_arrow() {
	 * assignpage.ascendarrow(assignDate); }
	 * 
	 * @Then("Admin\\/User\\/Staff see the Program Status displayed in Ascending order"
	 * ) public void
	 * admin_user_staff_see_the_program_status_displayed_in_ascending_order() {
	 * assignpage.elementList(assignDate); }
	 */

	// Ascending Order

	@When("Admin\\/User\\/Staff Clicks on the {string} Ascending Arrow")
	public void admin_user_staff_clicks_on_the_ascending_arrow(String expectColName) {
		programpage.ascendarrow(expectColName);

	}

	@Then("Admin\\/User\\/Staff see the {string} displayed in Ascending order")
	public void admin_user_staff_see_the_displayed_in_ascending_order(String expectName) {
		programpage.elementList(expectName);

	}

	@When("Admin\\/User\\/Staff Clicks on the {string} Descending Arrow")
	public void admin_user_staff_clicks_on_the_descending_arrow(String expectColName) {
		programpage.descendarrow(expectColName);

	}

	@Then("Admin\\/User\\/Staff see the {string} displayed in Descending order")
	public void admin_user_staff_see_the_displayed_in_descending_order(String expectName) {
		programpage.elementList(expectName);

	}

	// Descending Order...
	/*
	 * @When("Admin\\/User\\/Staff Clicks on Program Name Descending Arrow") public
	 * void admin_user_staff_clicks_on_program_name_descending_arrow() {
	 * 
	 * }
	 * 
	 * @Then("Admin\\/User\\/Staff see the Program Name displayed in Descending order"
	 * ) public void
	 * admin_user_staff_see_the_program_name_displayed_in_descending_order() {
	 * 
	 * }
	 * 
	 * @When("Admin\\/User\\/Staff Clicks on Program Description Descending Arrow")
	 * public void admin_user_staff_clicks_on_program_description_descending_arrow()
	 * {
	 * 
	 * }
	 * 
	 * @Then("Admin\\/User\\/Staff see the Program Description displayed in Descending order"
	 * ) public void
	 * admin_user_staff_see_the_program_description_displayed_in_descending_order()
	 * {
	 * 
	 * }
	 * 
	 * @When("Admin\\/User\\/Staff Clicks on Program Status Descending Arrow")
	 * public void admin_user_staff_clicks_on_program_status_descending_arrow() {
	 * 
	 * }
	 * 
	 * @Then("Admin\\/User\\/Staff see the Program Status displayed in Descending order"
	 * ) public void
	 * admin_user_staff_see_the_program_status_displayed_in_descending_order() {
	 * 
	 * }
	 */

	@Given("Admin is on Manage Program page")
	public void admin_is_on_manage_program_page() {

	}

// + Add New Program button
	@When("Admin Clicks on the {string} button")
	public void admin_clicks_on_the_button(String string) {
		programpage.newprogramClick();
	}

	@Then("Admin see header text as {string}")
	public void admin_see_header_text_as(String expectHeader) {

		String actualText = programpage.getHeaderText();
		Assert.assertEquals(actualText, expectHeader);

	}

	@Given("Admin Clicks on {string} button")
	public void admin_clicks_on_button(String string) {

	}

	@When("Admin Clicks on Save Button with out entering details")
	public void admin_clicks_on_save_button_with_out_entering_details() {
		programpage.saveClick();
	}

	@Then("Admin see Error message {string}")
	public void admin_see_error_message(String expecterror) {

		String actualText = programpage.getErrorMsg();
		Assert.assertEquals(actualText, expecterror);
	}

	@When("Admin Clicks on Save Button after entering all details")
	public void admin_clicks_on_save_button_after_entering_all_details() {

		programpage.setProgramName();
		programpage.setProgramDesc();
		programpage.setStatusActive();
		programpage.saveClick();

	}

	@Then("Admin see Success message {string}")
	public void admin_see_success_message(String exepectMsg) {
		String actualText = programpage.getSuccessMsg();
		Assert.assertEquals(actualText, exepectMsg);
	}

	@When("Admin Clicks on Save Button after entering Name alone")
	public void admin_clicks_on_save_button_after_entering_name_alone() {
		programpage.setProgramName();
		programpage.saveClick();
	}

	@When("Admin Clicks on Save Button after entering Description alone")
	public void admin_clicks_on_save_button_after_entering_description_alone() {
		programpage.setProgramDesc();
		programpage.saveClick();
	}

	@When("Admin Clicks on Save Button after selecting Status alone")
	public void admin_clicks_on_save_button_after_selecting_status_alone() {
		programpage.setStatusActive();
		programpage.saveClick();
	}

	@When("Admin Clicks on Cancel button")
	public void admin_clicks_on_cancel_button() {
		programpage.cancelClick();
	}

	@Then("Admin see a Program Details window getting closed")
	public void admin_see_a_program_details_window_getting_closed() {
		String title = programpage.titlepage();
		Assert.assertEquals("Manage Program", title);
	}

	@When("Admin\\/User\\/Staff Enters newly added Program Name in Search")
	public void admin_user_staff_enters_newly_added_program_name_in_search() {

	}

	@Then("Entry for the newly added Program Name is shown")
	public void entry_for_the_newly_added_program_name_is_shown() {

	}

	@Given("User\\/Staff is on Manage Program page")
	public void user_staff_is_on_manage_program_page() {

	}

	@When("User\\/Staff Clicks on {string} button")
	public void user_staff_clicks_on_button(String string) {
		programpage.newprogramClick();

	}

	@Then("User\\/Staff see a Error message {string}")
	public void user_staff_see_a_error_message(String expectMsg) {

		String actualText = programpage.getAccessErrorMsg();
		Assert.assertEquals(actualText, expectMsg);
	}

	@When("Admin Clicks on the Edit buttton")
	public void admin_clicks_on_the_edit_buttton() {
		programpage.editClick();

	}

	@When("Admin Clicks on Save Button after updating Name")
	public void admin_clicks_on_save_button_after_updating_name() {
		programpage.setProgramName();
		programpage.saveClick();

	}

	@When("Admin Clicks on Save Button after updating Description")
	public void admin_clicks_on_save_button_after_updating_description() {
		programpage.setProgramDesc();
		programpage.saveClick();

	}

	@When("Admin Clicks on Save Button after Changing status")
	public void admin_clicks_on_save_button_after_changing_status() {
		programpage.setStatusActive();
		programpage.saveClick();

	}

	@When("Admin\\/User\\/Staff Enters edited Program Name in Search")
	public void admin_user_staff_enters_edited_program_name_in_search() {

	}

	@Then("Entry for the edited Program Name is shown")
	public void entry_for_the_edited_program_name_is_shown() {

	}

	@When("User\\/Staff Clicks on Edit buttton")
	public void user_staff_clicks_on_edit_buttton() {

	}

	@When("Admin Clicks on any of the Delete button located on the right side")
	public void admin_clicks_on_any_of_the_delete_button_located_on_the_right_side() {
		programpage.deleteRightClick();

	}

	@Given("Admin Clicks on any Delete button located on the right side")
	public void admin_clicks_on_any_delete_button_located_on_the_right_side() {
		programpage.deleteRightClick();
	}

	@When("Admin Clicks on Yes button")
	public void admin_clicks_on_yes_button() {
		programpage.clickyes();

	}

	@When("Admin Clicks on No button")
	public void admin_clicks_on_no_button() {
		programpage.clickno();
	}

	@Then("Admin can see Program Name not deleted")
	public void admin_can_see_program_name_not_deleted() {

	}

	@When("Admin\\/User\\/Staff Enters deleted Program Name in Search")
	public void admin_user_staff_enters_deleted_program_name_in_search() {

	}

	@Then("Admin\\/User\\/Staff finds no results")
	public void admin_user_staff_finds_no_results() {

	}

	@When("User\\/Staff Clicks on Delete buttton")
	public void user_staff_clicks_on_delete_buttton() {
		programpage.deleteRightClick();
	}

	@When("Admin\\/User\\/Staff selects more than one Program Name using as Enabled")
	public void admin_user_staff_selects_more_than_one_program_name_using_as_enabled() {

	}

	@Given("Admin selects more than one Program Name using checkbox")
	public void admin_selects_more_than_one_program_name_using_checkbox() {

	}

	@When("Admin Clicks on Enabled Delete button on the top left hand side")
	public void admin_clicks_on_enabled_delete_button_on_the_top_left_hand_side() {
		programpage.deleteClick();

	}

	@Given("Admin Clicks on Enabled Delete button after selecting more than one Program Name")
	public void admin_clicks_on_enabled_delete_button_after_selecting_more_than_one_program_name() {

	}

	@Then("Admin can see Program Names not deleted")
	public void admin_can_see_program_names_not_deleted() {

	}

	@When("Admin\\/User\\/Staff Enters deleted Program Names in Search")
	public void admin_user_staff_enters_deleted_program_names_in_search() {

	}

	@Given("User\\/Staff selects more than one Program Name using checkbox")
	public void user_staff_selects_more_than_one_program_name_using_checkbox() {

	}

	@When("User\\/Staff Clicks on Enabled Delete button on the top left hand side")
	public void user_staff_clicks_on_enabled_delete_button_on_the_top_left_hand_side() {
		programpage.deleteClick();

	}

	@When("Admin\\/User\\/Staff Selects First checkbox left to Program Name")
	public void admin_user_staff_selects_first_checkbox_left_to_program_name() {
		programpage.clickselectall();

	}

	@Then("Admin\\/User\\/Staff see all the checkboxes in the Program page get selected")
	public void admin_user_staff_see_all_the_checkboxes_in_the_program_page_get_selected() {

	}

}