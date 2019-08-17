Feature:  Pan Card Registration
Scenario: Invalid Applicant Name
Given User is on User Information Page
When User enters invalid Applicant Name
Then The Applicant Name  field is invalid

Scenario: Invalid First Name
Given User is on User Information Page
When User enters valid data in Applicant Name field but invalid data in First Name field
Then The First Name field is invalid

Scenario: Invalid Last Name
Given User is on User Information Page
When User enters valid data in Applicant Name and First Name field but invalid data in Last Name field
Then The Last Name field is invalid

Scenario: Invalid Father Name
Given User is on User Information Page
When User enters valid data in Applicant Name,First Name and Last Name field but invalid data in Father Name field
Then The Father Name field is invalid
Scenario: Invalid Date Of Birth
Given User is on User Information Page
When User enters valid data in Applicant Name,First Name,Last Name and Father Name field but invalid data in Date of Birth field
Then The Date Of Birth field invalid
Scenario Outline: User is Registering
Given User is on User Information Page
When User selects <input> radiobutton
Then <value> should be send as Gender val
Examples:
| input | value |
| Male | Male |
| Female | Female | 
Scenario: Invalid Phone Field
Given User is on Information Page
When User enters valid data in User Name,Last Name,Father Name,Date of birth field but invalid data in Phone field
Then The Phone no field is invalid
Scenario: Invalid Email Id
Given User is on User Information Page
When User enters valid data in User Name,Last Name,FatherName,Date of birth and Phone field but invalid data in Email Id field
Then The Email Id field is invalid
Scenario: Invalid Landline Field
Given User is on Information Page
When User enters valid data in User Name,Last Name,Father Name,Date of birth,Email Id and Phone field but invalid data in Phone field
Then The Landline no field is invalid
Scenario Outline: User is Registering way of communication
Given User is on User Information Page
When User selects <input> radiobutton
Then <value> should be send as Communication val
Examples:
| input | value |
| Residence | Residence |
| Office | Office | 
Scenario: Invalid Address
Given User is on User Information Page
When User enters valid data in User Name,Last Name,FatherName,Date of birth,Phone and Email Id field but invalid data in Address field
Then The Address field is invalid


Scenario: Sumit Form
Given User is on User Information Page
When User clicks  on Submit button with valid inputs
Then Redirected  to Success Page 

Scenario: Reset Form
Given User is on User Information Page
When User clicks  on Reset button
Then All fields in forms should be blank