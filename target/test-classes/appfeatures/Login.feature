Feature: login functionality
Scenario: login to application
Given I am at the login page
When I enter the crediantials
And I click on login button
Then I should be able to login 

Scenario: validate title
Given I am at the login page 
Then title should get validated 