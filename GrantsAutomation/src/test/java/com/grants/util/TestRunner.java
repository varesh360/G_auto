package com.grants.util;

import java.io.File;
import org.junit.AfterClass;
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
				"com.cucumber.listener.ExtentCucumberFormatter:target/extent-report/report.html"
				},
		  //tags= {"@LoginAndVerifyMenues,@CreateTemplate,@CreateOppurtunity,@NewPackageCreation"}
				tags= {"@LoginAndVerifyMenues,@CreateTemplate,@CreateOppurtunity"}
		)



public class TestRunner  extends DriverTestCase{
	
	@AfterClass
	public static void reportsetup()
	{
		String dirPath = System.getProperty("user.dir");
		Reporter.loadXMLConfig(new File(dirPath+"//src//test//java//com//grants//config//extent-config.xml"));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Windows 10 Pro","64-bit");
		Reporter.setSystemInfo("Selenium Version","3.4.0");
		Reporter.setSystemInfo("Java Version", "1.8.0_111");
		Reporter.setSystemInfo("Chrome 64-bit Vesrion","60.0.3112.90");
		Reporter.setTestRunnerOutput("Cucumber JUnit TestRunner Runner");
	}

}