package com.JetEdge.OwnerPortal.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeOwnerPortal\\src\\test\\resources\\FeatureFiles\\JE_OP_6_FeedbackSurvey.feature",
glue = "com.JetEdge.OwnerPortal.StepDefinition",
//tags="@TC_02",
plugin = {"pretty","html:Reports/TestReport.html",
		"json:target/cucumber/cucumber.json",
		"html:Reports/cucumber-reports.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class JE_OP_6_FeedbackSurveyRunnerTest {

	
}
