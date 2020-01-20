package com.tyss.retailermaintenencesystem.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.retailermaintenencesystem.dto.ProductBean;
import com.tyss.retailermaintenencesystem.dto.ProductResponse;
import com.tyss.retailermaintenencesystem.service.ProductService;

@RestController
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
			response.setProductBean(Arrays.asList(bean));

		} else {
			response.setMessage("Failure");
			response.setDescription("Product not added");
			response.setStatusCode(401);
		}
		return response;
	}

	@PostMapping(path = "/getAllProducts", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getAllProducts() {
		ProductResponse response = new ProductResponse();
		List<ProductBean> list = service.getAllProducts();
		if (list.size() > 0) {
			response.setMessage("Success");
			response.setDescription("Products found and displayed");
			response.setStatusCode(201);
			response.setProductBean(list);

		} else {
			response.setMessage("Failure");
			response.setDescription("Empty List");
			response.setStatusCode(401);
		}
		return response;
	}

	@PostMapping(path = "/getProduct", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getProduct(@RequestParam("id") int id) {
		ProductResponse response = new ProductResponse();
		ProductBean bean = service.searchProduct(id);
		if (bean != null) {
			response.setMessage("Success");
			response.setDescription("Product found and displayed");
			response.setStatusCode(201);
			response.setProductBean((Arrays.asList(bean)));

		} else {
			response.setMessage("Failure");
			response.setDescription("Product not found");
			response.setStatusCode(401);
		}
		return response;
	}

}
