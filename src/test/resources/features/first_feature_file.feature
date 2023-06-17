@google_search  @regression_test_runner
Feature: google search feature - this describe the name of this feature file

  Background: navigation_google
    Given user is on the google home page

  Scenario: TC_01_iphone_search - Scenario is used to create test cases
    And user search for iPhone
    Then verify the page title contains iPhone
    Then close the application


    @porcelain_tea_pot
  Scenario: TC_02 porcelain_tea_pot_search
    And user search for porcelain_tea_pot
    Then verify the page title contains porcelain_tea_pot
    Then close the application

  #    All feature files must begin with Feature: keyword
  #    We use Scenario: to create test cases/test scenarios
  #    Each line under Scenario: is called as STEP
  #    Each step must begin with GHERKIN language - Given, And, When, Then, But, *
  #    Technically we can use any of these keyword in and step, but we should follow the best practice
  #    BEST PRACTICE : Given for pre conditions in the first steps.
  #                    And and When in them middle.
  #                    Then in the verification
  #                    But and * is not used a lot
  #                    * = ANY
  #  STEPS FOR CUCUMBER AUTOMATION :
  #  1. create feature file and add test steps
  #  2. create step definitions and add java code

  #  NOTES: When creating new Scenarios, try using existing reusable steps