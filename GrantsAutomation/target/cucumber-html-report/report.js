$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CreateTemplate.feature");
formatter.feature({
  "line": 1,
  "name": "Test Grants Smoke scenario",
  "description": "",
  "id": "test-grants-smoke-scenario",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "test-grants-smoke-scenario;test-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@LoginAndVerifyMenues"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open browser and load application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on login link button and then click on grantor account",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "enter valid username and valid password and Click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify that user Loged-In successfully and should be on on Grantor section.",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Hover on Grantor tab and Validate Manage Application Template link",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateTemplate.Open_Browser_and_start_application()"
});
formatter.result({
  "duration": 66953020681,
  "status": "passed"
});
formatter.match({
  "location": "CreateTemplate.click_on_login_link_button_and_then_click_on_grantor_account()"
});
formatter.result({
  "duration": 6849327129,
  "status": "passed"
});
formatter.match({
  "location": "CreateTemplate.enter_valid_username_and_valid_password_and_Click_on_login_button()"
});
formatter.result({
  "duration": 1941665034,
  "status": "passed"
});
formatter.match({
  "location": "CreateTemplate.verify_that_user_Loged_In_successfully_and_should_be_on_on_Grantor_section()"
});
formatter.result({
  "duration": 75787441,
  "status": "passed"
});
formatter.match({
  "location": "CreateTemplate.hover_on_Grantor_tab_and_Validate_Manage_Application_Template_link()"
});
formatter.result({
  "duration": 2097631578,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "To create the application template",
  "description": "",
  "id": "test-grants-smoke-scenario;to-create-the-application-template",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@CreateTemplate"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 14,
      "value": "# Navigate to Grantors Tab"
    },
    {
      "line": 15,
      "value": "# Hover Grantors tab"
    },
    {
      "line": 16,
      "value": "# Go to \"Grants Templates\""
    }
  ],
  "line": 17,
  "name": "Click on Manage Application Package Template link",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Verify that user is on MANAGE APPLICATION PACKAGE TEMPLATES page.",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Click Create on Create New Template button.",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Select Form Family and Click Next Button.",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Click on Add/Modify template form then Select optional forms and Click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Enter Template name and Click Save button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Verify that User is able to create and appears in Application package template result table",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Verify that Template name is same as it was entered in the template name text field",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateTemplate.click_on_Manage_Application_Package_Template_link()"
});
formatter.result({
  "duration": 6411488874,
  "status": "passed"
});
formatter.match({
  "location": "CreateTemplate.verify_that_user_is_on_MANAGE_APPLICATION_PACKAGE_TEMPLATES_page()"
});
formatter.result({
  "duration": 30003690,
  "status": "passed"
});
formatter.match({
  "location": "CreateTemplate.click_Create_on_Create_New_Template_button()"
});
formatter.result({
  "duration": 5442576057,
  "status": "passed"
});
formatter.match({
  "location": "CreateTemplate.select_Form_Family_and_Click_Next_Button()"
});
formatter.result({
  "duration": 6109907263,
  "status": "passed"
});
formatter.match({
  "location": "CreateTemplate.click_on_Add_Modify_template_form_then_Select_optional_forms_and_Click_on_Save_button()"
});
formatter.result({
  "duration": 2340770957,
  "status": "passed"
});
formatter.match({
  "location": "CreateTemplate.enter_Template_name_and_Click_Save_button()"
});
formatter.result({
  "duration": 53875162704,
  "status": "passed"
});
formatter.match({
  "location": "CreateTemplate.verify_that_User_is_able_to_create_and_appears_in_Application_package_template_result_table()"
});
formatter.result({
  "duration": 37140443,
  "status": "passed"
});
formatter.match({
  "location": "CreateTemplate.verify_that_Template_name_is_same_as_it_was_entered_in_the_template_name_text_field()"
});
formatter.result({
  "duration": 39460669,
  "status": "passed"
});
formatter.uri("Createopportunity.feature");
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
  "duration": 4081895386,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.hover_Grantors_tab_and_Click_on_Manage_Opportunities_link_under_Grants_Opportunities_section()"
});
formatter.result({
  "duration": 2267448268,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.verify_that_User_is_on_MANAGE_OPPORTUNITIES_page()"
});
formatter.result({
  "duration": 64549879,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.click_Create_on_Create_New_Opportunity_button()"
});
formatter.result({
  "duration": 2683055079,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.enter_Opportunity_Number_Title_Category_Category_Explanation_CFDA_Number_s()"
});
formatter.result({
  "duration": 2589045060,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.select_Opportunity_Component_as_package_and_Click_Next_button()"
});
formatter.result({
  "duration": 2038814960,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.verify_that_User_is_on_NEW_PACKAGE_CREATION_page()"
});
formatter.result({
  "duration": 15331761,
  "status": "passed"
});
});