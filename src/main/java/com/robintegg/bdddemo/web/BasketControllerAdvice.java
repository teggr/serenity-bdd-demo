package com.robintegg.bdddemo.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.robintegg.bdddemo.basket.Basket;
import com.robintegg.bdddemo.basket.BasketService;

import lombok.RequiredArgsConstructor;

@ControllerAdvice(assignableTypes = HomeController.class)
@RequiredArgsConstructor
public class BasketControllerAdvice {

	private final BasketService basketService;

	@ModelAttribute("basket")
	public Basket get() {
		return basketService.getBasket();
	}

}
