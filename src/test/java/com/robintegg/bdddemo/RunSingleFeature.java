package com.robintegg.bdddemo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "classpath:features/browse_catalogue.feature")
public class RunSingleFeature {
}
