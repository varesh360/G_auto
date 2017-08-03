Feature: Test Grants Smoke scenario 

@LoginAndVerifyMenues 
Scenario: Test login with valid credentials 
	Given Open browser and load application 
	And Click on login link button and then click on grantor account 
	When enter valid username and valid password and Click on login button 
	Then Verify that user Loged-In successfully and should be on on Grantor section. 
	Then Hover on Grantor tab and Validate Manage Application Template link 
	
	
@CreateTemplate 
Scenario: To create the application template 
# Navigate to Grantors Tab
# Hover Grantors tab
# Go to "Grants Templates"
	Given Click on Manage Application Package Template link 
	And  Verify that user is on MANAGE APPLICATION PACKAGE TEMPLATES page. 
	When Click Create on Create New Template button. 
	And Select Form Family and Click Next Button. 
	And Click on Add/Modify template form then Select optional forms and Click on Save button 
	And Enter Template name and Click Save button 
	Then Verify that User is able to create and appears in Application package template result table 
	Then Verify that Template name is same as it was entered in the template name text field