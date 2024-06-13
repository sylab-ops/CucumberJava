
#Author: your.email@your.domain.com
#Date:
#Description

@ParamTestFeature
Feature: Feature to login functionality

@paramstest
  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    And user enters <username> and <password>
    When user click on login button
    Then user is re-directed to home page

    Examples: 
      | username | password | 
      | user1    | pass1    | 
      | user2    | pass2    |
      
 