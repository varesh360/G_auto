$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Createopportunity.feature");
formatter.feature({
  "line": 1,
  "name": "Test for creating opportunity",
  "description": "",
  "id": "test-for-creating-opportunity",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "To create the opportunity",
  "description": "",
  "id": "test-for-creating-opportunity;to-create-the-opportunity",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@CreateOppurtunity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Login and Navigate to Grantors Tab",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Hover Grantors tab and Click on Manage Opportunities link under Grants Opportunities section",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Verify that User is on MANAGE OPPORTUNITIES page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click Create on Create New Opportunity button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Enter Opportunity Number Title Category Category Explanation CFDA Number(s)",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Select Opportunity Component as package and Click Next button.",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Verify that User is on NEW PACKAGE CREATION page.",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateOpportunity.Login_and_navigate_to_Grantors_Tab()"
});
formatter.result({
  "duration": 57261417895,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.hover_Grantors_tab_and_Click_on_Manage_Opportunities_link_under_Grants_Opportunities_section()"
});
formatter.result({
  "duration": 2534138831,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.verify_that_User_is_on_MANAGE_OPPORTUNITIES_page()"
});
formatter.result({
  "duration": 38667648,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.click_Create_on_Create_New_Opportunity_button()"
});
formatter.result({
  "duration": 5875866965,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.enter_Opportunity_Number_Title_Category_Category_Explanation_CFDA_Number_s()"
});
formatter.result({
  "duration": 3618830208,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.select_Opportunity_Component_as_package_and_Click_Next_button()"
});
formatter.result({
  "duration": 2906677952,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.verify_that_User_is_on_NEW_PACKAGE_CREATION_page()"
});
formatter.result({
  "duration": 31336507,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "New Package creation",
  "description": "",
  "id": "test-for-creating-opportunity;new-package-creation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@NewPackageCreation"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Fill the details in NEW PACKAGE CREATION form",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Click on Select Package Template under Form Package",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Enter Template Name and click search button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Select template from search result table",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Click Save button and Click on publish button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Verify that User is on PACKAGE PUBLICATION VERIFICATION page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Validte Opportunity Number, Title, CFDA Number, CFDA Title, Competition ID, Competition Title",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Validate Electronic Required, Expected Number of Applications, Application Size, Open Date, Close Date",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Validate Grace Period, Agency Contact, Application Instructions, Available to",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Again Click on publish button to confirm",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Verify That User is on PACKAGE PUBLICATION SUCCESS page able to publish package successfully with the message",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Click on Continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Verify that User is on MANAGE OPPORTUNITY page and validate opportunity number",
  "keyword": "And "
});
formatter.match({
  "location": "CreateOpportunity.fill_the_details_in_NEW_PACKAGE_CREATION_form()"
});
formatter.result({
  "duration": 960193574,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.click_on_Select_Package_Template_under_Form_Package()"
});
formatter.result({
  "duration": 21333,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.enter_Template_Name_and_click_search_button()"
});
formatter.result({
  "duration": 13221,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.select_template_from_search_result_table()"
});
formatter.result({
  "duration": 85934,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.click_Save_button_and_Click_on_publish_button()"
});
formatter.result({
  "duration": 22835,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.verify_that_User_is_on_PACKAGE_PUBLICATION_VERIFICATION_page()"
});
formatter.result({
  "duration": 11117,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.validte_Opportunity_Number_Title_CFDA_Number_CFDA_Title_Competition_ID_Competition_Title()"
});
formatter.result({
  "duration": 13221,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.validate_Electronic_Required_Expected_Number_of_Applications_Application_Size_Open_Date_Close_Date()"
});
formatter.result({
  "duration": 9315,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.validate_Grace_Period_Agency_Contact_Application_Instructions_Available_to()"
});
formatter.result({
  "duration": 9615,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.again_Click_on_publish_button_to_confirm()"
});
formatter.result({
  "duration": 13821,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.verify_That_User_is_on_PACKAGE_PUBLICATION_SUCCESS_page_able_to_publish_package_successfully_with_the_message()"
});
formatter.result({
  "duration": 11117,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.click_on_Continue_button()"
});
formatter.result({
  "duration": 10216,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.verify_that_User_is_on_MANAGE_OPPORTUNITY_page_and_validate_opportunity_number()"
});
formatter.result({
  "duration": 9315,
  "status": "passed"
});
});