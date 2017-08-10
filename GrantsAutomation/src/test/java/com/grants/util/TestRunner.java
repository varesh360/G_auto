package com.grants.util;

import java.io.File;
import java.util.Properties;

import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/java/com/grants/features"},
		glue={"com.grants.stepDefination"},
		plugin= {"html:target/cucumber-html-report",
				"json:target/Destination/cucumber.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/advancereport/report.html"
				},
		tags= {"@LoginAndVerifyMenues,@CreateTemplate,@CreateOppurtunity,@NewPackageCreation"}
		)



public class TestRunner {
	public static void reportsetup()
	{
		Reporter.loadXMLConfig(new File("/src/test/java/com/grants/config/extent-config.xml"));
		Properties p=System.getProperties();
		p.list(System.out);
	}
	
	public String getpath() {
		String dirPath = System.getProperty("user.dir");
		return dirPath;
	}


}