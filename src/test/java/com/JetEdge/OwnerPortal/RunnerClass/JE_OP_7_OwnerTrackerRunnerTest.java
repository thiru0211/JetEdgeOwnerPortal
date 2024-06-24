package com.JetEdge.OwnerPortal.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeOwnerPortal\\src\\test\\resources\\FeatureFiles\\JE_OP_7_OwnerTracker.feature",
glue = "com.JetEdge.OwnerPortal.StepDefinition",
//tags="@TC_04",
plugin = {"pretty","html:Reports/TestReport.html",
		"json:Reports/jsontestreport.json",
		"html:Reports/cucumber-reports.html" })
public class JE_OP_7_OwnerTrackerRunnerTest {

	
}
