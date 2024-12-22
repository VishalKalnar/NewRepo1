Feature: Search Product
@functional
Scenario: verify search Product functionality
Given I am at landing page
When I search the item as "mobile" in search field  
Then I should see search results
