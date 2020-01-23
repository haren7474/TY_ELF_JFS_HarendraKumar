package com.tyss.fms.dao;

import java.util.List;

import com.tyss.fms.dto.ProductBean;

public interface ProductDao {
	public List<ProductBean> getAllProduct();
	public boolean deleteProduct(String productId);
	public boolean addProduct(ProductBean product);
	public boolean searchProduct(String productId);
	public boolean updateQuantity(String productId);
}
