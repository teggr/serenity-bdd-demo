package com.robintegg.bdddemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.robintegg.bdddemo.checkout.CheckoutService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/checkout")
@RequiredArgsConstructor
public class CheckoutController {

	private final CheckoutService checkoutService;

	@GetMapping
	public String get(Model model) {
		model.addAttribute("checkoutMessage", checkoutService.getCheckoutMessage());
		return "checkout";
	}

}
