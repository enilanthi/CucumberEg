Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario: Login with correct credentials
    Given I am in the login page
    When I enter username as "admin" and password as "admin123"
    And I click Login button
    Then I should be directed to user form page

  Scenario: Login with data table
    Given I am in the login page
    When I enter following username and password
      | UserName | Password  |
      | adminA   | adminA123 |
      | user1A   | userA123  |
    And I click Login button
    Then I should be directed to user form page

  Scenario Outline: Login using scenario outline
    Given I am in the login page
    When I enter username as "<username>" and password as "<password>"
    And I click Login button
    Then I should be directed to user form page
    Examples:
      | username | password |
      | user2    | test123  |
      | user3    | test234  |
      | user4    | test345  |


  Scenario Outline: Login by providing valid credentials, and create email using step argument transformation
    Given I am in the login page
    When I enter username as "<username>" and password as "<password>"
    And I click Login button
    Then I should be directed to user form page
    And my email address should be created based on username: "<username>"
    Examples:
      | username | password |
      | dev1     | test123  |
      | dev2     | test234  |
      | dev3     | test345  |


  Scenario: Failing the login scenario on purpose
    Given I am in the login page
    When I enter username as "1" and password as "1"
    And I click Login button
    Then I should not be directed to user form page