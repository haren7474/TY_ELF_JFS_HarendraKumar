package com.tyss.forestrymanagementsystemcollection.services;

import java.util.List;

import com.tyss.forestrymanagementsystemcollection.dto.ProductBean;


public interface ProductServices 
{
	public List<ProductBean> getAllProduct();
	public boolean deleteProduct(int productId);
	public boolean addProduct(ProductBean product);
	public ProductBean searchProduct(int productId);
	public boolean updateQuantity(int productId, int newQuantity);
}
