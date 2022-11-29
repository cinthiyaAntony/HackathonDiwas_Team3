Feature: login

  Background: Admin/User/Staff opens the LMS website
    Given user is on home page
    When user clicks login
    
#1 login button
		Then validate user is on login page 
		
  #2user credentials
  Scenario Outline: validates the user login credential
    When user enters "<username>"  "<password>"  and click
    Then user see "<status>" of the message

    Examples: 
      | username | password  | status                                   |
      | user     | password1 | Manage Program                           |
      | user     | invalid   | Entered invalid password                 |
      | invalid  | password1 | Entered invalid username                 |
      | invalid  | invalid   | The username and password  are incorrect |
      | user     |           | enter valid password                     |
      | invalid  | password1 | Entered invalid username                 |

  #2
  Scenario Outline: validates the admin and staff login credential
    When admin or staff enters "<name>" "<pwd>" "<code>" and click
    Then admin or staff see "<message>"

    Examples: 
      | name    | pwd     | code | message                  |
      | admin   | pwd1    | 1234 | Manage Program           |
      | staff   | pwd2    |  789 | Manage Program           |
      | admin   | invalid |  123 | Entered invalid password |
      | staff   | invalid |  234 | Entered invalid password |
      | invalid | pwd1    |  235 | Entered invalid username |
      | invalid | pwd2    |  235 | Entered invalid username |
      | admin   | pwd1    |      | The code is required     |
      | admin   | pwd2    |      | The code is required     |

  #3
  Scenario: Validate forgot password link
    When Admin/User/Staff clicks Forgot password link
    Then It should redirected to forgot Password page

  #4
  Scenario Outline: Validate forgot password with  email id
    Given Admin/User/Staff is on Forgot Password Page
    When Admin/User/Staff  clicks continue after entering valid "<email>"
    Then Admin/User/Staff should be redirected to enter verification code page and verification code will be sent to email

    Examples: 
      | email           |
      | cinth@gmail.com |

  #5
  Scenario: Validate verifiction code
    Given Admin/User/Staff is on Enter verification code Page
    When Admin/User/Staff clicks continue after entering verification "code"
    Then Admin/User/Staff should be redirected reset password page

  #6
  Scenario: Validate click here link in verification code page
    Given Admin/User/Staff is on Enter verification code Page
    When Admin/User/Staff clicks Click here link to resend
    Then The verification code should be resend to email

  #7
  Scenario Outline: Validate reset password
    Given Admin/User/Staff is on reset password page
    When Admin/User/Staff clicks submit button after entering "<newpwd>" and "<retypepwd>" password and click
    Then Admin/User/Staff  should be see "<Pagemessage>"

    Examples: 
      | newpwd    | retypepwd | Pagemessage                                     |
      | Pwd123456 | Pwd123456 | login Page                                      |
      | Pwd223456 | Pwd223456 | login Page                                      |
      | Pwd334567 | Pwd334567 | password and retype password are mismatched     |
      | Pwd1      | Pwd12     | password and retype password are mismatched     |
      | Pwd2      | Pwd22     | password and retype password are mismatched     |
      | Pwd3      | Pwd32     | password and retype password are mismatched     |
      | Pwd1      | Pwd1      | The password must contain 8 characters          |
      | Pwd2      | Pwd22     | The password must contain 8 characters          |
      | Pwd3      | Pwd32     | The password must contain 8 characters          |
      | pwd1      | pwd1      | The password must contain one Capital letter    |
      | pwd2      | pwd22     | The password must contain one Capital letter    |
      | pwd3      | pwd32     | The password must contain one Capital letter    |
      | pwd       | pwd       | The password must contain one Number            |
      | pwd       | pwd       | The password must contain one Number            |
      | pwd       | pwd       | The password must contain one Number            |
      | pwd       | pwd       | The password must contain one Special character |
      | pwd       | pwd       | The password must contain one Special character |
      | pwd       | pwd       | The password must contain one Special character |