package com.grants.pagehelper;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import com.grants.locator.CreateTemplateLocators;
import com.grants.util.DriverTestCase;

public class CreateTemplateHelper extends DriverTestCase {
	
	// To mouseover on Applicantes tab and verify it sub menues
	public void hoverOnGrantorTabValidateManageApplicationTemplateLink() throws InterruptedException {

		WaitForElementPresent(CreateTemplateLocators.GrantorTab, 20);
		waitForElementLoad(2);
		mouseOver(CreateTemplateLocators.GrantorTab);
		Assert.assertTrue("Manage Application Template Link is not present ",isElementPresent(CreateTemplateLocators.ManageApplicationPackageTemplate));
	}

	// To click on manage application package template link
	public void clickOnManageApplicationPackageTemplateLink() throws InterruptedException {

		waitForElementLoad(2);
		WaitForElementVisible(CreateTemplateLocators.ManageApplicationPackageTemplate, 20);
		clickOn(CreateTemplateLocators.ManageApplicationPackageTemplate);
		Thread.sleep(3000);
	}

	// To validate manage application package template page
	public void verifyManageApplicationPackageTemplatePage() {

		//WaitForElementPresent(CreateTemplateLocators.HeadingManageApplicationPackageTemplatePage, 20);
		Assert.assertTrue("User in not on Manage Application Package Template Page",isElementPresent(CreateTemplateLocators.HeadingManageApplicationPackageTemplatePage));
	}

	// To clcik on cretae new template button
	public void clickOnCreateNewTemplateButton() {
		waitForElementLoad(2);
		WaitForElementVisible(CreateTemplateLocators.CreateNewTemplateButton, 20);
		clickOn(CreateTemplateLocators.CreateNewTemplateButton);
		waitForElementLoad(2);
	}

	// To select form family and click on next button
	public void selectFormFamilyAndClickOnNextBtn() {
		WaitForElementPresent(CreateTemplateLocators.RRFormFamily, 20);
		clickOn(CreateTemplateLocators.RRFormFamily);
		waitForElementLoad(2);
		WaitForElementEnabled(CreateTemplateLocators.CreateApplicationPackageTemplate_NextButton, 20);
		clickOn(CreateTemplateLocators.CreateApplicationPackageTemplate_NextButton);

	}
	
	// To click on add/modify template form button, selection form and then save
	public void clickOnAddModifyTemplateFormButtonAndSelectOptionalFormSave() throws InterruptedException
	{
		WaitForElementVisible(CreateTemplateLocators.AddModifyTemplateForm_Button, 20);
		clickOn(CreateTemplateLocators.AddModifyTemplateForm_Button);
		waitForElementLoad(2);
		WaitForElementVisible(CreateTemplateLocators.AFRIProjectTypr_RadioButton, 20);
		clickOn(CreateTemplateLocators.AFRIProjectTypr_RadioButton);
		WaitForElementPresent(CreateTemplateLocators.SelectForm_SaveButton, 20);
		clickOn(CreateTemplateLocators.SelectForm_SaveButton);
	}
	
	// To verify selected forms in the selected forms table
	public void validateSelectedformsInTable() throws InterruptedException
	{
		WaitForElementVisible(CreateTemplateLocators.AddModifyTemplateForm_Button, 20);
		Thread.sleep(7000);
		Assert.assertTrue("AgenCy Owner Code  is not present in select form table",isElementPresent(CreateTemplateLocators.AgenCyOwnerCode));
		Assert.assertTrue("Selected forms not present in select form table",isElementPresent(CreateTemplateLocators.FormName));
		Assert.assertTrue("ActiveGGVersion is not present in select form table",isElementPresent(CreateTemplateLocators.ActiveGGVersion));
	}
	
	// To enter template name in textbox and click on save button.
	public void enterTemplateNameClickSave() throws InterruptedException
	{
		
		int numberRand=getRandomNumber();	
		String TemplateName=TName+numberRand;
		propertyReader.writeProperty("TEMPLATENAME", TemplateName);
		WaitForElementPresent(CreateTemplateLocators.TemplateName_TextBox, 20);
		sendKeys(CreateTemplateLocators.TemplateName_TextBox, TemplateName);
		waitForElementLoad(3);
		clickOn(CreateTemplateLocators.CreateApplicationPackageTemplate_SaveButton);
		WaitForElementVisible("//div[contains(text(),'SAVING...']", 40);
		//waitForElementLoad(28);
	}
	
	// to validate created template in the result table
	public void validateCreatedTemplate()
	{
		String templateName=propertyReader.readProperty("TEMPLATENAME");
		try {
			
			WaitForElementPresent("//td[contains(.,'"+templateName+"')]", 40);
			isElementPresent("//td[contains(.,'"+templateName+"')]");
		}
		catch(Exception e)
		{
			clickOn(CreateTemplateLocators.CreateApplicationPackageTemplate_SaveButton);
			WaitForElementPresent("//div[contains(text(),'SAVING...']", 40);
			Assert.assertTrue("Template is not peresent in the table",isElementPresent("//td[contains(.,'"+templateName+"')]"));
		}
			
	}
	
	//to validate name of template in result table
	public void verifyCreatedTemplateName()
	{
		String actualTemplateName=propertyReader.readProperty("TEMPLATENAME");
		String expectedTemplateName=getText("//td[contains(.,'"+actualTemplateName+"')]");
		assertEquals(actualTemplateName, expectedTemplateName);
	}
}
