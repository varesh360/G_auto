package com.grants.pagehelper;

import org.junit.Assert;
import com.grants.locator.CreateTemplateLocators;
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
	}

}
