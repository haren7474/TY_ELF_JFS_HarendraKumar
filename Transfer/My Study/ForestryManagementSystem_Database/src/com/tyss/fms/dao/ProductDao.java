package com.tyss.fms.dao;

import java.util.List;

import com.tyss.fms.dto.ProductBean;

public interface ProductDao {
	public List<ProductBean> getAllProduct();
	public boolean deleteProduct(int productId);
	public boolean addProduct(ProductBean product);
	public boolean searchProduct(int productId);
	public boolean updateQuantity(int productId, int newQuantity);
}
