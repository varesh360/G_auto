package com.grants.stepDefination;

import com.grants.pagehelper.CreateTemplateHelper;
import com.grants.pagehelper.LoginHelper;
import com.grants.util.DriverTestCase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateTemplate extends DriverTestCase {

	LoginHelper loginHelper = new LoginHelper();
	CreateTemplateHelper createTemplateHelper = new CreateTemplateHelper();

	@Given("^Open browser and load application$")
	public void Open_Browser_and_start_application() throws Throwable {

		// Open the application in given browser
		initateBrowserAndOpenApplication();
	}

	@Given("^Click on login link button and then click on grantor account$")
	public void click_on_login_link_button_and_then_click_on_grantor_account() throws InterruptedException {

		// Click on login link button and then account type
		loginHelper.clickOnLoginLink();
		loginHelper.clickonAccountType();
	}

	@When("^enter valid username and valid password and Click on login button$")
	public void enter_valid_username_and_valid_password_and_Click_on_login_button() throws Throwable {

		// To enter username and Password then click on CreateTemplateLocators button
		loginHelper.enterUserNamePassword(username, password);
		loginHelper.clickOnLoginButton();
	}

	@Then("^Verify that user Loged-In successfully and should be on on Grantor section\\.$")
	public void verify_that_user_Loged_In_successfully_and_should_be_on_on_Grantor_section() throws Throwable {

		// To verify user successfully logged in and is on grantor tab
		loginHelper.verifyUserLoggedIn();
		loginHelper.verifyGrantorsTab();
	}

	@Then("^Hover on Grantor tab and Validate Manage Application Template link$")
	public void hover_on_Grantor_tab_and_Validate_Manage_Application_Template_link() throws Throwable {

		// To hover and validate the link
		createTemplateHelper.hoverOnGrantorTabValidateManageApplicationTemplateLink();
	}

	@Given("^Click on Manage Application Package Template link$")
	public void click_on_Manage_Application_Package_Template_link() throws Throwable {

		// To click on manage application packge template
		createTemplateHelper.clickOnManageApplicationPackageTemplateLink();
	}

	@Given("^Verify that user is on MANAGE APPLICATION PACKAGE TEMPLATES page\\.$")
	public void verify_that_user_is_on_MANAGE_APPLICATION_PACKAGE_TEMPLATES_page() throws Throwable {
		createTemplateHelper.verifyManageApplicationPackageTemplatePage();
	}

	@When("^Click Create on Create New Template button\\.$")
	public void click_Create_on_Create_New_Template_button() throws Throwable {
		createTemplateHelper.clickOnCreateNewTemplateButton();
	}

	@When("^Select Form Family and Click Next Button\\.$")
	public void select_Form_Family_and_Click_Next_Button() throws Throwable {

		createTemplateHelper.selectFormFamilyAndClickOnNextBtn();
	}

	@When("^Click on Add/Modify template form then Select optional forms and Click on Save button$")
	public void click_on_Add_Modify_template_form_then_Select_optional_forms_and_Click_on_Save_button()
			throws Throwable {

		createTemplateHelper.clickOnAddModifyTemplateFormButtonAndSelectOptionalFormSave();
	}

	@When("^Enter Template name and Click Save button$")
	public void enter_Template_name_and_Click_Save_button() throws Throwable {
		
		createTemplateHelper.validateSelectedformsInTable();
		createTemplateHelper.enterTemplateNameClickSave();
	}

	@Then("^Verify that User is able to create and appears in Application package template result table$")
	public void verify_that_User_is_able_to_create_and_appears_in_Application_package_template_result_table()
			throws Throwable {
	}

	@Then("^Verify that Template name is same as it was entered in the template name text field$")
	public void verify_that_Template_name_is_same_as_it_was_entered_in_the_template_name_text_field() throws Throwable {

	}

}
