package com.grants.util;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/java/com/grants/features"},
		glue={"com.grants.stepDefination"},
		plugin= {"html:target/cucumber-html-report"				
				},
		tags= {"@CreateOppurtunity"}
		)
public class TestRunner {

}