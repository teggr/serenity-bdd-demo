package com.robintegg.bdddemo.purchase;

public interface CheckoutService {

	boolean isCheckoutAvailableForBasket(Basket basket);

	Order checkout(Basket basket);

	Order getOrder();

}
