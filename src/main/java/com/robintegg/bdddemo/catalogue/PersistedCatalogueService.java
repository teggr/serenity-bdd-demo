package com.robintegg.bdddemo.catalogue;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
class PersistedCatalogueService implements CatalogueService {

	private final CatalogueItemRepository catalogueRepository;

	@Override
	public Catalogue getCatalogue() {
		return new Catalogue(catalogueRepository.findAll());
	}

	@Override
	public CatalogueItem getCatalogueItem(Long itemId) {
		return catalogueRepository.getOne(itemId);
	}

}
