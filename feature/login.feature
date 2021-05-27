@login 
Feature: Login Feature 

Background: 
	Given user is on login page 
	
@positive 
Scenario: User Login Feature 
	When user enters "mayank" & "mayank999" 
	When user clicks on submit btn 
	Then user is on home page 
	
Scenario Outline: : Negative Login Feature 
	When user enters "<user>" & "<password>" 
	When user clicks on submit btn 
	Then user is on same page 
	Examples: 
		|user|password|
		|admin|admin123|
		||admin123|
		|admin||