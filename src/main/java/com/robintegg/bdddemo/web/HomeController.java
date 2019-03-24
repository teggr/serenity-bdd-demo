package com.robintegg.bdddemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.robintegg.bdddemo.catalogue.CatalogueService;
import com.robintegg.bdddemo.purchase.Basket;
import com.robintegg.bdddemo.purchase.BasketItem;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class HomeController {

	private final CatalogueService catalogueService;
	private final Basket basket;

	@GetMapping
	public String get(Model model) {
		model.addAttribute("catalogue", catalogueService.getCatalogue());
		return "catalogue";
	}

	@PostMapping(params = "add-to-basket")
	public String postAddToBasket(@ModelAttribute("basketItem") BasketItem basketItem, BindingResult bindingResult) {
		basket.addItem(basketItem);
		return "redirect:/";
	}

}
