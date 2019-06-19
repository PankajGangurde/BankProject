Feature: Home Loan Basic
This feature verifies the basic loan borrowing information
 
Scenario: Check the borrowing estimates of a person
Given I launch Chrome browser instance
When I open Bank Homepage
And I enter the person details
Then I verify the borrowing estimate
And I close the browser

Scenario: Check the Start over button clears the form
Given I launch Chrome browser instance
When I open Bank Homepage
And I enter the person details
Then I verify the borrowing estimate
Then I verify Start over button clears the form
And I close the browser

Scenario: Check the error message on submitting the form with zero values
Given I launch Chrome browser instance
When I open Bank Homepage
And I enter the person details with living expense value
Then I verify the error message
And I close the browser