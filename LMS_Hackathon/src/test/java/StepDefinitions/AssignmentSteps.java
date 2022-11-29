package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lms.qa.factory.driverFactory;
import lms.qa.pages.AssignmentPage;
import lms.qa.pages.LoginPage;
import lms.qa.pages.RegistrationPage;

public class AssignmentSteps {
	private RegistrationPage regpage;
	private WebDriver driver;
	private LoginPage loginpage = new LoginPage(driverFactory.getDriver());
	private static String title;
	private AssignmentPage assignpage = new AssignmentPage(driverFactory.getDriver());;

	@Given("Admin\\/User\\/Staff is on registration  page")
	public void admin_user_staff_is_on_registration_page() {
		driverFactory.getDriver().get("URL");
		// "https://parabank.parasoft.com/parabank/index.htm"
	}

	@When("Admin\\/User\\/Staff enters following details to click login button")
	public void admin_user_staff_enters_following_to_click_login_button(DataTable dataTable) {
		regpage.loginbtnClick();
		List<Map<String, String>> userlist = dataTable.asMaps(String.class, String.class);

		for (Map<String, String> e : userlist) {
			loginpage.getUsername(e.get("username"));
			loginpage.getPassword(e.get("password"));
			System.out.println(e.get("username"));
			System.out.println(e.get("password"));
			System.out.println(e.get("code"));
			if (e.get("code") == null) {
				loginpage.clicklogin();
			} else {
				loginpage.codeForLogin(e.get("code"));
				loginpage.clicklogin();
			}
		}
	}

	@Then("Admin\\/User\\/Staff is on {string} page")
	public void admin_user_staff_is_on_page(String expectPage) {
		title = loginpage.getTitleofPage();
		Assert.assertTrue(title.contains(expectPage));
	}

//1.Header validation Footer Validation
	@When("Admin\\/User\\/Staff clicks on Assignment Page")
	public void admin_user_staff_clicks_on_assignment_page() {
		assignpage.assignclick();
	}

	@Then("Admin\\/User\\/Staff Should see a Header {string}")
	public void admin_user_staff_should_see_a_header(String expectHeader) {
		boolean headertitle = assignpage.headeravlue();
		Assert.assertEquals(true, headertitle);
	}

//
	@Then("Admin\\/User\\/Staff Should see a Footer text {string}")
	public void admin_user_staff_should_see_a_footer_text(String expectfoot) {
		boolean footertitle = assignpage.footvalue();
		Assert.assertEquals(true, footertitle);
	}

	@Then("Admin\\/User\\/Staff Should see a Paginator text {int} entries")
	public void admin_user_staff_should_see_a_Paginator_text_entries(int expectCount) {
		Assert.assertTrue(assignpage.getSelects() == expectCount);
	}

//2
	@Then("Admin\\/User\\/Staff Should be navigated to next page")
	public void admin_user_staff_should_be_navigated_to_next_page() {
		assignpage.nxtclick();
	}

	@Then("Admin\\/User\\/Staff Should be navigated to previous page")
	public void admin_user_staff_should_be_navigated_to_previous_page() {
		assignpage.prevclick();
	}

	@Then("Admin\\/User\\/Staff Should be navigated to Last page")
	public void admin_user_staff_should_be_navigated_to_last_page() {
		assignpage.lxtclick();
	}

	@Then("Admin\\/User\\/Staff Should be navigated to First  page")
	public void admin_user_staff_should_be_navigated_to_first_page() {
		assignpage.fxtclick();
	}

//3
	@When("Admin\\/User\\/Staff clicks Search bar after entering Assignment name {string}")
	public void admin_user_staff_clicks_search_bar_after_entering_assignment_name(String expectName) {
		assignpage.srchClick();
		assignpage.srchname(expectName);
	}

	@Then("The requested {string} details should be displayed")
	public void the_requested_details_should_be_displayed(String expectName) {
		assignpage.elementList(expectName);
	}

	@When("Admin\\/User\\/Staff Clicks on {string} Ascending Arrow")
	public void admin_user_staff_clicks_on_ascending_arrow(String expectColName) {
		assignpage.ascendarrow(expectColName);

	}

	@Then("Admin\\/User\\/Staff should see the {string} displayed in Ascending order")
	public void admin_user_staff_should_see_the_displayed_in_ascending_order(String expectName) {
		assignpage.elementList(expectName);

	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Description {string} Ascending Arrow")
	public void admin_user_staff_clicks_on_assignment_description_ascending_arrow(String expectName) {
		assignpage.ascendarrow(expectName);
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Description {string} displayed in Ascending order")
	public void admin_user_staff_should_see_the_assignment_description_displayed_in_ascending_order(String expectName) {
		assignpage.elementList(expectName);
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Due Date {string} Ascending Arrow")
	public void admin_user_staff_clicks_on_assignment_due_date_ascending_arrow(String assignDate) {
		assignpage.ascendarrow(assignDate);
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Due Date {string} displayed in Ascending order")
	public void admin_user_staff_should_see_the_assignment_due_date_displayed_in_ascending_order(String assignDate) {
		assignpage.elementList(assignDate);
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Grade {string} Ascending Arrow")
	public void admin_user_staff_clicks_on_assignment_grade_ascending_arrow(String assignGrade) {
		assignpage.ascendarrow(assignGrade);
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Grade {string} displayed in Ascending order")
	public void admin_user_staff_should_see_the_assignment_grade_displayed_in_ascending_order(String assignGrade) {
		assignpage.elementList(assignGrade);
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Name {string} Descending Arrow")
	public void admin_user_staff_clicks_on_assignment_name_descending_arrow(String descAssname) {
		assignpage.descendarrow(descAssname);
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Name {string} displayed in Descending order")
	public void admin_user_staff_should_see_the_assignment_name_displayed_in_descending_order(String descAssname) {
		assignpage.elementList(descAssname);
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Description {string} Descending Arrow")
	public void admin_user_staff_clicks_on_assignment_description_descending_arrow(String assDescrip) {
		assignpage.descendarrow(assDescrip);
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Description {string} displayed in Descending order")
	public void admin_user_staff_should_see_the_assignment_description_displayed_in_descending_order(
			String assDescrip) {
		assignpage.elementList(assDescrip);
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Due Date {string} Descending Arrow")
	public void admin_user_staff_clicks_on_assignment_due_date_descending_arrow(String assduedate) {
		assignpage.descendarrow(assduedate);
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Due Date {string} displayed in Descending order")
	public void admin_user_staff_should_see_the_assignment_due_date_displayed_in_descending_order(String assduedate) {
		assignpage.elementList(assduedate);
	}

	@When("Admin\\/User\\/Staff Clicks on Assignment Grade {string} Descending Arrow")
	public void admin_user_staff_clicks_on_assignment_grade_descending_arrow(String assgrade) {
		assignpage.descendarrow(assgrade);
	}

	@Then("Admin\\/User\\/Staff should see the Assignment Grade {string} displayed in Descending order")
	public void admin_user_staff_should_see_the_assignment_grade_displayed_in_descending_order(String assgrade) {
		assignpage.elementList(assgrade);
	}

	@When("Admin\\/User\\/Staff clicks a Add New Assignment button")
	public void admin_user_staff_clicks_a_add_new_assignment_button() {
		assignpage.newassignClick();
	}

	@Then("Admin\\/User\\/Staff should see a message {string}")
	public void admin_user_staff_should_see_a_message(String errorM) {
		String s = assignpage.alerthand();
		if (s.contains(errorM)) {
			System.out.println("Staff only have access to add New Assignment");
		}
	}

	@When("Staff clicks a Add new assignment button")
	public void staff_clicks_a_add_new_assignment_button() {
		assignpage.newassignClick();
	}

	@Then("Staff should see Assignment details window")
	public void staff_should_see_assignment_details_window() {
		String s = assignpage.alerthand();
		System.out.println(s);
	}

	@When("Staff  clicks on Save after leaving all the fields empty")
	public void staff_clicks_on_save_after_leaving_all_the_fields_empty() {

		assignpage.saveClick();
	}

	@Then("Staff should see an error message {string}")
	public void staff_should_see_an_error_message(String titlepage) {
		String stitle = assignpage.titlepage();
		Assert.assertTrue(stitle.contains(titlepage));
	}

	@When("Staff clicks save button after entering assignment name assignment description assignment Grade and Duedate")
	public void staff_clicks_save_button_after_entering_assignment_name_assignment_description_assignment_Grade_and_Duedate() {
		assignpage.alertstaff();
		assignpage.assgnname();
		assignpage.assgndesc();
		assignpage.assgngrad();
		assignpage.datapicClick();
		assignpage.saveClick();
	}

	@Then("Staff should see a message {string}")
	public void staff_should_see_a_message(String string) {

	}

	@When("Staff clicks cancel button with entering all fields")
	public void staff_clicks_cancel_button_with_entering_all_fields() {
		assignpage.cancelClick();
	}

	@Then("Staff should see a Assignment details window is closed")
	public void staff_should_see_a_assignment_details_window_is_closed() {
		String title = assignpage.titlepage();
		Assert.assertEquals("Manage Assignment", title);
	}

	@When("Staff clicks manage button under Assignment Grade")
	public void staff_clicks_manage_button_under_assignment_grade() {
		assignpage.mangClick();
	}

	@Then("Staff should be navigated to Grade Window")
	public void staff_should_be_navigated_to_grade_window() {
		String gradetitle = assignpage.titlepage();
		Assert.assertEquals("garde", gradetitle);
	}

	@When("Staff clicks an edit Assignment button")
	public void staff_clicks_an_edit_assignment_button() {
		assignpage.editClick();
	}

	@Then("Staff should see a Assignment details window")
	public void staff_should_see_a_assignment_details_window() {
		String title = assignpage.alertstaff();
		Assert.assertTrue(title.contains("Assignments"));
	}

	@When("Staff clicks Save button after edits Assignment Name")
	public void staff_clicks_save_button_after_edits_assignment_name() {
		assignpage.assgnname();
		assignpage.saveClick();
	}

	@When("Staff clicks Save button  after edits Assignment Description")
	public void staff_clicks_save_button_after_edits_assignment_description() {
		assignpage.assgndesc();
		assignpage.saveClick();
	}

	@When("Staff clicks Save button After edits Assignment Grade")
	public void staff_clicks_save_button_after_edits_assignment_grade() {
		assignpage.assgngrad();
		assignpage.saveClick();
	}

	@When("Staff clicks Save button After edits Assignment DueDate")
	public void staff_clicks_save_button_after_edits_assignment_due_date() {
		assignpage.datapicClick();
		assignpage.saveClick();
	}

	@When("Staff clicks cancel button")
	public void staff_clicks_cancel_button() {
		assignpage.cancelClick();
	}

	@Then("Staff Should see a Assignment Details Page is closed")
	public void staff_should_see_a_assignment_details_page_is_closed() {
		String pagetitle = assignpage.titlepage();
		Assert.assertEquals("Manage Assignment", pagetitle);
	}

	@When("Admin\\/User\\/Staff clicks Edit button")
	public void admin_user_staff_clicks_edit_button() {
		assignpage.editClick();
	}

	@When("Admin\\/User\\/Staff clicks on Assignment Name")
	public void admin_user_staff_clicks_on_assignment_name() {
		assignpage.assgnname();
	}

	@Then("Admin\\/User\\/Staff should be navigated to Assignment Google form page")
	public void admin_user_staff_should_be_navigated_to_assignment_google_form_page() {
		String googleform = assignpage.titlepage();
		Assert.assertEquals("Assignments", googleform);
	}

	@When("Admin clicks on Assignment Name")
	public void admin_clicks_on_assignment_name() {
		assignpage.assignclick();

	}

	@Then("Admin should see a warning message {string}")
	public void admin_should_see_a_warning_message(String string) {
		String mess = assignpage.apageSource();
		Assert.assertEquals("Warning", mess);
	}

	@When("Admin\\/User\\/Staff clicks on submit button after entering all questions and mail id")
	public void admin_user_staff_clicks_on_submit_button_after_entering_all_questions_and_mail_id() {
		assignpage.firstLast();
	}

	@Then("Admin\\/User\\/Staff entered google forms successfully")
	public void admin_user_staff_entered_google_forms_successfully() {
		assignpage.subClick();
	}

	@When("Admin\\/User\\/Staff clicks on submit button after leaving all questions and mail id")
	public void admin_user_staff_clicks_on_submit_button_after_leaving_all_questions_and_mail_id() {
		assignpage.subClick();
	}

	@Then("Admin\\/User\\/Staff should get a warning message {string}")
	public void admin_user_staff_should_get_a_warning_message(String string) {
		String title = assignpage.apageSource();
		Assert.assertEquals("Staff only have access to Edit Assignment", title);
	}

	@When("Admin\\/User\\/Staff clicks clear form button after entering all questions and mail id")
	public void admin_user_staff_clicks_clear_form_button_after_entering_all_questions_and_mail_id() {
		assignpage.firstLast();
		String title = assignpage.apageSource();

	}

	@Then("The Assignment Google form cleared successfully")
	public void the_assignment_google_form_cleared_successfully() {
		assignpage.apageSource();
		Assert.assertEquals("Successfull", title);
	}

	@When("Admin\\/User\\/Staff clicks Switch account link")
	public void admin_user_staff_clicks_switch_account_link() {
		assignpage.switchClick();
	}

	@Then("Admin\\/User\\/Staff should be switched over the account Successfully")
	public void admin_user_staff_should_be_switched_over_the_account_successfully() {
		String title = assignpage.titlepage();
		Assert.assertTrue(title.contains("switched over the account Successfully "));
	}

	@When("Staff clicks on delete button on the righr side")
	public void staff_clicks_on_delete_button_on_the_righr_side() {
		assignpage.deltnClick();
	}

	@Then("Staff should see a Delete Confirmation window")
	public void staff_should_see_a_delete_confirmation_window() {
		String title = assignpage.apageSource();
		Assert.assertTrue(title.contains("deleted"));
	}

	@When("Staff clicks Yes")
	public void staff_clicks_yes() {
		assignpage.subClick();
	}

	@Then("Staff Should see {string}")
	public void staff_should_see(String expname) {
		String title = assignpage.apageSource();
		Assert.assertTrue(title.contains(expname));
	}

	@When("Staff clicks No")
	public void staff_clicks_no() {
		assignpage.cancelClick();
	}

	@Then("Confirmation delete window should be closed successfully")
	public void confirmation_delete_window_should_be_closed_successfully() {
		String title = assignpage.apageSource();
		Assert.assertTrue(title.contains("Confirmation delete window should be closed successfully"));
	}

	@When("Admin clicks on delete button")
	public void admin_clicks_on_delete_button() {
		assignpage.deltnClick();
	}

	@Then("Admin should see a message {string}")
	public void admin_should_see_a_message(String expmess) {
		String title = assignpage.apageSource();
		Assert.assertTrue(title.contains(expmess));
	}

	@When("Admin\\/User\\/Staff clicks on delete button")
	public void admin_user_staff_clicks_on_delete_button() {
		assignpage.deltnClick();
	}

	@Then("Admin\\/User\\/Staff should see a message\"Staff only have access\"")
	public void admin_user_staff_should_see_a_message_staff_only_have_access() {
		String title = assignpage.titlepage();
		Assert.assertTrue(title.contains(title));
	}

	@When("Admin\\/User\\/Staff clicks on delete button on the top left")
	public void admin_user_staff_clicks_on_delete_button_on_the_top_left() {

	}

	@Then("Admin\\/User\\/Staff\\/ should see a disabled delete button")
	public void admin_user_staff_should_see_a_disabled_delete_button() {

	}

	@When("Staff clicks delete button on the top aftr selecting multiple checkbox")
	public void staff_clicks_delete_button_on_the_top_aftr_selecting_multiple_checkbox() {

	}

	@Then("Staff should see a  Delete confirm window")
	public void staff_should_see_a_delete_confirm_window() {

	}

	@When("Admin\\/User\\/Staff clicks check box on the left side to the Assignment Name")
	public void admin_user_staff_clicks_check_box_on_the_left_side_to_the_assignment_name() {

	}

	@Then("Admin\\/User\\/Staff should see a enabled delete button on the top left")
	public void admin_user_staff_should_see_a_enabled_delete_button_on_the_top_left() {

	}

	@When("Admin clicks check box on the left side to the Assignment Name")
	public void admin_clicks_check_box_on_the_left_side_to_the_assignment_name() {

	}

	@When("Admin\\/User\\/Staff clicks individual checkbox button")
	public void admin_user_staff_clicks_individual_checkbox_button() {

	}

	@Then("Admin\\/User\\/Staff should see a delete button on the top left")
	public void admin_user_staff_should_see_a_delete_button_on_the_top_left() {

	}

	@When("Admin clicks individual checkbox button")
	public void admin_clicks_individual_checkbox_button() {

	}

}