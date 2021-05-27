Feature: Registration Feature

Scenario: Positive registration scenario
Given user is on registration page
When user enters details
|username|mayank|
|password|mayank989|
|cpassword|mayank989|
|mob|123456789|
|comp|cg|
And user clicks on submit btn
Then user is successfully registered