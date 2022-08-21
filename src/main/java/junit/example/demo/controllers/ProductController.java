package junit.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import junit.example.demo.entities.Product;

import org.springframework.web.bind.annotation.GetMapping;



@RestController

public class ProductController {
	@GetMapping(value="/products")
	public Product getFirstPage() {
		Product product = new Product();
		product.setProdId(1);
		product.setName("kalem");
		product.setStock(140);
		
		return product;
	}
	
	

}
