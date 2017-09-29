Feature: Testing login functionality
Scenario Outline: Login functionality for a social networking site
Background:
  
  Given user navigates to Facebook
  When I enter Username as "<username>" and Password as "<password>"
  Then login should be unsuccessful
 Examples:
    | username | password |
    |  uss     |  pass    |
    |  uss2    |  pass2   |