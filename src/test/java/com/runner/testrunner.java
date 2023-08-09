package com.runner;



import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@ParaBank", dryRun = true, monochrome = true, publish = true, stepNotifications = true, features = {
		"src\\test\\resources\\Features" }, glue = "com.stepdefinition", plugin = {"pretty"})
//"json:target\\report.json"
public class testrunner   {
		
		@AfterClass
		public static void afterClass() throws IOException
		{
	//Report.generateJVMReport(getProjectPath()+getProperties("jsonPath"));
		}
	}

