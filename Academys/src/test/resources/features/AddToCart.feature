#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Add to Cart Feature
  As a User I should be able to add a product to the Cart

  @tag1
  Scenario: As a User I should be able to add a product to the Cart
    Given User opens the browser
    And User navigates to the following page "http://automationpractice.com/index.php"
    And User clicks on T-shirt tab
    When User clicks on Add to cart button
    Then There should be 1 item in the cart
    

