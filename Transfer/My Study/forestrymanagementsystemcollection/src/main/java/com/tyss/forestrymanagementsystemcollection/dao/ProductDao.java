package com.tyss.forestrymanagementsystemcollection.dao;

import java.util.List;

import com.tyss.forestrymanagementsystemcollection.dto.ProductBean;

public interface ProductDao {
	public List<ProductBean> getAllProduct();
	public boolean deleteProduct(int productId);
	public boolean addProduct(ProductBean product);
	public ProductBean searchProduct(int productId);
	public boolean updateQuantity(int productId, int newQuantity);
}
