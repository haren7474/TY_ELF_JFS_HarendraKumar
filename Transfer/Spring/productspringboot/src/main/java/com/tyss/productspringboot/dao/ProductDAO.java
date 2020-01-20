package com.tyss.productspringboot.dao;

import java.util.List;

import com.tyss.productspringboot.dto.ProductBean;

public interface ProductDAO {
	public boolean addProduct(ProductBean bean);

	public boolean deleteProduct(int id);

	public boolean updateProduct(ProductBean bean);

	public ProductBean getProduct(int id);

	public List<ProductBean> getAllProducts();

}
