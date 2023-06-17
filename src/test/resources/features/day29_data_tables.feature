  @data_tables
  Feature: data_tables

    Scenario: TC_01_customer_login_test
      Given user navigates to "https://www.bluerentalcars.com/"
      And user clicks on home page login button
      And user enters customer_email and customer_password
        | email          | password |
        | jack@gmail.com |12345     |
      And capture the screenshot
      And user clicks on the login page login button
      Then verify the default page is visible
      Then user logs out the application
      Then  close the application