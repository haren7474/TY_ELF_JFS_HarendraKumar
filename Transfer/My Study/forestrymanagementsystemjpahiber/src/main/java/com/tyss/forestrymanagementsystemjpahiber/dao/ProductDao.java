package com.tyss.forestrymanagementsystemjpahiber.dao;

import java.util.List;

import com.tyss.forestrymanagementsystemjpahiber.dto.ProductBean;

public interface ProductDao {
	public List<ProductBean> getAllProduct();
	public boolean deleteProduct(int productId);
	public boolean addProduct(ProductBean product);
	public ProductBean searchProduct(int productId);
	public boolean updateQuantity(int productId, int newQuantity);
	public ProductBean getProductById(int productId);
}
