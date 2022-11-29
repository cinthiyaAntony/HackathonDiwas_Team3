Feature: user

  Background: Admin/User/Staff Logged on to LMS website

  Scenario: validate landing in Manage page
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staff clicks the Tab "User"
    Then Admin/User/Staff should see the Manage user page

  Scenario: Validate the Manage page heading
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staff is on the Manage user page after clicking User Tab
    Then Admin/User/Staff should see the page heading as "Manage User"

  Scenario: Validate the presence of pagination
    Given Admin/User/Staff is on any page after Login
    When  Admin/User/Staff is on the Manage user page after clicking  User Tab
    Then Admin/User/Staff should see the pagination controls below data table

  Scenario: Validate the Pagination control with less rows
    Given Admin/User/Staff is on Manage user page
    When Manage user table has less than or equal to "5" rows
    Then Pagination control should be disabled

  Scenario: Validate the Pagination control with more than 5 rows
    Given Admin/User/Staff is on Manage user page
    When Manage user table has more than "5" rows
    Then Pagination control should be enabled

  Scenario: Verify pagination next link
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff clicks next link of pagination
    Then Next page should be displayed

  Scenario: Verify pagination next link after last record of user table
    Given last page of Admin/User/Staff records are displayed
    When Admin/User/Staff clicks next link of pagination
    Then Next link of pagination should be disabled

  Scenario: Verify pagination Previous link
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff clicks previous link of pagination
    Then previous page should be displayed

  Scenario: Verify pagination previous link in first page of user table
    Given First page of user table is displayed
    When Admin/User/Staff clicks previous link of pagination
    Then Previous link of pagination should be disabled

  Scenario: Verify button with << icon
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff clicks << icon in pagination
    Then Admin/User/Staff clicks should see the First page of the table

  Scenario: Verify button with >> icon
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff clicks >> icon in pagination
    Then Admin/User/Staff clicks should see the last page of the table

  Scenario: Verifiy the entry details below data table
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff lands on Manage User page
    Then Admin/User/Staff should see the text "Showing 1 to 4 of 4 entries" beow the user table.

  Scenario: Validating table footer
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff lands on Manage User page
    Then Admin/User/Staffshould see the table footer as "In total there are 4 users".

  Scenario: Validate the presence of Add new user button
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staff is on the Manage user page after clicking User Tab
    Then Admin/User/Staff should see the button with text "+ icon and Add New User"

  Scenario: Verify the functionality of Add new user button
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff clicks Add New User
    Then Admin/User/Staff should see the "User details" dialog box

  Scenario: Validating Table header
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staff is on the Manage user page after clicking User
    Then Admin/User/Staff should see the table header as "Empty checkbox-icon , ID with sort icon, Name with Sort icon, Email Address with sort icon,Contact Number with sort icon, Batch with sort icon, Skill with Sort icon, Edit/Delete as column names

  Scenario: Verify the functionality of sort icon present in table header
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff clicks sort icon in table header
    Then Table rows should be sorted

  Scenario: Check box in table header
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff checks empty checkbox in header
    Then Check box in all the rows of user table should be checked

  Scenario: Check box in table header
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff unchecks checkbox in header
    Then Check box in all the rows of user table should be unchecked

  Scenario: Verify the presence of Delete icon in manage user page
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staffis on the Manage user page after clicking User Tab
    Then Admin/User/Staff should see the delete icon at the top left corner of the user table

  Scenario: Behaviour of Delete icon when no rows unchecked
    Given Admin/User/Staff table is displayed in manage user page
    When No rows is checked
    Then Delete icon at the top left corner of the user table disabled

  Scenario: Behaviour of Delete icon when rows checked
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff checks the rows in user table
    Then Delete icon at the top left corner of the user table enabled

  Scenario: Behaviour of Delete icon when rows checked
    Given Admin/User/Staff checks the rows in user table
    When Admin/User/Staff clicks the delete icon at the top left corner of user table
    Then Confirm dialog box should be displayed with Text "Are you sure you want to delete the selected Admin/User/Staffs?" , button with text "No" , the button with text "yes" and close(X) icon

  Scenario: Validating Confirm dialog box by selecting No
    Given Admin/User/Staff is in confirm dialog box after clicking delete icon
    When Admin/User/Staff clicks button with text "No"
    Then Selected rows should not be deleted and dialog box should be closed

  Scenario: Validating Confirm dialog box by selecting Yes
    Given Admin/User/Staff is in confirm dialog box after clicking delete icon
    When Admin/User/Staff clicks button with text "Yes"
    Then Selected rows should be deleted and popup should be shown with success message "User deleted"

  Scenario: Validating Confirm dialog box by clicking close(x) icon
    Given Admin/User/Staff is in confirm dialog box after clicking delete icon
    When Admin/User/Staff clicks the close(x) icon
    Then Confirm dialog box should be closed

  Scenario: Validate the presence of Edit/Delete icon
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staff is on the Manage user page after clicking User Tab
    Then Admin/User/Staff should see the buttons with edit/delete icon in each row of Edit/Delete coulmn

  Scenario: Validate Functionality of delete button
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff clicks delete button
    Then Confirm dialog box should be displayed with Text "Are you sure you want to delete (selected user name) ?" , button with text "No" , the button with text "yes" and close(X) icon

  Scenario: Updating with Edit button
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff clicks Edit button
    Then " User Details" dialog box should be displayed for editing

  Scenario: Verify the presence of Input field for searching
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staff is on the Manage user page after clicking User Tab
    Then Admin/User/Staff see the Search Text box has text as "Search".

  Scenario: Verify the presence of search icon and text in the search input filed
    Given Admin/User/Staff is on any page after Login
    When Admin/User/Staff is on the Manage user page after clicking UserTab
    Then Admin/User/Staff should see the search input field with search icon and text as "Search"

  Scenario: Verify the functionality of search
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff types Name to search
    Then Rows with the name should be displayed

  Scenario: Verify the functionality of search
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff types random text in search field which has no matching entry
    Then No rows is displayed

  Scenario: Verify ID functionality
    Given Admin/User/Staff table is displayed in manage user page
    When Admin/User/Staff clicks ID in any row
    Then Admin/User/Staff  see dialog box displayed with user information

  Scenario: Verify the heading of User Details window
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff clicks Add new user button
    Then Admin/User/Staff should see User Details window with text as "User Details"

  Scenario: Verify the presence of Cancel button in User Details window
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff clicks Add new user button
    Then Admin/User/Staff should see a button with text as Cancel  in User Details window

  Scenario: Validate Fucntionality of Cancel button
    Given Admin/User/Staff is on User Details window
    When Admin/User/Staff clicks cancel button
    Then Admin/User/Staff  see User Details window getting  closed

  Scenario: Verify the presence of Cancel(x) icon in user detais window
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff clicks Add new user button
    Then Admin/User/Staff should see a cancel(x) icon

  Scenario: Functionality of Cancel(x) icon
    Given Admin/User/Staff is on User Details details window
    When Admin/User/Staff clicks cancel(X) icon
    Then User Details window should be closed

  Scenario: Verify the presence of Submit button in User Details window
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff clicks Add new user button
    Then Admin/User/Staff should see a button with text as Submit in user details window

  Scenario: Verify the presence of Label Texts
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff clicks Add new user button
    Then Admin/User/Staff should see the placeholders with Text As "First name","Middle name", Last name","Email adress","Phone no", "Address","City", "State","Postal Code"."Program","UG Program","PG Program","Skill","Experience","Admin/User/Staff Role",Visa status","Batch","Comments"

  Scenario: Verify the presence of input fields
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff clicks Add new user button
    Then Admin/User/Staff should see the input fields for "First name","Middle name", Last name","Email adress","Phone no", "Address","City", "State","Postal Code"."Program","UG Program","PG Program","Skill","Experience","Admin/User/Staff Role",Visa status","Batch","Comments" corresponding to their labels

  Scenario: Verify drop down menu for state
    Given Admin/User/Staff is on "User Details" window
    When Admin/User/Staff clicks the drop down icon for state
    Then Admin/User/Staff should select from the drop down menu for state

  Scenario: Verify drop down menu for user role
    Given Admin/User/Staff is on "User details" window
    When Admin/User/Staff clicks the drop down icon for User Role
    Then Admin/User/Staff should select from the drop down menu for user role

  Scenario: Validating the User Details window with all fields empty
    Given Admin/User/Staff is on "User Details"window
    When Admin/User/Staff clicks submit button with all details empty
    Then Admin/User/Staff should see a Error message "Mandatory Fields cannot be empty"

  Scenario: Adding new User
    Given Admin/User/Staff is on "User Details"window
    When Admin/User/Staff clicks Submit button by entering all valid values in required fields
    Then Admin/User/Staff  see Success message  "New User Created"  is  Should be Saved.

  Scenario: Validating the User Details window with few fields empty
    Given Admin/User/Staff is on "User Details"window
    When Admin/User/Staff clicks on Submit button after entering  Few Field details
    Then Admin/User/Staff see error message "Name is required"

  Scenario: Validating the Email address
    Given Admin/User/Staff is on "User Details"window
    When Admin/User/Staff clicks on Submit button after entering wrong email address
    Then Admin/User/Staff see error message "Invalid Email address"

  Scenario: Validating the presence of Address2 button
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff clicks Add new user button
    Then Admin/User/Staff should see the button with text "+ Add C/O, Apt, Suite, Unit"

  Scenario: Validating the Phone number
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff Enters more than 10 digits
    Then Admin/User/Staff see error message "Invalid Input"

  Scenario: Validating Postal Code
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff Enters more than 5 digits
    Then Admin/User/Staff see error message "Invalid Input"

  Scenario: Validating State dropdown
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff clicks on state dropdown
    Then Admin/User/Staff see list of states in Alphabetical Order

  Scenario: Validating UG Program Dropdown
    Given Admin/User/Staff is on Manage user page
    When Admin/User/Staff clicks on UG Program dropdown
    Then Admin/User/Staff see list of UG Program

  Scenario: Validating Address line  in User Details window
    Given Admin/User/Staff is on "User Details"window
    When Admin/User/Staff clicks the button "+ Add C/O, Apt, Suite, Unit"
    Then Admin/User/Staff should see the input field with Label "New Address2"