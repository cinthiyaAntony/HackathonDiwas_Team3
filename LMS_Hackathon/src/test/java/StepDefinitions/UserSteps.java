package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lms.qa.factory.driverFactory;
import lms.qa.pages.UserPage;

public class UserSteps {

	private WebDriver driver;

	private static String title;
	private UserPage userpage;

	@Given("Admin\\/User\\/Staff is on any page after Login")
	public void admin_user_staff_is_on_any_page_after_login() {
		driverFactory.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");

	}

	@When("Admin\\/User\\/Staff clicks the Tab {string}")
	public void admin_user_staff_clicks_the_tab(String string) {

	}

	@Then("Admin\\/User\\/Staff should see the Manage user page")
	public void admin_user_staff_should_see_the_manage_user_page() {
	}

	@When("Admin\\/User\\/Staff is on the Manage user page after clicking User Tab")
	public void admin_user_staff_is_on_the_manage_user_page_after_the_clicking_user_tab() {

	}

	@Then("Admin\\/User\\/Staff should see the page heading as {string}")
	public void admin_user_staff_should_see_the_page_heading_as(String string) {

	}

	@When("Admin\\/User\\/Staff is on the Manage user page after clicking  User Tab")
	public void admin_user_staff_is_on_the_manage_user_page_after_clicking_the_user_tab() {

	}

	@Then("Admin\\/User\\/Staff should see the pagination controls below data table")
	public void admin_user_staff_should_see_the_pagination_controls_below_data_table() {

	}

	@Given("Admin\\/User\\/Staff is on Manage user page")
	public void admin_user_staff_is_on_manage_user_page() {

	}

	@When("Manage user table has less than or equal to {string} rows")
	public void manage_user_table_has_less_than_or_equal_to_rows(String string) {

	}

	@Then("Pagination control should be disabled")
	public void pagination_control_should_be_disabled() {

	}

	@When("Manage user table has more than {string} rows")
	public void manage_user_table_has_more_than_rows(String string) {

	}

	@Then("Pagination control should be enabled")
	public void pagination_control_should_be_enabled() {

	}

	@Given("Admin\\/User\\/Staff table is displayed in manage user page")
	public void admin_user_staff_table_is_displayed_in_manage_user_page() {

	}

	@When("Admin\\/User\\/Staff clicks next link of pagination")
	public void admin_user_staff_clicks_next_link_of_pagination() {

	}

	@Then("Next page should be displayed")
	public void next_page_should_be_displayed() {

	}

	@Given("last page of Admin\\/User\\/Staff records are displayed")
	public void last_page_of_admin_user_staff_records_are_displayed() {

	}

	@Then("Next link of pagination should be disabled")
	public void next_link_of_pagination_should_be_disabled() {

	}

	@When("Admin\\/User\\/Staff clicks previous link of pagination")
	public void admin_user_staff_clicks_previous_link_of_pagination() {

	}

	@Then("previous page should be displayed")
	public void previous_page_should_be_displayed() {

	}

	@Given("First page of user table is displayed")
	public void first_page_of_user_table_is_displayed() {

	}

	@Then("Previous link of pagination should be disabled")
	public void previous_link_of_pagination_should_be_disabled() {

	}

	@When("Admin\\/User\\/Staff clicks << icon in pagination")
	public void admin_user_staff_clicks_the_icon_in_pagination() {

	}

	@Then("Admin\\/User\\/Staff clicks should see the First page of the table")
	public void admin_user_staff_clicks_should_see_the_first_page_of_the_table() {

	}

	@When("Admin\\/User\\/Staff clicks >> icon in pagination")
	public void admin_user_staff_clicks_icon_in_pagination() {

	}

	@Then("Admin\\/User\\/Staff clicks should see the last page of the table")
	public void admin_user_staff_clicks_should_see_the_last_page_of_the_table() {

	}

	@When("Admin\\/User\\/Staff lands on Manage User page")
	public void admin_user_staff_lands_on_manage_user_page() {

	}

	@Then("Admin\\/User\\/Staff should see the text {string} beow the user table.")
	public void admin_user_staff_should_see_the_text_beow_the_user_table(String string) {

	}

	@Then("Admin\\/User\\/Staffshould see the table footer as {string}.")
	public void admin_user_staffshould_see_the_table_footer_as(String string) {

	}

	@Then("Admin\\/User\\/Staff should see the button with text {string}")
	public void admin_user_staff_should_see_the_button_with_text(String string) {

	}

	@When("Admin\\/User\\/Staff clicks Add New User")
	public void admin_user_staff_clicks_add_new_user() {

	}

	@Then("Admin\\/User\\/Staff should see the {string} dialog box")
	public void admin_user_staff_should_see_the_dialog_box(String string) {

	}

	@When("Admin\\/User\\/Staff is on the Manage user page after clicking User")
	public void admin_user_staff_is_on_the_manage_user_page_after_clicking_user() {

	}

	@Then("Admin\\/User\\/Staff should see the table header as \"Empty checkbox-icon , ID with sort icon, Name with Sort icon, Email Address with sort icon,Contact Number with sort icon, Batch with sort icon, Skill with Sort icon, Edit\\/Delete as column names")
	public void admin_user_staff_should_see_the_table_header_as_empty_checkbox_icon_id_with_sort_icon_name_with_sort_icon_email_address_with_sort_icon_contact_number_with_sort_icon_batch_with_sort_icon_skill_with_sort_icon_edit_delete_as_column_names() {

	}

	@When("Admin\\/User\\/Staff clicks sort icon in table header")
	public void admin_user_staff_clicks_sort_icon_in_table_header() {

	}

	@Then("Table rows should be sorted")
	public void table_rows_should_be_sorted() {

	}

	@When("Admin\\/User\\/Staff checks empty checkbox in header")
	public void admin_user_staff_checks_empty_checkbox_in_header() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Check box in all the rows of user table should be checked")
	public void check_box_in_all_the_rows_of_user_table_should_be_checked() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff unchecks checkbox in header")
	public void admin_user_staff_unchecks_checkbox_in_header() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Check box in all the rows of user table should be unchecked")
	public void check_box_in_all_the_rows_of_user_table_should_be_unchecked() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staffis on the Manage user page after clicking User Tab")
	public void admin_user_staffis_on_the_manage_user_page_after_clicking_user_tab() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff should see the delete icon at the top left corner of the user table")
	public void admin_user_staff_should_see_the_delete_icon_at_the_top_left_corner_of_the_user_table() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("No rows is checked")
	public void no_rows_is_checked() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Delete icon at the top left corner of the user table disabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_disabled() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff checks the rows in user table")
	public void admin_user_staff_checks_the_rows_in_the_user_table() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Delete icon at the top left corner of the user table enabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_enabled() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("Admin\\/User\\/Staff checks the rows in user table")
	public void admin_user_staff_checks_the_rows_in_user_table() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff clicks the delete icon at the top left corner of user table")
	public void admin_user_staff_clicks_the_delete_icon_at_the_top_left_corner_of_user_table() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Confirm dialog box should be displayed with Text {string} , button with text {string} , the button with text {string} and close\\(X) icon")
	public void confirm_dialog_box_should_be_displayed_with_text_button_with_text_the_button_with_text_and_close_x_icon(
			String string, String string2, String string3) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("Admin\\/User\\/Staff is in confirm dialog box after clicking delete icon")
	public void admin_user_staff_is_in_confirm_dialog_box_after_clicking_delete_icon() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff clicks button with text {string}")
	public void admin_user_staff_clicks_button_with_text(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Selected rows should not be deleted and dialog box should be closed")
	public void selected_rows_should_not_be_deleted_and_dialog_box_should_be_closed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Selected rows should be deleted and popup should be shown with success message {string}")
	public void selected_rows_should_be_deleted_and_popup_should_be_shown_with_success_message(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff clicks the close\\(x) icon")
	public void admin_user_staff_clicks_the_close_x_icon() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Confirm dialog box should be closed")
	public void confirm_dialog_box_should_be_closed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff should see the buttons with edit\\/delete icon in each row of Edit\\/Delete coulmn")
	public void admin_user_staff_should_see_the_buttons_with_edit_delete_icon_in_each_row_of_edit_delete_coulmn() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff clicks delete button")
	public void admin_user_staff_clicks_delete_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff clicks Edit button")
	public void admin_user_staff_clicks_edit_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("{string} dialog box should be displayed for editing")
	public void dialog_box_should_be_displayed_for_editing(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff see the Search Text box has text as {string}.")
	public void admin_user_staff_see_the_search_text_box_has_text_as(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff is on the Manage user page after clicking UserTab")
	public void admin_user_staff_is_on_the_manage_user_page_after_clicking_user_tab() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff should see the search input field with search icon and text as {string}")
	public void admin_user_staff_should_see_the_search_input_field_with_search_icon_and_text_as(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff types Name to search")
	public void admin_user_staff_types_name_to_search() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Rows with the name should be displayed")
	public void rows_with_the_name_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff types random text in search field which has no matching entry")
	public void admin_user_staff_types_random_text_in_search_field_which_has_no_matching_entry() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("No rows is displayed")
	public void no_rows_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff clicks ID in any row")
	public void admin_user_staff_clicks_id_in_any_row() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff  see dialog box displayed with user information")
	public void admin_user_staff_see_dialog_box_displayed_with_user_information() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff clicks Add new user button")
	public void admin_user_staff_clicks_add_new_user_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff should see User Details window with text as {string}")
	public void admin_user_staff_should_see_user_details_window_with_text_as(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff should see a button with text as Cancel  in User Details window")
	public void admin_user_staff_should_see_a_button_with_text_as_cancel_in_user_details_window() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("Admin\\/User\\/Staff is on User Details window")
	public void admin_user_staff_is_on_the_user_details_window() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff clicks cancel button")
	public void admin_user_staff_clicks_cancel_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff  see User Details window getting  closed")
	public void admin_user_staff_see_user_details_window_getting_closed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff should see a cancel\\(x) icon")
	public void admin_user_staff_should_see_a_cancel_x_icon() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("Admin\\/User\\/Staff is on User Details details window")
	public void admin_user_staff_is_on_user_details_details_window() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff clicks cancel\\(X) icon")
	public void admin_user_staff_clicks_cancel_x_icon() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("User Details window should be closed")
	public void user_details_window_should_be_closed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff should see a button with text as Submit in user details window")
	public void admin_user_staff_should_see_a_button_with_text_as_submit_in_user_details_window() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff should see the placeholders with Text As {string},{string}, Last name\",\"Email adress\",\"Phone no\", \"Address\",\"City\", \"State\",\"Postal Code\".\"Program\",\"UG Program\",\"PG Program\",\"Skill\",\"Experience\",\"Admin\\/User\\/Staff Role\",Visa status\",{string},{string}")
	public void admin_user_staff_should_see_the_placeholders_with_text_as_last_name_email_adress_phone_no_address_city_state_postal_code_program_ug_program_pg_program_skill_experience_admin_user_staff_role_visa_status(
			String string, String string2, String string3, String string4) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff should see the input fields for {string},{string}, Last name\",\"Email adress\",\"Phone no\", \"Address\",\"City\", \"State\",\"Postal Code\".\"Program\",\"UG Program\",\"PG Program\",\"Skill\",\"Experience\",\"Admin\\/User\\/Staff Role\",Visa status\",{string},{string} corresponding to their labels")
	public void admin_user_staff_should_see_the_input_fields_for_last_name_email_adress_phone_no_address_city_state_postal_code_program_ug_program_pg_program_skill_experience_admin_user_staff_role_visa_status_corresponding_to_their_labels(
			String string, String string2, String string3, String string4) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("Admin\\/User\\/Staff is on {string} window")
	public void admin_user_staff_is_on_window(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff clicks the drop down icon for state")
	public void admin_user_staff_clicks_the_drop_down_icon_for_state() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff should select from the drop down menu for state")
	public void admin_user_staff_should_select_from_the_drop_down_menu_for_state() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff clicks the drop down icon for User Role")
	public void admin_user_staff_clicks_the_drop_down_icon_for_user_role() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff should select from the drop down menu for user role")
	public void admin_user_staff_should_select_from_the_drop_down_menu_for_user_role() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("Admin\\/User\\/Staff is on \"User Details\"window")
	public void admin_user_staff_is_on_user_details_window() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff clicks submit button with all details empty")
	public void admin_user_staff_clicks_submit_button_with_all_details_empty() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff should see a Error message {string}")
	public void admin_user_staff_should_see_a_error_message(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff clicks Submit button by entering all valid values in required fields")
	public void admin_user_staff_clicks_submit_button_by_entering_all_valid_values_in_required_fields() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff  see Success message  {string}  is  Should be Saved.")
	public void admin_user_staff_see_success_message_is_should_be_saved(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff clicks on Submit button after entering  Few Field details")
	public void admin_user_staff_clicks_on_submit_button_after_entering_few_field_details() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff see error message {string}")
	public void admin_user_staff_see_error_message(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff clicks on Submit button after entering wrong email address")
	public void admin_user_staff_clicks_on_submit_button_after_entering_wrong_email_address() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff Enters more than {int} digits")
	public void admin_user_staff_enters_more_than_digits(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff clicks on state dropdown")
	public void admin_user_staff_clicks_on_state_dropdown() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff see list of states in Alphabetical Order")
	public void admin_user_staff_see_list_of_states_in_alphabetical_order() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff clicks on UG Program dropdown")
	public void admin_user_staff_clicks_on_ug_program_dropdown() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff see list of UG Program")
	public void admin_user_staff_see_list_of_ug_program() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin\\/User\\/Staff clicks the button {string}")
	public void admin_user_staff_clicks_the_button(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Admin\\/User\\/Staff should see the input field with Label {string}")
	public void admin_user_staff_should_see_the_input_field_with_label(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}