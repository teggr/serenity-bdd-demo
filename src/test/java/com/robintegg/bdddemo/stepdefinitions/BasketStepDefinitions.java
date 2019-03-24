package com.robintegg.bdddemo.stepdefinitions;

import com.robintegg.bdddemo.browse.Browse;
import com.robintegg.bdddemo.navigate.NavigateTo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BasketStepDefinitions {

	@Steps
	NavigateTo navigateTo;

	@Steps
	Browse browse;

	@Given("I am browsing the catalogue")
	public void i_am_browsing_the_catalogue() {
		navigateTo.homePage();
	}

	@When("I find an item I like")
	public void i_find_an_item_I_like() {
		browse.findItem();
	}

	@Given("I have an item in my basket")
	public void i_have_an_item_in_my_basket() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Given("I have some items in my basket")
	public void i_have_some_items_in_my_basket() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("I should be able add that to my basket")
	public void i_should_be_able_add_that_to_my_basket() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@When("I no longer want that item")
	public void i_no_longer_want_that_item() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("I should be able to remove that item from my basket")
	public void i_should_be_able_to_remove_that_item_from_my_basket() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@When("I no longer want any items")
	public void i_no_longer_want_any_items() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("I should be able to clear all items from my basket")
	public void i_should_be_able_to_clear_all_items_from_my_basket() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@When("I have all the items I want")
	public void i_have_all_the_items_I_want() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("I should be able to purchase those items")
	public void i_should_be_able_to_purchase_those_items() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

}
