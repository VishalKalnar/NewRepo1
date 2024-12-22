Feature: Signup Functionality
Scenario Outline: signup to application
Given usere is at signup page 
When user enters the  name as "<name>" on form
And user select the slot no as <slotnumber>
And user select gender as "<gender>"
Then user gets created 

Examples:
 | name | slotnumber | gender|
 |Eder  |  1   | male|
 |Ron | 2  | male| 
 | Diana |6 | female|
 |Alex  | 8| male|
