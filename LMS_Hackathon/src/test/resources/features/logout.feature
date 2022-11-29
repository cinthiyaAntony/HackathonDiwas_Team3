Feature: logout feature

  Background: Admin/User/Staff Logged on to LMS website
    Given Admin/User/Staff is on registration  page
    When Admin/User/Staff enters following details to click login button
      | username | password | code   |
      | cinthiya | ssdgg    |        |
      | Admin    | password | 12345  |
      | staff    | password | 123456 |
     
    
    Scenario: Validating logout button
    Given Admin/User/Staff is on "Manage Program" page
    When Admin/User/Staff is clicks on logout button
    Then Admin/User/Staff should be navigated to Login Screen