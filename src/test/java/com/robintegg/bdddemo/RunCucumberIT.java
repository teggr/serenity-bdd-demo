package com.robintegg.bdddemo;

import org.junit.ClassRule;
import org.junit.runner.RunWith;
import org.testcontainers.containers.GenericContainer;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "classpath:features")
public class RunCucumberIT {

	@ClassRule
	public static GenericContainer postgres = Containers.POSTGRES;

}
