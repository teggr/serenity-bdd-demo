package com.robintegg.bdddemo.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.robintegg.bdddemo.purchase.Basket;

import lombok.RequiredArgsConstructor;

@ControllerAdvice(assignableTypes = HomeController.class)
@RequiredArgsConstructor
public class BasketWidget {

	private final Basket basket;

	@ModelAttribute("basket")
	public Basket get() {
		return basket;
	}

}
