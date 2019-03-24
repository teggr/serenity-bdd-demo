package com.robintegg.bdddemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.robintegg.bdddemo.purchase.CheckoutService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

	private final CheckoutService checkoutService;

	@GetMapping
	public String get(Model model) {
		model.addAttribute("order", checkoutService.getOrder());
		model.addAttribute("start", true);
		return "order";
	}

}
