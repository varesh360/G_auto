package com.grants.pagehelper;

import java.util.Random;

import org.junit.Assert;
import org.python.modules.thread.thread;

import com.grants.locator.CreateTemplateLocators;
import com.grants.locator.LoginLocators;
import com.grants.stepDefination.CreateTemplate;
import com.grants.util.DriverTestCase;

public class CreateTemplateHelper extends DriverTestCase {

/*	// To click on login link button
	public void clickOnLoginLink() throws InterruptedException {

		WaitForElementPresent(LoginLocators.LoginLink, 20);
		clickOn(LoginLocators.LoginLink);
	}

	public void clickonAccountType() throws InterruptedException {

		WaitForElementPresent(LoginLocators.GrantorAccount, 20);
		// getWebDriver().findElement(By.xpath(LoginLocators.GrantorAccount)).click();
		clickOn(LoginLocators.GrantorAccount);
	}

	// To enter username and password
	public void enterUserNamePassword(String userName, String passWord) throws InterruptedException {

		WaitForElementPresent(LoginLocators.GrantorUserName, 20);
		sendKeys(LoginLocators.GrantorUserName, userName);
		sendKeys(LoginLocators.GrantorPassword, passWord);
	}

	// To click on the CreateTemplateLocators button
	public void clickOnLoginButton() throws InterruptedException {

		WaitForElementPresent(LoginLocators.GrantorLoginButon, 20);
		clickOn(LoginLocators.GrantorLoginButon);
	}

	// To verify user is successfully login
	public void verifyUserLoggedIn() throws InterruptedException {

		WaitForElementPresent(CreateTemplateLocators.welcomeUser, 20);
		String str = getText(CreateTemplateLocators.welcomeUser);
		Assert.assertTrue(str.contains("WELCOME"));

	}

	// To verify that user is logged-in using Grantor credentials
	public void verifyGrantorsTab() {
		Assert.assertTrue("User in not on Grantor tab", isElementPresent(CreateTemplateLocators.GrantorTab));
	}*/

	
	// To mouseover on Applicantes tab and verify it sub menues
	public void hoverOnGrantorTabValidateManageApplicationTemplateLink() throws InterruptedException {

		WaitForElementPresent(CreateTemplateLocators.GrantorTab, 20);
		mouseOver(CreateTemplateLocators.GrantorTab);
		WaitForElementPresent(CreateTemplateLocators.ManageApplicationPackageTemplate, 20);
		Assert.assertTrue("Manage Application Template Link is not present ",
				isElementPresent(CreateTemplateLocators.ManageApplicationPackageTemplate));
	}

	public void clickOnManageApplicationPackageTemplateLink() throws InterruptedException {

		WaitForElementPresent(CreateTemplateLocators.ManageApplicationPackageTemplate, 20);
		Thread.sleep(3000);
		clickOn(CreateTemplateLocators.ManageApplicationPackageTemplate);
	}

	public void verifyManageApplicationPackageTemplatePage() {

		WaitForElementPresent(CreateTemplateLocators.HeadingManageApplicationPackageTemplatePage, 20);
		Assert.assertTrue("User in not on Manage Application Package Template Page",
				isElementPresent(CreateTemplateLocators.HeadingManageApplicationPackageTemplatePage));
	}

	public void clickOnCreateNewTemplateButton() {
		WaitForElementPresent(CreateTemplateLocators.CreateNewTemplateButton, 20);
		clickOn(CreateTemplateLocators.CreateNewTemplateButton);
	}

	public void selectFormFamilyAndClickOnNextBtn() {
		WaitForElementPresent(CreateTemplateLocators.RRFormFamily, 20);
		clickOn(CreateTemplateLocators.RRFormFamily);
		WaitForElementEnabled(CreateTemplateLocators.CreateApplicationPackageTemplate_NextButton, 20);
		clickOn(CreateTemplateLocators.CreateApplicationPackageTemplate_NextButton);

	}
	
	public void clickOnAddModifyTemplateFormButtonAndSelectOptionalFormSave() throws InterruptedException
	{
		WaitForElementPresent(CreateTemplateLocators.AddModifyTemplateForm_Button, 20);
		clickOn(CreateTemplateLocators.AddModifyTemplateForm_Button);
		
		Thread.sleep(3000);
		WaitForElementPresent(CreateTemplateLocators.AFRIProjectTypr_RadioButton, 20);
		clickOn(CreateTemplateLocators.AFRIProjectTypr_RadioButton);
		
		WaitForElementPresent(CreateTemplateLocators.SelectForm_SaveButton, 20);
		clickOn(CreateTemplateLocators.SelectForm_SaveButton);
	}
	
	// To verify selected forms in the selected forms table
	public void validateSelectedformsInTable() throws InterruptedException
	{
		//WaitForElementPresent(CreateTemplateLocators.AgenCyOwnerCode, 20);
		//waitForPageload(8);
		Thread.sleep(7000);
		Assert.assertTrue("AgenCy Owner Code  is not present in select form table",
				isElementPresent(CreateTemplateLocators.AgenCyOwnerCode));
		Assert.assertTrue("Selected forms not present in select form table",
				isElementPresent(CreateTemplateLocators.FormName));
		Assert.assertTrue("ActiveGGVersion is not present in select form table",
				isElementPresent(CreateTemplateLocators.ActiveGGVersion));
	}
	
	public void validateCreatedTemplate()
	{
		
	}
	
	public void enterTemplateNameClickSave() throws InterruptedException
	{
		
		int numberRand=getRandomNumber();	
		System.out.println(numberRand);
		String TemplateName=TName+numberRand;
		System.out.println(TemplateName);
		WaitForElementPresent(CreateTemplateLocators.TemplateName_TextBox, 20);
		waitForElementLoad(3);
		sendKeys(CreateTemplateLocators.TemplateName_TextBox, TemplateName);
		//waitForElementLoad(5);
		WaitForElementEnabled(CreateTemplateLocators.CreateApplicationPackageTemplate_SaveButton, 20);
		clickOn(CreateTemplateLocators.CreateApplicationPackageTemplate_SaveButton);
	}
	
	
}
