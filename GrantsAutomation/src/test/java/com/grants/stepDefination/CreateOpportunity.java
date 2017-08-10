package com.grants.stepDefination;


import com.grants.pagehelper.CreateOpportunityHelper;
import com.grants.pagehelper.LoginHelper;
import com.grants.util.DriverTestCase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateOpportunity extends DriverTestCase {

	CreateOpportunityHelper createOpportunityHelper = new CreateOpportunityHelper();
	LoginHelper loginHelper = new LoginHelper();

	@Given("^Login and Navigate to Grantors Tab$")
	public void Login_and_navigate_to_Grantors_Tab() throws Throwable {
		//initateBrowserAndOpenApplication();
		//loginHelper.loginAndValidate(username, password);
		createOpportunityHelper.navigateToGrantsTabAndVerifyCreateOpportunityLink();
	}

	@Given("^Hover Grantors tab and Click on Manage Opportunities link under Grants Opportunities section$")
	public void hover_Grantors_tab_and_Click_on_Manage_Opportunities_link_under_Grants_Opportunities_section()
			throws Throwable {

		createOpportunityHelper.clickOnManageOpportunitiesLink();
	}

	@Then("^Verify that User is on MANAGE OPPORTUNITIES page$")
	public void verify_that_User_is_on_MANAGE_OPPORTUNITIES_page() throws Throwable {

		createOpportunityHelper.validateManageOpportunitiesPage();
	}

	@Then("^Click Create on Create New Opportunity button$")
	public void click_Create_on_Create_New_Opportunity_button() throws Throwable {

		createOpportunityHelper.clickOnCreateNewOpportunityButton();
	}

	@Then("^Enter Opportunity Number Title Category Category Explanation CFDA Number\\(s\\)$")
	public void enter_Opportunity_Number_Title_Category_Category_Explanation_CFDA_Number_s() throws Throwable {
		
		createOpportunityHelper.enterOpportunityNumberTitleCategoryCategoryExplanationCFDANumber();
	}

	@Then("^Select Opportunity Component as package and Click Next button\\.$")
	public void select_Opportunity_Component_as_package_and_Click_Next_button() throws Throwable {

		createOpportunityHelper.selectOpportunityComponent();
	}

	@Then("^Verify that User is on NEW PACKAGE CREATION page\\.$")
	public void verify_that_User_is_on_NEW_PACKAGE_CREATION_page() throws Throwable {

		createOpportunityHelper.validateNewPackageCreationPage();
	}
	
	@Given("^Fill the details in NEW PACKAGE CREATION form$")
	public void fill_the_details_in_NEW_PACKAGE_CREATION_form() throws Throwable {
		createOpportunityHelper.fillNewPackageCreationForm();
	}

	@Then("^Click on Select Package Template under Form Package$")
	public void click_on_Select_Package_Template_under_Form_Package() throws Throwable {
		
		createOpportunityHelper.clickOnSelectPackageTemplateButton();
	}

	@Then("^Enter Template Name and click search button$")
	public void enter_Template_Name_and_click_search_button() throws Throwable {
		
		createOpportunityHelper.enterTemplateNameAndSearch();
	}

	@Then("^Select template from search result table$")
	public void select_template_from_search_result_table() throws Throwable {
		
		createOpportunityHelper.selectTemplateFromSearchResultTable();
	}

	@Then("^Click Save button and Click on publish button$")
	public void click_Save_button_and_Click_on_publish_button() throws Throwable {
		
		createOpportunityHelper.clickSaveAndPublishButton();
	}

	@Then("^Verify that User is on PACKAGE PUBLICATION VERIFICATION page$")
	public void verify_that_User_is_on_PACKAGE_PUBLICATION_VERIFICATION_page() throws Throwable {
		
		createOpportunityHelper.validatePackagePublicationVerificationPage();
	}

	@Then("^Validte Opportunity Number, Title, CFDA Number, CFDA Title, Competition ID, Competition Title$")
	public void validte_Opportunity_Number_Title_CFDA_Number_CFDA_Title_Competition_ID_Competition_Title() throws Throwable {
		
		createOpportunityHelper.validteOpportunityNumberTitleCFDANumberCFDATitleCompetitionIDCompetitionTitle();
	}

	@Then("^Validate Electronic Required, Expected Number of Applications, Application Size, Open Date, Close Date$")
	public void validate_Electronic_Required_Expected_Number_of_Applications_Application_Size_Open_Date_Close_Date() throws Throwable {
	  
		createOpportunityHelper.validateElectronicRequiredExpectedNumberofApplicationsApplicationSizeOpenDateCloseDate();
	}

	@Then("^Validate Grace Period, Agency Contact, Application Instructions, Available to$")
	public void validate_Grace_Period_Agency_Contact_Application_Instructions_Available_to() throws Throwable {
	    
		createOpportunityHelper.validateGracePeriodAgencyContactApplicationInstructionsAvailableto();
	}

	@Then("^Again Click on publish button to confirm$")
	public void again_Click_on_publish_button_to_confirm() throws Throwable {
		
		createOpportunityHelper.clickonpublishbuttontoconfirm();
	}

	@Then("^Verify That User is on PACKAGE PUBLICATION SUCCESS page able to publish package successfully with the message$")
	public void verify_That_User_is_on_PACKAGE_PUBLICATION_SUCCESS_page_able_to_publish_package_successfully_with_the_message() throws Throwable {
		
		createOpportunityHelper.verifyThatUserisonPACKAGEPUBLICATIONSUCCESSpageabletopublishpackagesuccessfullywiththemessage();
	}

	@Then("^Click on Continue button$")
	public void click_on_Continue_button() throws Throwable {
	    
		createOpportunityHelper.clickOnContinueButton();
	}

	@Then("^Verify that User is on MANAGE OPPORTUNITY page and validate opportunity number$")
	public void verify_that_User_is_on_MANAGE_OPPORTUNITY_page_and_validate_opportunity_number() throws Throwable {
	    
		createOpportunityHelper.validateManageOpportunityPageandValidateOpportunityNumber();
	}

}
