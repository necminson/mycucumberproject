@excel_automation
Feature: excel_automation
  Scenario: TC01_login_customer
    Given user tries to login as "customer_info"
    And close the application

  @excel_admin
  Scenario: TC02_login_admin
    Given user tries to login as "admin_info"
    And close the application
