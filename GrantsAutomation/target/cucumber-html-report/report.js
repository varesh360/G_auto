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
  "duration": 11797794618,
  "status": "passed"
});
formatter.match({
  "location": "CreateTemplate.click_on_login_link_button_and_then_click_on_grantor_account()"
});
formatter.result({
  "duration": 5929172259,
  "status": "passed"
});
formatter.match({
  "location": "CreateTemplate.enter_valid_username_and_valid_password_and_Click_on_login_button()"
});
formatter.result({
  "duration": 1636708711,
  "status": "passed"
});
formatter.match({
  "location": "CreateTemplate.verify_that_user_Loged_In_successfully_and_should_be_on_on_Grantor_section()"
});
formatter.result({
  "duration": 175455834,
  "status": "passed"
});
formatter.match({
  "location": "CreateTemplate.hover_on_Grantor_tab_and_Validate_Manage_Application_Template_link()"
});
formatter.result({
  "duration": 166761765,
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
  "duration": 1386776543,
  "status": "passed"
});
formatter.match({
  "location": "CreateTemplate.verify_that_user_is_on_MANAGE_APPLICATION_PACKAGE_TEMPLATES_page()"
});
formatter.result({
  "duration": 30585035,
  "status": "passed"
});
formatter.match({
  "location": "CreateTemplate.click_Create_on_Create_New_Template_button()"
});
formatter.result({
  "duration": 14857588,
  "error_message": "java.lang.AssertionError: Element Locator ://button[@id\u003d\u0027form:cmCreate\u0027] Not found expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:93)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:512)\r\n\tat org.testng.Assert.assertTrue(Assert.java:41)\r\n\tat com.grants.util.DriverTestCase.clickOn(DriverTestCase.java:275)\r\n\tat com.grants.pagehelper.LoginHelper.Clickon_CreateNewTemplateButton(LoginHelper.java:76)\r\n\tat com.grants.stepDefination.CreateTemplate.click_Create_on_Create_New_Template_button(CreateTemplate.java:67)\r\n\tat ✽.When Click Create on Create New Template button.(CreateTemplate.feature:19)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CreateTemplate.select_Form_Family_and_Click_Next_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateTemplate.click_on_Add_Modify_template_form_then_Select_optional_forms_and_Click_on_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateTemplate.enter_Template_name_and_Click_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateTemplate.verify_that_User_is_able_to_create_and_appears_in_Application_package_template_result_table()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateTemplate.verify_that_Template_name_is_same_as_it_was_entered_in_the_template_name_text_field()"
});
formatter.result({
  "status": "skipped"
});
});