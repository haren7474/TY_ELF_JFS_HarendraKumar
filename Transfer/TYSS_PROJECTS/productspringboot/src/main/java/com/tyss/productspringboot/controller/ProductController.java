package com.tyss.productspringboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.productspringboot.dto.ProductBean;
import com.tyss.productspringboot.dto.ProductResponse;
import com.tyss.productspringboot.service.ProductService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping(path = "/addProduct", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse addProduct(@RequestBody ProductBean bean) {
		ProductResponse response = new ProductResponse();

		if (service.addProduct(bean)) {
			response.setMessage("Success");
			response.setDescription("Product added successfully");
			response.setStatusCode(201);
			response.setBean(Arrays.asList(bean));

		} else {
			response.setMessage("Failure");
			response.setDescription("Product not added, Url already exists");
			response.setStatusCode(401);
		}
		return response;
	}

	@PutMapping(path = "/updateProduct", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse updateProduct(@RequestBody ProductBean bean) {
		ProductResponse response = new ProductResponse();

		if (service.updateProduct(bean)) {
			response.setMessage("Success");
			response.setDescription("Product cost updated successfully");
			response.setStatusCode(201);

		} else {
			response.setMessage("Failure");
			response.setDescription("Price not updated, Id not found");
			response.setStatusCode(401);
		}
		return response;
	}

	@DeleteMapping(path = "/deleteProduct/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse deleteProduct(@PathVariable("id") int id) {
		ProductResponse response = new ProductResponse();

		if (service.deleteProduct(id)) {
			response.setMessage("Success");
			response.setDescription("Product deleted successfully");
			response.setStatusCode(201);

		} else {
			response.setMessage("Failure");
			response.setDescription("Product not deleted, Id not found");
			response.setStatusCode(401);
		}
		return response;

	}
	
	@PostMapping(path = "/getProduct", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getProduct(@RequestParam("id") int id) {
		ProductResponse response = new ProductResponse();
		ProductBean bean=  service.getProduct(id);
		if (bean!=null) {
			response.setMessage("Success");
			response.setDescription("Product found and displayed");
			response.setStatusCode(201);
			response.setBean(Arrays.asList(bean));

		} else {
			response.setMessage("Failure");
			response.setDescription("Product not found");
			response.setStatusCode(401);
		}
		return response;
	}
	
	@PostMapping(path = "/getAllProducts", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getAllProducts() {
		ProductResponse response = new ProductResponse();
		List<ProductBean> list=  service.getAllProducts();
		if (list.size()>0) {
			response.setMessage("Success");
			response.setDescription("Products found and displayed");
			response.setStatusCode(201);
			response.setBean(list);

		} else {
			response.setMessage("Failure");
			response.setDescription("Empty List");
			response.setStatusCode(401);
		}
		return response;
	}
}
