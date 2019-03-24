package com.robintegg.bdddemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.robintegg.bdddemo.purchase.Basket;
import com.robintegg.bdddemo.purchase.CheckoutService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/basket")
@RequiredArgsConstructor
public class BasketController {

	private final Basket basket;
	private final CheckoutService checkoutService;

	@GetMapping
	public String get(Model model) {
		model.addAttribute("basket", basket);
		if (checkoutService.isCheckoutAvailableForBasket(basket)) {
			model.addAttribute("checkout", true);
		}
		if (basket.isEmpty()) {
			model.addAttribute("empty", true);
		} else {
			model.addAttribute("clear", true);
		}
		return "basket";
	}

	@PostMapping(params = "remove-basket-item")
	public String postAddToBasket(@RequestParam("catalogueItemId") String catalogueItemId) {
		basket.removeItem(catalogueItemId);
		if (basket.isEmpty()) {
			return "redirect:/";
		} else {
			return "redirect:/basket";
		}
	}

	@PostMapping(params = "clear")
	public String postClear() {
		basket.clear();
		return "redirect:/";
	}

	@PostMapping(params = "checkout")
	public String postCheckout() {
		checkoutService.checkout(basket);
		return "redirect:/order";
	}

}
