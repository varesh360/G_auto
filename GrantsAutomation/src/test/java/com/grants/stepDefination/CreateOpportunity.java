package com.grants.stepDefination;

import com.grants.pagehelper.CreateOpportunityHelper;
import com.grants.pagehelper.LoginHelper;
import com.grants.util.DriverTestCase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateOpportunity extends DriverTestCase {
	
	CreateOpportunityHelper createOpportunityHelper=new CreateOpportunityHelper();
	LoginHelper loginHelper= new LoginHelper();
	
	@Given("^Login and Navigate to Grantors Tab$")
	public void Login_and_navigate_to_Grantors_Tab() throws Throwable {
		initateBrowserAndOpenApplication();
		loginHelper.loginAndValidate(username, password);
		createOpportunityHelper.navigateToGrantsTabAndVerifyCreateOpportunityLink();
	}

	@Given("^Hover Grantors tab and Click on Manage Opportunities link under Grants Opportunities section$")
	public void hover_Grantors_tab_and_Click_on_Manage_Opportunities_link_under_Grants_Opportunities_section() throws Throwable {
	   
	}

	@Then("^Verify that User is on MANAGE OPPORTUNITIES page$")
	public void verify_that_User_is_on_MANAGE_OPPORTUNITIES_page() throws Throwable {
	   
	}

	@Then("^Click Create on Create New Opportunity button$")
	public void click_Create_on_Create_New_Opportunity_button() throws Throwable {
	  
	}

	@Then("^Enter Opportunity Number Title Category Category Explanation CFDA Number\\(s\\)$")
	public void enter_Opportunity_Number_Title_Category_Category_Explanation_CFDA_Number_s() throws Throwable {
	   
	}

	@Then("^Select Opportunity Component as package and Click Next button\\.$")
	public void select_Opportunity_Component_as_package_and_Click_Next_button() throws Throwable {
	   
	}

	@Then("^Verify that User is on NEW PACKAGE CREATION page\\.$")
	public void verify_that_User_is_on_NEW_PACKAGE_CREATION_page() throws Throwable {
	    
	}

}
