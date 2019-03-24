package com.robintegg.bdddemo.stepdefinitions;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;

import com.robintegg.bdddemo.browse.Browse;
import com.robintegg.bdddemo.catalogue.AddToCatalogue;
import com.robintegg.bdddemo.navigate.NavigateTo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BrowseCatalogueStepDefinitions {

	@Steps
	NavigateTo navigateTo;

	@Steps
	Browse browse;

	@Steps
	AddToCatalogue addToCatalogue;

	@Given("there are some kittens available")
	public void there_are_some_kittens_available() {
		addToCatalogue.someKittens();
	}

	@When("I browse the catalogue")
	public void i_browse_the_catalogue() {
		navigateTo.homePage();
	}

	@Then("I should see all available kittens")
	public void i_should_see_all_available_kittens() {
		assertThat(browse.kittenDescriptions(), hasItems("Sneezy Kitten"));
	}

}
