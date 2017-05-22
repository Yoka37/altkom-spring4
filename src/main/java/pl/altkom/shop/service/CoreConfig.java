package pl.altkom.shop.service;

import org.springframework.context.annotation.Bean;

public class CoreConfig {

	@Bean
	public ProductService productService() {
		return new ProductService();
	}

}
