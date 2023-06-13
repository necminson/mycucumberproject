@creation_new_user
Feature: new_user
  Scenario Outline: TC01_new_user_creation
    Given user navigates to "https://editor.datatables.net/"
    When user clicks on home page new button
    And user enters all fields credentials s.t "<firstname>" , "<lastname>" , "<position>" , "<office>"  , "<extension>" ,"<startDate>","<salary>"
    And user clicks on create button
    And user search for the "<firstname>" and "<lastname>"
    Then verify the name field contains "<firstname>" and "<lastname>"
    And close the application


    Examples: user_data
      | firstname | lastname | position  | office | extension | startDate  | salary |
      | Ali       | Desidero | Baba      | Home   | 157       | 2023-05-18 | 1000   |
      | Apolos    | Topolos  | physician | tesla  | 123       | 2023-01-29 | 3000   |



