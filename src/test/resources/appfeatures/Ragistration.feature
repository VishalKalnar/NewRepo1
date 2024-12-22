Feature: Opening Bank account
Scenario: Opening bank account with user 
Given user is at accounts page 
When user enters the following data
|firstName| lastname| email| phone|
| Erin | smith | erin.smith@gmail.com | 9988776655|
|Robert|Jackson | robertjackson@gmail.com|9881221282|
And user clicks on submit button
Then application should get submitted 