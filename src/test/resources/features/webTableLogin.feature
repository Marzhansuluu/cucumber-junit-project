Feature: User should be able to login using correct credentials

  Background:
    Given user is on the login page of web table app


  Scenario: Positive login scenario with 1 param
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks to login button
    Then user should see url contains orders


  Scenario: Positive login scenario with 2 param
    When user enters username "Test" and password "Tester" and logins
    Then user should see url contains orders

    #1- implement this new step
  #2- create login method in WebTableLoginPage
  #3 - this login method should have multiple different overloaded version


  Scenario: Login scenario with data table
    When user enters below credentials
    |username|Test|
    |password|Tester|
    Then user should see url contains orders