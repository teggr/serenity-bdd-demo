package com.robintegg.bdddemo.web;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import com.robintegg.bdddemo.basket.Basket;
import com.robintegg.bdddemo.basket.BasketItem;
import com.robintegg.bdddemo.basket.BasketService;

import lombok.RequiredArgsConstructor;

@Service
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
@RequiredArgsConstructor
public class WebSessionBasketService implements BasketService {

	private Basket basket = new Basket();

	@Override
	public Basket getBasket() {
		return basket;
	}

	@Override
	public void addToBasket(BasketItem basketItem) {
		basket.addItem(basketItem);
	}

	@Override
	public void removeItemByCatalogueItemId(String catalogueItemId) {
		basket.removeIf(b -> b.getCatalogueItemId().equals(catalogueItemId));
	}

	@Override
	public void clear() {
		basket.clear();
	}

}
