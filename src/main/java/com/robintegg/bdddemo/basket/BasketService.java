package com.robintegg.bdddemo.basket;

public interface BasketService {

	Basket getBasket();

	void addToBasket(BasketItem basketItem);

	void removeItemByCatalogueItemId(String catalogueItemId);

	void clear();

}
