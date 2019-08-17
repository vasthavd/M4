Feature:  Make Payment
Scenario: Invalid Card Holder Name
Given User is on Personal Details Page
When User enters invalid card holder Name
Then The card holder Name  field is invalid

Scenario: Invalid Debit card number
Given User is on Personal Details Page
When User enters valid data in card holder Name field but invalid data in debit card number field
Then The debit number field is invalid

Scenario: Invalid expiration month
Given User is on Personal Details Page
When User enters valid data in card holder Name and debit card number field but invalid data in expiration date field
Then The expiration date field is invalid

Scenario: Invalid expiration year
Given User is on Personal Details Page
When User enters valid data in card holder Name,debit card number and expiration month field but invalid data in expiration year field
Then The expiration year field is invalid

Scenario: Make payment 
Given User is on Personal Details Page
When User clicks  on Make Payment button with valid inputs
Then Redirected  to success Page 