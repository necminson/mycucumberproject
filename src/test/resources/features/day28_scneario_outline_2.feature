#User Story : US167854_manager_login_test
#NAME:user should be able to login with manager credentials
#AC: Given user is on the home page
#When user navigates to the login page
#And enter username
#And enter password
#And click on login button
#Then verify the login is successful
#ARTIFACT:
#url : https://www.bluerentalcars.com/
#Credentials:
#                {"sam.walker@bluerentalcars.com","c!fas_art"},
#                {"kate.brown@bluerentalcars.com","tad1$Fas"},
#                {"raj.khan@bluerentalcars.com","v7Hg_va^"},
#                {“pam.raymond@bluerentalcars.com","Nga^g6!"}
#NOTE: Use scenario outline
  @customer_login
Feature: customer_login
  Scenario Outline: TC01_<PositiveTest>_customer_login_test
    Given user navigates to "https://www.bluerentalcars.com/"
    And user clicks on home page login button
    And user enters "<email>" and "<password>"
    And capture the screenshot
    And user clicks on the login page login button
    Then verify the default page is visible
    Then user logs out the application
    Then  close the application
    Examples: test_data
      | email                          | password  |
      | sam.walker@bluerentalcars.com  | c!fas_art |
      | kate.brown@bluerentalcars.com  | tad1$Fas  |
      | raj.khan@bluerentalcars.com    | v7Hg_va^  |
      | pam.raymond@bluerentalcars.com | Nga^g6!   |