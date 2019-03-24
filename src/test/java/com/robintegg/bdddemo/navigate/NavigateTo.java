package com.robintegg.bdddemo.navigate;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

	HomePage homePage;

	@Step("Open the Home Page")
	public void homePage() {
		homePage.open();
	}

}
