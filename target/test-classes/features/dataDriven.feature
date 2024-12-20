Feature: Login Action
@Datadriven
Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters UserName and Password
	Then Message displayed Login Successfully
@Datadriven
Scenario: Successful LogOut
	When User LogOut from the Application
	Then Message displayed LogOut Successfully