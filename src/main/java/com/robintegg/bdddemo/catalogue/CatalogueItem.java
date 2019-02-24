package com.robintegg.bdddemo.catalogue;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "catalogue_item")
@Data
public class CatalogueItem {

	@Id
	@SequenceGenerator(name = "catalogue_item_id_generator", sequenceName = "catalogue_item_id_sequence", allocationSize = 1)
	@GeneratedValue(generator = "catalogue_item_id_generator")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "image_url")
	private String imageUrl;

}
