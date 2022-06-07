package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.demo",monochrome=true,dryRun=false,
strict=false, snippets= SnippetType.UNDERSCORE, tags= {"@smoke"}, plugin= 
{"json:C:\\Users\\Admin\\eclipse-workspace\\cucumber28\\Reports\\json\\fb.json",
"rerun:C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\cucumber28\\\\src\\\\test\\\\resources\\\\rerun\\\\re.txt"})


public class ReRunner {
	
	
}
