package com.grants.pagehelper;

import org.junit.Assert;
import org.python.modules.thread.thread;

import com.grants.locator.CreateOpportunityLocators;
import com.grants.locator.CreateTemplateLocators;
import com.grants.util.DriverTestCase;

public class CreateOpportunityHelper extends DriverTestCase {

	// To navigate grantor tab and verify existence of Manage opportunity link
	public void navigateToGrantsTabAndVerifyCreateOpportunityLink() throws InterruptedException {
		WaitForElementPresent(CreateTemplateLocators.GrantorTab, 20);
		mouseOver(CreateTemplateLocators.GrantorTab);
		waitForElementLoad(7);
		Assert.assertTrue("Manage Opportunities Link is not present ",
				isElementPresent(CreateOpportunityLocators.ManageOpportunitiesLink));
	}

	// To click on Manage opportunity link
	public void clickOnManageOpportunitiesLink() {
		WaitForElementPresent(CreateOpportunityLocators.ManageOpportunitiesLink, 20);
		clickOn(CreateOpportunityLocators.ManageOpportunitiesLink);
	}

	// To click on Manage opportunity link
	public void validateManageOpportunitiesPage() {
		WaitForElementPresent(CreateOpportunityLocators.HeadingManageOpportunities, 20);
		Assert.assertTrue("Manage Opportunities page does not exist ",
				isElementPresent(CreateOpportunityLocators.HeadingManageOpportunities));
	}
	
	// To click on Create New opportunity button
		public void clickOnCreateNewOpportunityButton() {
			WaitForElementPresent(CreateOpportunityLocators.CreateNewOpportunity_Button, 20);
			clickOn(CreateOpportunityLocators.CreateNewOpportunity_Button);
		}

		//To enter the detail for creating new opportunity
		public void enterOpportunityNumberTitleCategoryCategoryExplanationCFDANumber() throws InterruptedException
		{
			WaitForElementPresent(CreateOpportunityLocators.HeadingCreateOpportunity_Page, 20);
			Assert.assertTrue("Create Opportunities page does not exist ",
					isElementPresent(CreateOpportunityLocators.HeadingCreateOpportunity_Page));
			int numberRand=getRandomNumber();	
			String OpportunityNumber=OppNumber+numberRand;
			String OpportunityTitle=OpportunityNumber;
			propertyHelper.writeProperty("OPPORTUNITYNUMBER", OpportunityNumber);
			WaitForElementPresent(CreateOpportunityLocators.DetailsOpportunityNumber, 20);
			waitForElementLoad(3);
			sendKeys(CreateOpportunityLocators.DetailsOpportunityNumber, OpportunityNumber);
			sendKeys(CreateOpportunityLocators.DetailsOpportunityTitle, OpportunityTitle);
			selectDropDown(CreateOpportunityLocators.DetailsOpportunityCategory, "Continuation");
			sendKeys(CreateOpportunityLocators.DetailsCFDANumber, "10.001");
		}
		
		// To select opportunity component
		public void selectOpportunityComponent()
		{
			WaitForElementPresent(CreateOpportunityLocators.OpportunityComponent_Package, 20);
			clickOn(CreateOpportunityLocators.OpportunityComponent_Package);
			clickOn(CreateOpportunityLocators.CreateOpportunity_NextButton);
		}
		
		//To verify new package creation page exist
		public void validateNewPackageCreationPage()
		{
			WaitForElementPresent(CreateOpportunityLocators.HeadingNewPackageCreation_Page, 20);
			Assert.assertTrue("Create Opportunities page does not exist ",
					isElementPresent(CreateOpportunityLocators.HeadingNewPackageCreation_Page));
		}
		
		// To fill the detail in new package creation form
		public void fillNewPackageCreationForm()
		{
			waitForPageload(5);
			selectDropDown(CreateOpportunityLocators.NewPackageCreation_CFDA, "10.001");
			sendKeys(CreateOpportunityLocators.NewPackageCreation_CompetitionID, "Test1");
			sendKeys(CreateOpportunityLocators.NewPackageCreation_CompetitionTitle, "Test2");
			clickOn(CreateOpportunityLocators.NewPackageCreation_ElectronicRrequired);
			sendKeys(CreateOpportunityLocators.NewPackageCreation_NoOFApplications, "2");
			sendKeys(CreateOpportunityLocators.NewPackageCreation_ExpectedAppSize, "100");
			sendKeys(CreateOpportunityLocators.NewPackageCreation_OpenDate, "08/30/2017");
			sendKeys(CreateOpportunityLocators.NewPackageCreation_CloseDate, "08/30/2018");
			sendKeys(CreateOpportunityLocators.NewPackageCreation_GracePeriod, "10");
			browseAfile(CreateOpportunityLocators.NewPackageCreation_AppInstructions, "C:\\Users\\rajneeshk\\Downloads\\SF3881-V1.0_DAT");
			selectDropDown(CreateOpportunityLocators.NewPackageCreation_ApplicantType, "Both, Organizations and Individuals");
		}
}
