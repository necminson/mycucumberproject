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
      | firstname | lastname | position | office     | extension | startDate  | salary |
      | Alice     | Mark     | Teacher  | Miami      | 12        | 2023-05-18 | 1000   |
      | Bruce     | Lee      | Kung Fu  | Here After | 14        | 2023-01-29 | 3000   |
      | Ayse      | Kalem    | Doctor   | Istanbul   | 15        | 2021-03-01 | 9000   |
      | Mansur    | Bekcanov | Engineer | Tashkent   | 13        | 2013-04-13 | 1500   |
      | Ertan     | Kara     | Academic | Ankara     | 11        | 2022-12-12 | 1300   |



