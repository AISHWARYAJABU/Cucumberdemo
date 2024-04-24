Feature: Search functionality
  As a user
  I want to perform a search on Google
  So that I can find relevant information

  Scenario: Perform a search on Google
    Given I am on the Google search page
    When I search for "TestNG"
    Then I should see search results
