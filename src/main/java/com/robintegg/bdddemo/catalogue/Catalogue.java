package com.robintegg.bdddemo.catalogue;

import java.util.List;

import lombok.Value;

@Value
public class Catalogue {

	private final List<CatalogueItem> items;

	public boolean isEmpty() {
		return items.isEmpty();
	}

}
