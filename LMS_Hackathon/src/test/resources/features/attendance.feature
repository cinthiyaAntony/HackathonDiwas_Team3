Feature: Header validation

  Background: Admin/User/Staff Logged on to LMS website
    Given Admin/User/Staff is on registration  page
    When Admin/User/Staff enters following details to click login button
      | username | password | code   |
      | cinthiya | ssdgg    |        |
      | Admin    | password |  12345 |
      | staff    | password | 123456 |
    Then Admin/User/Staff is on "Manage Program" page

  Scenario: Validating the Attendance Header
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff Clicks on Attendance button
    Then Admin/User/Staff see header text as "Manage Attendance"

  Scenario: validating the attendance footer
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff is on Manage Attandance page
    Then Admin/User/Staff see Footer text as "In total there are 5 entries."

  #3  Pagination validation
  Scenario: Validating the Attendance Paginator
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff is on Manage Attendance page
    Then Admin/User/Staff see the text as "Showing 1 to 5 of 5 entries."

  Scenario: Verify All paginator button on the Attendance page
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff is on Manage Attendance page
    Then Admin/User/Staff see all paginator buttons are Disabled

  Scenario: Verify the Edit Button
    Given User/Staff is on Manage Attendance page
    When User/Staff Clicks on Edit "Button"
    Then Admin see header text as "Attendance Details"

  Scenario: Edit ProgramName in Attendance Details window
    Given User/Staff Clicks on Edit "Button"
    When User/Staff clicks on Save button after changing Program Name
    Then User/Staff see success message "Updated Successfully"

  Scenario: Edit User Name Attendance Details window
    Given User/Staff Clicks on Edit "Button"
    When User/Staff clicks on Save button after changing User name
    Then User/Staff see success message as "Updated Successfully"

  Scenario: Edit Present in Attendance Details window
    Given User/Staff Clicks on Edit "Button"
    When User/Staff clicks on Save button after disabling Present details
    Then User/Staff see success message "Updated Successfully"

  Scenario: Edit Absent in Attendance Details window
    Given User/Staff Clicks on Edit "Button"
    When User/Staff clicks on Save button after enabling Absent details
    Then User/Staff can see success message "Updated Successfully"

  Scenario: Click on Cancel button in Attendance Details window
    Given User/Staff Clicks on Edit "Button"
    When User/Staff clicks on Cancel button after entering details
    Then User/Staff see a Attendance Details window getting closed

  Scenario: Admin Verify the Edit Button
    Given Admin is on Manage Attendance page
    When Admin Clicks on Edit "Button"
    Then Admin see Error Message "Admin Has View Only Permission"

  Scenario: Verify the Delete Functionality
    Given User/Staff is on Manage Attendance page
    When User/Staff Clicks on Delete "Button"
    Then Admin see header text as "Delete Confirm"

  Scenario: Click on "Yes" button in Delete Confirm window
    Given User/Staff Clicks on Delete "Button"
    When User/Staff  Clicks on " Yes"  button
    Then "User/Staff  see Success message "Program Deleted Succesfully"

  Scenario: Click on "No" button in Delete Confirm window
    Given User/Staff Clicks on Delete "Button"
    When User/Staff  Clicks on "No" button
    Then User/Staff can see Program Name not deleted

  Scenario: Admin Verify the Delete Functionality
    Given Admin is on Manage Attendance page
    When Admin Clicks on Delete "Button"
    Then Admin see Error Message "Admin Has View Only Permission"

  Scenario: Verifying the Checkbox functionality of a Program Name
    Given Admin/User/Staff is on Manage Attendance page
    When Admin/User/Staff Clicks on Checkbox
    Then Admin/User/Staff  see list of Users in that Program

  Scenario: Verifying the Functionality of a Present button
    Given Admin/User/Staff is on Manage Attendance page
    When Admin/User/Staff  Clicks on Present
    Then Admin/User/Staff  see the list of  "User Name" who are Present

  Scenario: Verifying the Functionality of a Absent button
    Given Admin/User/Staff is on Manage Attendance page
    When Admin/User/Staff  Clicks on Absent
    Then Admin/User/Staff  see the list of  "User Name" who are Absent