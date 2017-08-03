package com.grants.locator;

public class LoginLocators {
	
	public final static String LoginLink = "//div[@id='globalnav']/ul/li[4]//a";
	public final static String ApplicantAccount = "//ul[@class='TabbedPanelsTabGroup']//li[1]";
	public final static String GrantorAccount = "//ul[@class='TabbedPanelsTabGroup']//li[2]";
	public final static String EBIZPOCAccount = "//ul[@class='TabbedPanelsTabGroup']//li[3]";
	public final static String ApplicantUserName = "//*[@id='loginForm:applicantUsername']";
	public final static String ApplicantPassword = "//*[@id='loginForm:applicantPassword']";
	public final static String ApplicantLoginButon = "loginForm:applicantLoginButton";
	
	public final static String GrantorUserName = "loginForm:agencyUsername";
	public final static String GrantorPassword = "loginForm:agencyPassword";
	public final static String GrantorLoginButon = "loginForm:agencyLoginButton";
	
	public final static String welcomeUser = "//div[@id='status']//h3";
	public final static String ApplicantsTab = "//*[@class='selected']";
	public final static String GrantorTab = "//li[@id='Grantors-tab' and @class='selected']";
	
	public final static String ManageApplicationPackageTemplate = "//a[@title='Click to Manage Application Package Templates']";
	public final static String HeadingManageApplicationPackageTemplatePage = "//h1[@class='page-title']";
	public final static String CreateNewTemplateButton = "//button[@id='form:cmCreate']";
	public final static String RRFormFamily = "//label[text()='R&R Family']";
	public final static String CreateApplicationPackageTemplate_NextButton = "//button[@id='form:cmNext']";
	
	
	
	
	
	
	
}
