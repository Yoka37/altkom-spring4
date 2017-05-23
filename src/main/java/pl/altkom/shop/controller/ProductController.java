package pl.altkom.shop.controller;

import java.io.Writer;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pl.altkom.shop.model.Product;
import pl.altkom.shop.repo.ProductRepo;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Inject
	ProductRepo repo;

	@RequestMapping("/list")
	public String list(Writer writer, @RequestParam(required = false, value = "page") Integer page,
			@RequestParam(required = false, value = "orderBy") String orderBy, Model model) throws Exception {
		model.addAttribute("Page: ", page);
		model.addAttribute("orderBy: ", orderBy);

		List<Product> products = repo.getAll();
		model.addAttribute("products", products);

		return "product/product-list";

	}

}
