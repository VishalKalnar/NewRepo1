@campaigns
Feature: Sending email campaign 
@sanity @functional
Scenario: Create Campaign
Given user should be at campaigns page
When  user clicks on create campaign button 
And user enters the information
Then campaign should get created 

@regression 
Scenario: Schedule campaign
Given user should be at campaigns page
When user clicks on the edit campaign
And enter the schedule time
Then campaign get scheduled
  
@functional 
Scenario: validate sent campaign
Given user should be at campaigns page
When user clicks on the sent campaign
Then user should see count of email triggered