package com.robintegg.bdddemo.catalogue;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogueItemRepository extends JpaRepository<CatalogueItem, Long> {

}
