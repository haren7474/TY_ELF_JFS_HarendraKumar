package com.tyss.retailermaintenencesystem.service;

import java.util.List;

import com.tyss.retailermaintenencesystem.dto.ProductBean;

public interface ProductService {
	public ProductBean searchProduct(int id);
	public boolean addProduct(ProductBean bean);
	public List<ProductBean> getAllProducts();
}
