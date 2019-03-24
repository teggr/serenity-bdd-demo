package com.robintegg.bdddemo.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import com.robintegg.bdddemo.purchase.Basket;

@Configuration
public class WebSessionBasketConfiguration {

	@Bean
	@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
	public Basket basket() {
		return new Basket();
	}

}
