package org.runner;

import org.demo.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\eclipse-workspace\\cucumber28\\src\\test\\resources",glue="org.demo",monochrome=true,dryRun=false,
strict=false, snippets= SnippetType.UNDERSCORE, tags= {"@smoke"}, plugin= 
{"html:C:\\Users\\Admin\\eclipse-workspace\\cucumber28\\Reports\\html",
		"json:C:\\Users\\Admin\\eclipse-workspace\\cucumber28\\Reports\\json\\fb.json",
		"junit:C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\cucumber28\\\\Reports\\\\junit\\\\facebook.xml",
		"rerun:C:\\Users\\Admin\\eclipse-workspace\\cucumber28\\src\\test\\resources\\rerun\\re.txt"})




public class RunAll {

	@AfterClass
	public static void report() {
		JvmReport.generateJvmReport("C:\\Users\\Admin\\eclipse-workspace\\cucumber28\\Reports\\json\\fb.json");

	}
	
}
