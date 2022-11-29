Feature: Assignment

  Background: Admin/User/Staff Logged on to LMS website
    Given Admin/User/Staff is on registration  page
    When Admin/User/Staff enters following details to click login button
      | username | password | code   |
      | cinthiya | ssdgg    |        |
      | Admin    | password | 12345  |
      | staff    | password | 123456 |
    Then Admin/User/Staff is on "Manage Program" page

  #1
  Scenario: Header validation Footer Validation
    When Admin/User/Staff clicks on Assignment Page
    Then Admin/User/Staff Should see a Header "Manage Assignment"
    And Admin/User/Staff Should see a Footer text "In Total there are 3 assignments"
    And Admin/User/Staff Should see a Paginator text 3 entries
     
  #2
  Scenario: Paginator validation
    When Admin/User/Staff clicks on Assignment Page
    Then Admin/User/Staff Should be navigated to next page
    And Admin/User/Staff Should be navigated to previous page
    And Admin/User/Staff Should be navigated to Last page
    And Admin/User/Staff Should be navigated to First  page

  #3 Search TextBox Functionality
  Scenario: Validate Search Feature
    When Admin/User/Staff clicks on Assignment Page
    And Admin/User/Staff clicks Search bar after entering Assignment name "Sql Assignment"
    Then The requested "Sql Assignment" details should be displayed

  #4 Ascending Order Functionality
  Scenario: verify Assignment Name are displayed in Ascending order
    When Admin/User/Staff Clicks on "Assignment Name" Ascending Arrow
    Then Admin/User/Staff should see the "Assignment Name" displayed in Ascending order

  Scenario: Verify Assignment Name are displayed in Ascending order
    When Admin/User/Staff Clicks on Assignment Description "Assignment Description" Ascending Arrow
    Then Admin/User/Staff should see the Assignment Description "Assignment Description" displayed in Ascending order

  Scenario: Verify Assignment Duedate are displayed in Ascending order
    When Admin/User/Staff Clicks on Assignment Due Date "Assignment Due Date" Ascending Arrow
    Then Admin/User/Staff should see the Assignment Due Date "Assignment Due Date" displayed in Ascending order

  Scenario: Verify Assignment Grade  are displayed in Ascending order
    When Admin/User/Staff Clicks on Assignment Grade "Assignment Grade" Ascending Arrow
    Then Admin/User/Staff should see the Assignment Grade "Assignment Grade" displayed in Ascending order

  #Descending order Functionality
  Scenario: Verify Assignment Name are displayed in Descending order
    When Admin/User/Staff Clicks on Assignment Name "Assignment Name" Descending Arrow
    Then Admin/User/Staff should see the Assignment Name "Assignment Name" displayed in Descending order

  Scenario: Verify Assignment Description are displayed in Descending order
    When Admin/User/Staff Clicks on Assignment Description "Assignment Description" Descending Arrow
    Then Admin/User/Staff should see the Assignment Description "Assignment Description" displayed in Descending order

  Scenario: Verify Assignment Duedate are displayed in Descending order
    When Admin/User/Staff Clicks on Assignment Due Date "Assignment Due Date" Descending Arrow
    Then Admin/User/Staff should see the Assignment Due Date "Assignment Due Date" displayed in Descending order

  Scenario: Verify Assignment Grade are displayed in Descending order
    When Admin/User/Staff Clicks on Assignment Grade "Assignment Grade" Descending Arrow
    Then Admin/User/Staff should see the Assignment Grade "Assignment Grade" displayed in Descending order
    
    #Add New Assignment Functionality
    When Admin/User/Staff clicks a Add New Assignment button
    Then Admin/User/Staff should see a message "Staff only have access to add New Assignment"

  @staff
   Scenario: Validate Add New Assignment button
    When Staff clicks a Add new assignment button
    Then Staff should see Assignment details window

  @staff
  Scenario: No details Entered in  Assignment Details window
    When Staff  clicks on Save after leaving all the fields empty
    Then Staff should see an error message "Name is required"

  @staff
  Scenario: Staff Validate Assignment Details window with entering all fields
    When Staff clicks save button after entering assignment name assignment description assignment Grade and Duedate
    Then Staff should see a message "New Assignment successfully added"
 
  @staff
  Scenario: Staff Click Cancel in Assignment Details window
    When Staff clicks cancel button with entering all fields
    Then Staff should see a Assignment details window is closed

  @staff
  Scenario: Validate  Manage button in Assignment Grade
    When Staff clicks manage button under Assignment Grade
    Then Staff should be navigated to Grade Window

  Scenario: Validate Add New Assignment button
    When Admin/User/Staff clicks a Add New Assignment button
    Then Admin/User/Staff should see a message "Staff only have access to add New Assignment"

  #Edit Functionality
  @staff
  Scenario: Staff Validates Edit button
    When Staff clicks an edit Assignment button
    Then Staff should see a Assignment details window

  @staff
  Scenario: Staff Edit Assignment Name in Assignment Details window
    When Staff clicks Save button after edits Assignment Name
    Then Staff should see a message "Assignment Name Updated"

  @staff
  Scenario: Staff Edit Assignment Description in Assignment Details window
    When Staff clicks Save button  after edits Assignment Description
    Then Staff should see a message "Assignment Description Updated"

  @staff
  Scenario: Staff Edit Assignment Grade in Assignment Details window
    When Staff clicks Save button After edits Assignment Grade
    Then Staff should see a message "Assignment Grade Updated"

  @staff
  Scenario: Staff Edit Assignment DueDate in Assignment Details window
    When Staff clicks Save button After edits Assignment DueDate
    Then Staff should see a message "Assignment Due Date Updated"

  @staff
  Scenario: Staff Click Cancel in  Assignment Details window
    When Staff clicks cancel button
    Then Staff Should see a Assignment Details Page is closed

  Scenario: Admin/User/Staff Validate Edit button
    When Admin/User/Staff clicks Edit button
    Then Admin/User/Staff should see a message "Staff only have access to Edit Assignment"

  #Assignment Google Form
  Scenario: Admin/User/Staff clicks Assignment Name
    When Admin/User/Staff clicks on Assignment Name
    Then Admin/User/Staff should be navigated to Assignment Google form page

  @admin
  Scenario: Admin clicks Assignment Name
    When Admin clicks on Assignment Name
    Then Admin should see a warning message "you dont have access"

  Scenario: Admin/User/Staff validate assignment Google form with entering all fields
    When Admin/User/Staff clicks on submit button after entering all questions and mail id
    Then Admin/User/Staff entered google forms successfully

  Scenario: Admin/User/Staff validate assignment Google form leaving empty
    When Admin/User/Staff clicks on submit button after leaving all questions and mail id
    Then Admin/User/Staff should get a warning message "Must enter the mandatory fields"

  Scenario: Admin/User/Staff Validate Assignment google form after cliclking clear button
    When Admin/User/Staff clicks clear form button after entering all questions and mail id
    Then The Assignment Google form cleared successfully

  Scenario: Admin/User/Staff clicks Switch account
    When Admin/User/Staff clicks Switch account link
    Then Admin/User/Staff should be switched over the account Successfully

  #Delete Assignment Functionality
  @staff
  Scenario: Staff clicks delete button
    When Staff clicks on delete button on the righr side
    Then Staff should see a Delete Confirmation window

  @staff
  Scenario: Staff click Yes in Delete confirmation window
    When Staff clicks Yes
    Then Staff Should see "Assignment Deleted Successfully"

  @staff
  Scenario: Staff clicks No button in Delete confirmation window
    When Staff clicks No
    Then Confirmation delete window should be closed successfully

  @admin
  Scenario: Admin clicks delete button
    When Admin clicks on delete button
    Then Admin should see a message "Staff only have access"

  Scenario: Admin/User/Staff clicks delete button
    When Admin/User/Staff clicks on delete button
    Then Admin/User/Staff should see a message"Staff only have access"

  # Delete Multiple Assignment Functionalty
  Scenario: Admin/User/Staff Validate Disabled delete button
    When Admin/User/Staff clicks on delete button on the top left
    Then Admin/User/Staff/ should see a disabled delete button

  @staff
  Scenario: Staff  validate delete button on the top left
    When Staff clicks delete button on the top aftr selecting multiple checkbox
    Then Staff should see a  Delete confirm window

  #Checkbox Functionality
  Scenario: Admin/User/Staff validate check box on the left side to the Assignment Name
    When Admin/User/Staff clicks check box on the left side to the Assignment Name
    Then Admin/User/Staff should see a enabled delete button on the top left

  @admin
  Scenario: Admin validate check box on the left side to the Assignment Name
    When Admin clicks check box on the left side to the Assignment Name
    Then Admin should see a warning message "Admin dont have access  "

  Scenario: Admin/User/Staff validate individual checkbox
    When Admin/User/Staff clicks individual checkbox button
    Then Admin/User/Staff should see a delete button on the top left

  @admin
  Scenario: Admin validate individual checkbox
    When Admin clicks individual checkbox button
    Then Admin should see a warning message "Admin dont have access "
