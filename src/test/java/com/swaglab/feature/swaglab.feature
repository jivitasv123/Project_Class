Feature: To book a product in swaglab application
Scenario: User login the swaglab application
Given User launch swaglab application
When User enter the username in username field
And User enter the password in password field
Then user click on the login button and navigate

Scenario: User selects the product
When User sort the products from low to high
And User select the fleece jacket product
And User select the Bolt t-shirt
Then User click on add to cart button

Scenario: User enters checkout information
    When User enter the firstname in firstname field
    Then User enter the lastname in lastname field
    And User enter the zipcode in zipcode field
    And User click the continue button
    Then user click the finish button 

    
