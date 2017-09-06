package com.grants.pagehelper;

import java.awt.AWTException;

import org.junit.Assert;
import com.grants.locator.CreateOpportunityLocators;
import com.grants.locator.CreateTemplateLocators;
import com.grants.util.DriverTestCase;

public class CreateOpportunityHelper extends DriverTestCase {
	
	// To navigate grantor tab and verify existence of Manage opportunity link
	public void navigateToGrantsTabAndVerifyCreateOpportunityLink() throws InterruptedException {
		WaitForElementPresent(CreateTemplateLocators.GrantorTab, 20);
		mouseOver(CreateTemplateLocators.GrantorTab);
		waitForElementLoad(4);
		Assert.assertTrue("Manage Opportunities Link is not present ",isElementPresent(CreateOpportunityLocators.ManageOpportunitiesLink));
	}

	// To click on Manage opportunity link
	public void clickOnManageOpportunitiesLink() {
		clickOn(CreateOpportunityLocators.ManageOpportunitiesLink);
	}

	// To Validate opportunity page
	public void validateManageOpportunitiesPage() {
		WaitForElementVisible(CreateOpportunityLocators.HeadingManageOpportunities, 20);
		Assert.assertTrue("Manage Opportunities page does not exist ",isElementPresent(CreateOpportunityLocators.HeadingManageOpportunities));
	}
	
	// To click on Create New opportunity button
		public void clickOnCreateNewOpportunityButton() {
			WaitForElementVisible(CreateOpportunityLocators.CreateNewOpportunity_Button, 20);
			clickOn(CreateOpportunityLocators.CreateNewOpportunity_Button);
		}

		//To enter the detail for creating new opportunity
		public void enterOpportunityNumberTitleCategoryCategoryExplanationCFDANumber() throws InterruptedException
		{
			WaitForElementVisible(CreateOpportunityLocators.HeadingCreateOpportunity_Page, 20);
			Assert.assertTrue("Create Opportunities page does not exist ",isElementPresent(CreateOpportunityLocators.HeadingCreateOpportunity_Page));
			int numberRand=getRandomNumber();	
			String OpportunityNumber=OppNumber+numberRand;
			String OpportunityTitle=OpportunityNumber;
			propertyReader.writeProperty("OPPORTUNITYNUMBER", OpportunityNumber);
			WaitForElementPresent(CreateOpportunityLocators.DetailsOpportunityNumber, 20);
			waitForElementLoad(2);
			sendKeys(CreateOpportunityLocators.DetailsOpportunityNumber, OpportunityNumber);
			sendKeys(CreateOpportunityLocators.DetailsOpportunityTitle, OpportunityTitle);
			selectDropDown(CreateOpportunityLocators.DetailsOpportunityCategory, "Continuation");
			sendKeys(CreateOpportunityLocators.DetailsCFDANumber, OppCFDANumber);
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
		public void fillNewPackageCreationForm() throws AWTException, InterruptedException
		{
			waitForPageload(5);	
			selectDropDown(CreateOpportunityLocators.NewPackageCreation_CFDA, CFDA);
			sendKeys(CreateOpportunityLocators.NewPackageCreation_CompetitionID, CompetitionID);
			sendKeys(CreateOpportunityLocators.NewPackageCreation_CompetitionTitle, CompetitionTitle);
			clickOn("//input[@value='"+ElectronicRequired+"']");
			sendKeys(CreateOpportunityLocators.NewPackageCreation_NoOFApplications, NoOFApplications);
			sendKeys(CreateOpportunityLocators.NewPackageCreation_ExpectedAppSize, ExpectedAppSize);
			sendKeys(CreateOpportunityLocators.NewPackageCreation_OpenDate, OpenDate);
			sendKeys(CreateOpportunityLocators.NewPackageCreation_CloseDate, CloseDate);
			sendKeys(CreateOpportunityLocators.NewPackageCreation_GracePeriod, GracePeriod);
			clickOn(CreateOpportunityLocators.NewPackageCreation_UploadButton);
			browseAfile(AppInstructionsFilePath);
			selectDropDown(CreateOpportunityLocators.NewPackageCreation_ApplicantType, ApplicantType);

		}
		
		// To click on select package template
		public void clickOnSelectPackageTemplateButton()
		{
			WaitForElementPresent(CreateOpportunityLocators.SelectAPackageTemplate_Button, 20);
			clickOn(CreateOpportunityLocators.SelectAPackageTemplate_Button);
		}
		
		// To search the existing template
		public void enterTemplateNameAndSearch()
		{
			String TemplateName=propertyReader.readProperty("TEMPLATENAME");
			System.out.println(TemplateName);
			waitForElementLoad(3);
			WaitForElementPresent(CreateOpportunityLocators.TemplateName_SearchTextBox, 20);
			sendKeys(CreateOpportunityLocators.TemplateName_SearchTextBox, TemplateName);
			clickOn(CreateOpportunityLocators.TemplateName_SearchButton);
		}
		
		// To Select the searched template from the search result result table
		public void selectTemplateFromSearchResultTable()
		{
			
			waitForElementLoad(3);
			clickOn(CreateOpportunityLocators.SelectSearchedTemplate_RadioButton);
		}
		
		// To click select template save button and then Publish button
		public void clickSaveAndPublishButton()
		{
			WaitForElementVisible(CreateOpportunityLocators.PublishPackage_Button, 20);
			waitForElementLoad(3);
			clickOn(CreateOpportunityLocators.SaveTemplateSelection_Button);
			waitForElementLoad(3);
			clickOn(CreateOpportunityLocators.PublishPackage_Button);
		}
		
	    // To verify user is on PACKAGE_PUBLICATION_VERIFICATION_page
		public void validatePackagePublicationVerificationPage()
		{
			WaitForElementPresent(CreateOpportunityLocators.HeadingPackagePublicationVerification_Page, 20);
			Assert.assertTrue("Package Publiocation Verification page does not exist ",
					isElementPresent(CreateOpportunityLocators.HeadingPackagePublicationVerification_Page));
		}
		
		// To validate_Opportunity_Number_Title_CFDA_Number_CFDA_Title_Competition_ID_Competition_Title
		public void validteOpportunityNumberTitleCFDANumberCFDATitleCompetitionIDCompetitionTitle()
		{
			String OPPNUMBER=propertyReader.readProperty("OPPORTUNITYNUMBER");
			waitForElementLoad(4);
			Assert.assertTrue("Opportunity number did not match",
					isElementPresent("//span[contains(.,'"+OPPNUMBER+"')]"));
			Assert.assertTrue("Opportunity title did not match",
					isElementPresent("//span[contains(.,'"+OPPNUMBER+"')]"));
			Assert.assertTrue("CFDANumber did not match",
					isElementPresent("//span[contains(.,'"+OppCFDANumber+"')]"));
			if(CompetitionID.equalsIgnoreCase(getText(CreateOpportunityLocators.PackagePublicationVerificationPage_CompetitionID)))
			{
				System.out.println("Competition ID Match");
			}
			else {
				throw new AssertionError();
			}
			Assert.assertEquals("Assert Verification", CompetitionTitle, getText(CreateOpportunityLocators.PackagePublicationVerificationPage_CompetitionTitle));
			
		}
		
		// To validate_Electronic_Required_Expected_Number_of_Applications_Application_Size_Open_Date_Close_Date
		public void validateElectronicRequiredExpectedNumberofApplicationsApplicationSizeOpenDateCloseDate()
		{
			if( getText(CreateOpportunityLocators.PackagePublicationVerificationPage_ElectronicRrequired).contains(ElectronicRequired))
			{
				System.out.println("ElectronicRequired ID Match");
			}
			else {
				throw new AssertionError();
			}
			Assert.assertEquals("Assert Verification", NoOFApplications, getText(CreateOpportunityLocators.PackagePublicationVerificationPage_NoOFApplications));
			Assert.assertEquals("Assert Verification", ExpectedAppSize, getText(CreateOpportunityLocators.PackagePublicationVerificationPage_ExpectedAppSize));
			Assert.assertEquals("Assert Verification", OpenDate, getText(CreateOpportunityLocators.PackagePublicationVerificationPage_OpenDate));
			Assert.assertEquals("Assert Verification", CloseDate, getText(CreateOpportunityLocators.PackagePublicationVerificationPage_CloseDate));
		}
		
		// To Validate Grace_Period_Agency_Contact_Application_Instructions_Available_to
		public void validateGracePeriodAgencyContactApplicationInstructionsAvailableto()
		{
			if((getText(CreateOpportunityLocators.PackagePublicationVerificationPage_GracePeriod).contains(GracePeriod)))
			{
				System.out.println("Grace Period Match");
			}
			else {
				throw new AssertionError();
			}
			String s=ApplicantType.replaceAll("[\\-\\+\\.\\^:,]","");
			String ss=s.substring(0, s.length() - 1);
			if(getText(CreateOpportunityLocators.PackagePublicationVerificationPage_AvilableTo).contains(ss))
			{
				System.out.println("Avilable To Match");
			}
			
			else {
				
				throw new AssertionError();
			}
		}
		
		// To again_Click_on_publish_button_to_confirm()
		public void clickonpublishbuttontoconfirm()
		{
			WaitForElementPresent(CreateOpportunityLocators.PackagePublicationVerificationPage_ConfirmPublishButton, 20);
			clickOn(CreateOpportunityLocators.PackagePublicationVerificationPage_ConfirmPublishButton);
		}
		
		//To verify_That_User_is_on_PACKAGE_PUBLICATION_SUCCESS_page_able_to_publish_package_successfully_with_the_message
		public void verifyThatUserisonPACKAGEPUBLICATIONSUCCESSpageabletopublishpackagesuccessfullywiththemessage()
		{
			waitForElementLoad(3);
			Assert.assertTrue("Package Publication Success Page does not exist",isElementPresent(CreateOpportunityLocators.HeadingPackagePublicationSuccess_Page));
			Assert.assertTrue(isElementPresent("//span[contains(.,'Congratulations, your application package')]"));
			
		}
		
		// To click_on_Continue_button
		public void clickOnContinueButton()
		{
			WaitForElementPresent(CreateOpportunityLocators.PackagePublicationSuccess_ContinueButton, 20);
			clickOn(CreateOpportunityLocators.PackagePublicationSuccess_ContinueButton);
		}
		
		//To verify_that_User_is_on_MANAGE_OPPORTUNITY_page_and_validate_opportunity_number
		public void validateManageOpportunityPageandValidateOpportunityNumber()
		{
			waitForElementLoad(2);
			String oppNo= propertyReader.readProperty("OPPORTUNITYNUMBER");	
			Assert.assertTrue("Manage Opportunity Page does not exist",isElementPresent(CreateOpportunityLocators.HeadingManageOpportunity_Page));
			Assert.assertTrue("Your package is not successfully success",isElementPresent("//span[@id='form:opportunityInfo']//span[contains(.,'"+oppNo+"')]"));
			
		}
}
