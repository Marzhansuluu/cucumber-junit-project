Feature: Google search functionality
  Agile story: As a user, when i am on the Google search page
  i should be able to search whatever i want and see relevant information


  Scenario: Search page title verification
    When user is on Google search page
    Then user should see title is Google



  Scenario: Search functionality result title verification
    Given user is on Google search page
    When user types apple clicks enter
    Then user sees apple in the google title

  Scenario: Search functionality result title verification
    Given user is on Google search page
    When user types "apple" clicks enter
    Then user sees "apple" in the google title


