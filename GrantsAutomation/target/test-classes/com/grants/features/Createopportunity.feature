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
