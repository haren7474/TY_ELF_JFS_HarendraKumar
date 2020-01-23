 package com.tyss.forestrymanagementsystemboot.controller;

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

import com.tyss.forestrymanagementsystemboot.dto.ProductBean;
import com.tyss.forestrymanagementsystemboot.dto.ProductResponse;
import com.tyss.forestrymanagementsystemboot.services.ProductServices;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProductController {

	@Autowired
	private ProductServices service;

	@PostMapping(path = "/fmsboot/addProduct", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
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

	@PutMapping(path = "/fmsboot/updateProduct", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse updateProduct(@RequestBody ProductBean bean) {
		ProductResponse response = new ProductResponse();

		if (service.modifyProduct(bean)) {
			response.setMessage("Success");
			response.setDescription("Product updated successfully");
			response.setStatusCode(201);
			response.setProductBean(Arrays.asList(bean));

		} else {
			response.setMessage("Failure");
			response.setDescription("Product not updated, Id not found");
			response.setStatusCode(401);
		}
		return response;
	}

	@DeleteMapping(path = "/fmsboot/deleteProduct/{productId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse deleteProduct(@PathVariable("productId") int productId) {
		ProductResponse response = new ProductResponse();

		if (service.deleteProduct(productId)) {
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
	
	@PostMapping(path = "/fmsboot/getProduct", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getProduct(@RequestParam("productId") int productId) {
		ProductResponse response = new ProductResponse();
		ProductBean bean=  service.getProductById(productId);
		if (bean!=null) {
			response.setMessage("Success");
			response.setDescription("Product found and displayed");
			response.setStatusCode(201);
			response.setProductBean(Arrays.asList(bean));

		} else {
			response.setMessage("Failure");
			response.setDescription("Product not found");
			response.setStatusCode(401);
		}
		return response;
	}
	
	@PostMapping(path = "/fmsboot/getAllProducts", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getAllProducts() {
		ProductResponse response = new ProductResponse();
		List<ProductBean> list=  service.getAllProduct();
		if (list.size()>0) {
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
}
