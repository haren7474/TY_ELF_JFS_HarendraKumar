package com.tyss.productspringboot.service;

import java.util.List;

import com.tyss.productspringboot.dto.ProductBean;

public interface ProductService {
	public boolean addProduct(ProductBean bean);

	public boolean deleteProduct(int id);

	public boolean updateProduct(ProductBean productBean);

	public ProductBean getProduct(int id);

	public List<ProductBean> getAllProducts();

}
