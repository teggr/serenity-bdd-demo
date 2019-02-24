package com.robintegg.bdddemo.basket;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import lombok.Value;

@Value
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

	public void removeIf(Predicate<? super BasketItem> filter) {
		items.removeIf(filter);
	}

	public void clear() {
		items.clear();
	}

}
