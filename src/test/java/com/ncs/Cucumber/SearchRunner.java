package com.ncs.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/java/com/ncs/Cucumber"},
		glue = {"com.ncs.Cucumber"},
	    plugin = {"html:reports/cucumber-reports/cucumber.html"}
	    //plugin = {"json:reports/cucumber-reports/cucumber.json"}

		)
public class SearchRunner extends AbstractTestNGCucumberTests {

}
