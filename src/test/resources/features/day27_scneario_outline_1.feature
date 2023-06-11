@scenario_outline_1
Feature: search_feature
  Background: goes_to_google
    Given user navigates to "https://www.google.com"
    Scenario Outline: search_scenario
      And user search for "<data>"
      Then verify the page title contains "<data>"
      Then close the application

      Examples: test data
        | data              |
        | bmw               |
        | tesla             |
        | Mercedes          |
        | apple             |
        | iphone            |
        | banana            |
        | porcelain tea pot |