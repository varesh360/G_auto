package com.grants.pagehelper;

import com.grants.locator.CreateOpportunityLocators;
import com.grants.locator.CreateTemplateLocators;
import com.grants.util.DriverTestCase;

public class CreateOpportunityHelper extends DriverTestCase {
	
	
	public void navigateToGrantsTabAndVerifyCreateOpportunityLink() throws InterruptedException
	{
		WaitForElementPresent(CreateTemplateLocators.GrantorTab, 20);
		mouseOver(CreateTemplateLocators.GrantorTab);
		waitForElementLoad(7);
		clickOn(CreateOpportunityLocators.ManageOpportunitiesLink);
		//Assert.assertTrue("Manage Opportunities Link is not present ",isElementPresent(CreateOpportunityLocators.ManageOpportunitiesLink));
	}

}
