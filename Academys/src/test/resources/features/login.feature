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
Feature: Login Feature
  As a user i should be able to log in so i can see my profile page

	
  @tag1
  Scenario: As a user I should be able to log in with valid credentials 
    Given User clicks on Sign In
    When User enters valid email address "test800@hotmail.com"
    And User enters valid password "test123"
    And User clicks Sign In button
    Then User should be in profile page
 
  @ignore
  @tag2
  Scenario: As a user i should not be able to log in with invalid credentials
  	Given User opens the browser 
    And User navigates to the following page "http://automationpractice.com/index.php"
    And User clicks on Sign In
    When User enters invalid email address "test800otmailcom"
    And User enters invalid password "tes3"
    And User clicks Sign In button
    Then Error message should be displayed
   
 	@ignore
  @tag3
  Scenario: As a user i forgot the password i should be able to retreive my password
		Given User opens the browser 
    And User navigates to the following page "http://automationpractice.com/index.php"
    And User clicks on Sign In
    And User clicks on Forgot your password? link
    When User enters valid email address "test800@hotmail.com"
    And User clicks Retrieve password button
    Then User receives email with new password  
  
  @ignore  
  @tag4
  Scenario: As a user i should not be able to log in with email address in blank
  	Given User opens the browser 
    And User navigates to the following page "http://automationpractice.com/index.php"
    And User clicks on Sign In
    When User enters valid password "test123"
    And User clicks Sign In button
    Then Error message should be displayed
  
  @ignore 
  @tag5
   Scenario: As a user i should not be able to log in with email address and password in blank
  	Given User opens the browser 
    And User navigates to the following page "http://automationpractice.com/index.php"
    And User clicks on Sign In
    When User clicks Sign In button
    Then Error message should be displayed
  
  @ignore
  @tag6
  Scenario: As a user i should not be able to log in with password in blank
  	Given User opens the browser 
    And User navigates to the following page "http://automationpractice.com/index.php"
    And User clicks on Sign In
    When User enters valid email address "test800@hotmail.com"
    And User clicks Sign In button
    Then Error message should be displayed
  
  @ignore 
  @tag7
  Scenario: As a user i should not be able to log in with invalid password
  	Given User opens the browser 
    And User navigates to the following page "http://automationpractice.com/index.php"
    And User clicks on Sign In
    When User enters valid email address "test800@hotmail.com"
    And User enters invalid password "tes3"
    And User clicks Sign In button
    Then Error message should be displayed
  
  @ignore 
  @tag8
  Scenario: As a user i forgot the password i should not be able to retreive my password with invalid email address
		Given User opens the browser 
    And User navigates to the following page "http://automationpractice.com/index.php"
    And User clicks on Sign In
    And User clicks on Forgot your password? link
    When User enters invalid email address "test800otmailcom"
    And User clicks Retrieve password button
    Then Error message should be displayed
  @ignore
  @tag9  
  Scenario: As a user i should be able to buy something
  	Given User should be logged
    When User should click on Women
    And User add an article
    And User should proceed to checkout
  
