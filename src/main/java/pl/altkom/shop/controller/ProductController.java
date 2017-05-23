package pl.altkom.shop.controller;

import java.io.Writer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@RequestMapping("/hello/{id}")

	public void hello(Writer writer, @PathVariable("id") Long id) throws Exception {
		writer.write("Hello World");
	}
}
