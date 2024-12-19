Feature: Application login

@SmokeTest @Reggression
Scenario: Admin page default login
    Given user is on netbanking login page
    When user is login into application
    Then home page is displayed
    And cards are displayed
 @Reggression  
Scenario: Sec Admin page default login

Given: sec user is on netbanking login page
When user is log into Application
Then Homepage is displayed
And cards are displayed


Scenario: 