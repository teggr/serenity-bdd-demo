package com.robintegg.bdddemo.checkout;

import java.text.MessageFormat;

import org.springframework.stereotype.Service;

import com.robintegg.bdddemo.basket.Basket;

@Service
public class SimpleCheckoutService implements CheckoutService {

	private String checkoutMessage = "";

	@Override
	public boolean isCheckoutAvailableForBasket(Basket basket) {
		return !basket.isEmpty();
	}

	@Override
	public void checkout(Basket basket) {
		checkoutMessage = MessageFormat.format("Thanks for your purchase of {0} items", basket.getSize());
		basket.clear();
	}

	@Override
	public String getCheckoutMessage() {
		return checkoutMessage;
	}

}
