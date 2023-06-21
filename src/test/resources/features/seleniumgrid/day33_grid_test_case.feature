@grid
Feature: grid_feature
  @grid_chrome
  Scenario: TC01_test_case_on_chrome
    Given user is on the "https://www.amazon.com" url on "chrome" browser
    Then verify the page title contains "Amazon" on grid
    Then close the remote driver

    @gird_firefox
    Scenario: TC02_test_case_on_firefox
      Given user is on the "https://www.amazon.com" url on "firefox" browser
      Then verify the page title contains "Amazon" on grid
      Then close the remote driver
  @gird_edge
  Scenario: TC03_test_case_on_edge
    Given user is on the "https://www.amazon.com" url on "edge" browser
    Then verify the page title contains "Amazon" on grid
    Then close the remote driver