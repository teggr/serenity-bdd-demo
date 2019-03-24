package com.robintegg.bdddemo.purchase;

import java.util.ArrayList;
import java.util.List;

public class Basket {

	private List<BasketItem> items = new ArrayList<>();

	public int getSize() {
		return items.size();
	}

	public boolean isEmpty() {
		return items.isEmpty();
	}

	public void addItem(BasketItem basketItem) {
		items.add(basketItem);
	}

	public void clear() {
		items.clear();
	}

	public void removeItem(String catalogueItemId) {
		items.removeIf(item -> item.getCatalogueItemId().equals(catalogueItemId));
	}

	public List<BasketItem> getItems() {
		return items;
	}

}
