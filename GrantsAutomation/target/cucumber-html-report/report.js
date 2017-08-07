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
  "duration": 30217007684,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.hover_Grantors_tab_and_Click_on_Manage_Opportunities_link_under_Grants_Opportunities_section()"
});
formatter.result({
  "duration": 30046,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.verify_that_User_is_on_MANAGE_OPPORTUNITIES_page()"
});
formatter.result({
  "duration": 31248,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.click_Create_on_Create_New_Opportunity_button()"
});
formatter.result({
  "duration": 33652,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.enter_Opportunity_Number_Title_Category_Category_Explanation_CFDA_Number_s()"
});
formatter.result({
  "duration": 22835,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.select_Opportunity_Component_as_package_and_Click_Next_button()"
});
formatter.result({
  "duration": 19230,
  "status": "passed"
});
formatter.match({
  "location": "CreateOpportunity.verify_that_User_is_on_NEW_PACKAGE_CREATION_page()"
});
formatter.result({
  "duration": 16827,
  "status": "passed"
});
});