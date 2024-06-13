#Author: your.email@your.domain.com
#Date:
#Description
@SmokeTestFeature
Feature: Feature to login functionality

	@smoketest
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    And user enters username and password
    When user click on login button
    Then user is re-directed to home page

  
