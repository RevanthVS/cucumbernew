   package com.flipkart.stepdefintion;

	import org.junit.runner.RunWith;

	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src//test//resources//Features",
	                     glue = "com.flipkart.stepdefinition",
	                   plugin = "html:target",
	               monochrome = true,
	                   dryRun = false,
	                     tags = {"@sanity","@Smoke"})

	public class TestRunner {

	}
	 