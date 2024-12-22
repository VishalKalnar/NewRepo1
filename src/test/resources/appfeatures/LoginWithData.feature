Feature: Login to app with data
Scenario: validate login with data
Given user should be at loginpage
When user enters username as "testuser"
And user enters password as "test@1234"
And user click on submit button 1
Then user should get logged into application
