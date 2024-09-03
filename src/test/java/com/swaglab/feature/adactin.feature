Feature: Book a hotel
Scenario: User login to Adactin application
    Given User launch adactin application
    When User enter the username in username field
    And  User enter the password in password field
    Then user click on the login button and navigate
    
Scenario: Trip information
    When User Select the location in location field
    Then User Select the hotel in hotel field
    And User select the roomtype in roomtype field
    And User select the number of rooms in number of rooms field
    And user select the date in check in field 
    And User select the check out date in check out field
    And User select the number of adults in adults per room field
    And User select the number if child in childs per room field
    Then User click the search button
   
Scenario: Confirms the booking information
    When User click the radio button in confirmation field
    Then User click the continue button
    
Scenario: Personal information
     When User enter the firstname in firstname field
     And User enter the Lastname in Lastname field 
     And User enter the Address in Billing address field
     And User enter the card no in credit card no field
     And User select the credit card type in card type field
     And User select the month in expiry date field
     And User select the Year in expiry date field 
     And User Enter the cvv number in cvv field
    Then User click the book now field
    

      
