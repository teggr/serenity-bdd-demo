package com.robintegg.bdddemo.checkout;

import com.robintegg.bdddemo.basket.Basket;

public interface CheckoutService {

	boolean isCheckoutAvailableForBasket(Basket basket);

	void checkout(Basket basket);

	String getCheckoutMessage();

}
