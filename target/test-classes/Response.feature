Feature: Automation REST API Testing on https://jsonplaceholder.typicode.com/
  As a User
  I want to visit REST API URI
  So that User can see the respective result
  @Smoke
  Scenario: CRUD Operation on https://jsonplaceholder.typicode.com/
    Given User set the  REST API URL with GET API endpoint.
    When  User select User ID and send GET HTTP Method to retrieve the email address of that User ID.
    And   User Using same User ID send GET HTTP Method to retrieve associated posts and verify they contain valid POST ID.
    And   User send POST HTTP Method with same User ID with non-empty body and title and verify the correct response is returned.
    Then  User can see the respective result.
