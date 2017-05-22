package pl.altkom.shop.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CoreConfig.class);
		ProductService productService = (ProductService) context.getBean("productService");
	}
}
