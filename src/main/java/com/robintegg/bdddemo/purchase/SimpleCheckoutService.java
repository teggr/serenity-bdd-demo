package com.robintegg.bdddemo.purchase;

import org.springframework.stereotype.Service;

@Service
public class SimpleCheckoutService implements CheckoutService {

	private Order order = new Order(0);

	@Override
	public boolean isCheckoutAvailableForBasket(Basket basket) {
		return !basket.isEmpty();
	}

	@Override
	public Order checkout(Basket basket) {
		int size = basket.getSize();
		basket.clear();
		order = new Order(size);
		return order;
	}

	@Override
	public Order getOrder() {
		return order;
	}

}
