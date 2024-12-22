Feature: Order information
Scenario: fetch currently placed information
Given user should be logged in 
When user click on orders button
Then user redirects to order page
When user click on current order 
Then user should see current order information

Scenario: cancelled order
Given user should be logged in  
When user click on orders button
Then user redirects to order page 
When user click on cancel order 
Then user should see cancelled oFetch rder information