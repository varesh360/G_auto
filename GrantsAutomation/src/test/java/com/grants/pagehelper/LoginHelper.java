package com.grants.pagehelper;

import org.junit.Assert;
import com.grants.locator.LoginLocators;
import com.grants.util.DriverTestCase;

public class LoginHelper extends DriverTestCase {

	// To click on login link button
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

	// To click on the CreateTemplate button
	public void clickOnLoginButton() throws InterruptedException {

		WaitForElementPresent(LoginLocators.GrantorLoginButon, 20);
		clickOn(LoginLocators.GrantorLoginButon);
	}

	// To verify user is successfully login
	public void verifyUserLoggedIn() throws InterruptedException {

		WaitForElementPresent(LoginLocators.GrantorLoginButon, 20);
		String str = getText(LoginLocators.welcomeUser);
		Assert.assertTrue(str.contains("WELCOME"));

	}

	// To verify that user is logged-in using Grantor credentials
	public void verifyGrantorsTab() {
		Assert.assertTrue("User in not on Grantor tab", isElementPresent(LoginLocators.GrantorTab));
	}

	// To mouseover on Applicantes tab and verify it sub menues
	public void hoverOnGrantorTab_ValidateManageApplicationTemplateLink() throws InterruptedException {

		WaitForElementPresent(LoginLocators.GrantorTab, 20);
		mouseOver(LoginLocators.GrantorTab);
		Assert.assertTrue("Manage Application Template Link is not present ",
				isElementPresent(LoginLocators.ManageApplicationPackageTemplate));
	}

	public void ClickOn_ManageApplicationPackageTemplate() {

		WaitForElementPresent(LoginLocators.GrantorLoginButon, 20);
		clickOn(LoginLocators.ManageApplicationPackageTemplate);
	}

	public void verifyManageApplicationPackageTemplatePage() {
		
		WaitForElementPresent(LoginLocators.GrantorLoginButon, 3);
		Assert.assertTrue("User in not on Manage Application Package Template Page",
				isElementPresent(LoginLocators.HeadingManageApplicationPackageTemplatePage));
	}
	public void Clickon_CreateNewTemplateButton()
	{
		WaitForElementPresent(LoginLocators.GrantorLoginButon, 3);
		clickOn(LoginLocators.CreateNewTemplateButton);
		
	}
	
	public void selectFormFamily_ClikOn_nextButton()
	{
		WaitForElementPresent(LoginLocators.GrantorLoginButon, 3);
		clickOn(LoginLocators.RRFormFamily);
		clickOn(LoginLocators.CreateApplicationPackageTemplate_NextButton);
		
	}
}
