package com.robintegg.bdddemo.browse;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class Browse extends UIInteractionSteps {

	@Step("Get item names")
	public List<String> itemNames() {
		return findAll(CatalogueView.ITEM_NAMES).stream().map(WebElement::getText).collect(Collectors.toList());
	}

	@Step
	public void findItem() {

	}

}
