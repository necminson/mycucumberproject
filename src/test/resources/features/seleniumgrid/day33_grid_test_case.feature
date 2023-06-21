@grid
Feature: grid_feature
  @grid_chrome
  Scenario: TC01_test_case_on_chrome
    Given user is on the "https://www.amazon.com" url on "chrome" browser
    Then verify the page title contains "Amazon" on grid