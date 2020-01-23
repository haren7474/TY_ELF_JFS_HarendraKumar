package com.tyss.forestrymanagementsystemboot.services;

import java.util.List;

import com.tyss.forestrymanagementsystemboot.dto.ProductBean;


public interface ProductServices 
{
	public List<ProductBean> getAllProduct();
	public boolean deleteProduct(int productId);
	public boolean addProduct(ProductBean product);
	public ProductBean searchProduct(int productId);
	public boolean modifyProduct(ProductBean productBean);
	public ProductBean getProductById(int productId);
}
