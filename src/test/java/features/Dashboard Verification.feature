Feature: Verifying login page with multiple credentials

@SmokeTest
Scenario: user is logged in with correct credentials

Given user is on smartcare page
When user is given correct username and password
Then user is successfully loggen into home page
And Home page is showing like welcome to netbanking

@RegressionTest
Scenario: user is loging with wrong credentials

Given user is on smartcare page 
When user is enters the wrong credentials
Then Popup will come with like  user not exits

@E2E
Scenario: user1 is loging with wrong credentials

Given use1r is on smartcare page 
When user is enters the wrong credentials1
Then Popup will come with like  user not exits1

Scenario: Dashboard Application is clossed successfully
Given user is clicked close button successfully
Then Application successfully logged out