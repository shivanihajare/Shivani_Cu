Feature:  my validations on mercury application

Scenario: user access to signup in website
Given Mercury website is launched
And user clicks on signup button
When user enters proper data
Then clicks on submit button for account creation

Scenario: user access to Login for registered Member
Given registered user clicks on signIn link
Then he provides valid data for login input fields
And clicks on submit button for the login validation

@Regression
Scenario: user access to Book Flight
Given user verifies the flights available
Then selects the desired flight
When user makes the payment
Then Tickets are generated

