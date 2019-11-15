
@Api
Feature: Title of your feature

@ignore
  @GetWithoutParams
  Scenario: User should be able to get all the employees
    When User send a get request to "/api/users"
    Then User should get status code "200"
    And Response data should have an email

  
  
  @GetWithParams
  Scenario: User should be able to get selected employees
    Given User send an id 1
    When User send a get request to "/api/users/{id}"
    Then User should get status code "200"
    And Response data should have a selected email
 