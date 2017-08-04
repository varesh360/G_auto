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
	
	
}
