@login
Feature: Login Feature

@loginpositive
Scenario: User Login Feature
    Given user is on login page
    When user enters "mayank" & "mayank999"
    When user clicks on submit btn
    Then user is on home page
    
    Scenario Outline:: Negative Login Feature
    Given user is on login page
    When user enters "<user>" & "<password>"
    When user clicks on submit btn
    Then user is on home page
    Examples:
    |user|password|
    |admin|admin123|
    ||admin123|
    |admin||