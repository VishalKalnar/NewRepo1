Feature: Placing order feature
Scenario: Order confirmation
Given I should at the product page
When I click on add to cart button
Then Product should get add to cart
When I clicked on place order
Then order should get placed 