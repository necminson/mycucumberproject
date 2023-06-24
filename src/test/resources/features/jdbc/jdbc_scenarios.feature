@jdbc
Feature: db_testing
  Background: connecting to the database
    Given user connects to the application database
  Scenario: TC01_read_customer_login_information
    And user gets the column "*" from the table "jhi_user"
    Then user reads all the column "login" data
  @first_names
  Scenario: TC02_read_customer_firstname_information
    And user gets the column "*" from the table "jhi_user"
    Then user reads all the column "first_name" data
#    get the customer account types and verify the account types contains CREDIT_CARD,SAVING,CHECKING,INVESTING
  @account_types
  Scenario Outline: TC03_verify_customer_account_types
    And user gets the column "*" from the table "tp_account"
    Then verify table "<table_name>" and column "<column_name>" contains the data "<data_name>"
    Examples: account_types
      | table_name | column_name  | data_name   |
      | tp_account | account_type | CREDIT_CARD |
      | tp_account | account_type | SAVING      |
      | tp_account | account_type | CHECKING    |
      | tp_account | account_type | INVESTING   |
