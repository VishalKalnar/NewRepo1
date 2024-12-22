Feature: Homepage Functionality
@sanity
Scenario: validation of title of page
Given I am at landing page
Then page title should contains "Shopping"

@regression
Scenario: Verify cart icon
Given I am at landing page
Then cart icon should get displayed
 
@functional
Scenario: Check out the deals section
Given I am at landing page
When I click on mobile deals
Then mobile deals section should open