Feature: Registration Form Page

  Background: 
    Given Admin/User/Staff Logged on to LMS website

  #Header and Login, Signup button text form validation
  Scenario: Header Login Signup text Validation
    #When Admin/User/Staff lands on Registration page
    Then Admin/User/Staff sees the heading on the form as "Facebook"

  Scenario: Header Login login text Validation
    Then Admin/User/Staff sees a button with text "Log in" on the form

  Scenario: Header Login Signup text Validation
    Then Admin/User/Staff verify a text "Sign Up" on the form

  #Login button
  Scenario: Login button Validation
    When Admin/User/Staff clicks the Log in button
    Then Admin/User/Staff lands on Log in page

  #validating text fields on the Registration Page
  Scenario Outline: Validating the text fields on the Registration page
    When Admin/User/Staff enters following "fName" "lName" "Address" "Streetname" "zip" "city" "state" "phonenum" "bDate" "validatePassword" "validUsername" "email" "display" to click signup button
    Then Admin/User/Staff sees the message "display"

    Examples: 
      | fName | lName | Address  | Streetname | zip    | city  | state   | phonenum   | bDate | validPassword | validUsername | email           | display    |
      | qpple| apple | 1,ab apt | apple st   |  52345 | missi | ontario | 6548790989 |    12 | pwd@123       | apple         | apple@gmail.com | successful |
      |      | qw    | st apt   | 89 st      | avd345 | mango | tornto  |    1234567 |       | invalid       | invalid       | banana@123.com  | Error    |
