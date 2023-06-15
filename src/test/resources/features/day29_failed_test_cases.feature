@failed_test_case
Feature: customer_login_failing_on_purpose
  Scenario Outline: TC01_<PositiveTest>_customer_login_test
    Given user navigates to "https://www.bluerentalcars.com/"
    And user clicks on home page login button
    And user enters "<email>" and "<password>"
    Then user logs out the application
    Then close the application
    Examples: test_data
      | email                          | password  |
      | sam.walker@bluerentalcars.com  | c!fas_art |
      | kate.brown@bluerentalcars.com  | tad1$Fas  |