Feature: Test for creating opportunity

@CreateOppurtunity
Scenario: To create the opportunity
Given Login and Navigate to Grantors Tab
And Hover Grantors tab and Click on Manage Opportunities link under Grants Opportunities section
Then Verify that User is on MANAGE OPPORTUNITIES page
Then Click Create on Create New Opportunity button
And Enter Opportunity Number Title Category Category Explanation CFDA Number(s)
And Select Opportunity Component as package and Click Next button.
Then Verify that User is on NEW PACKAGE CREATION page.

@NewPackageCreation
Scenario: New Package creation
Given Fill the details in NEW PACKAGE CREATION form
Then Click on Select Package Template under Form Package
And Enter Template Name and click search button
Then Select template from search result table
And Click Save button and Click on publish button
Then Verify that User is on PACKAGE PUBLICATION VERIFICATION page 
And Validte Opportunity Number, Title, CFDA Number, CFDA Title, Competition ID, Competition Title
And Validate Electronic Required, Expected Number of Applications, Application Size, Open Date, Close Date
And Validate Grace Period, Agency Contact, Application Instructions, Available to
Then Again Click on publish button to confirm
And Verify That User is on PACKAGE PUBLICATION SUCCESS page able to publish package successfully with the message
Then Click on Continue button
And Verify that User is on MANAGE OPPORTUNITY page and validate opportunity number