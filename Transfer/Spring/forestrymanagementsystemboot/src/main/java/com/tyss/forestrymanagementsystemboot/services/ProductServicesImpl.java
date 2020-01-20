package com.tyss.forestrymanagementsystemboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.forestrymanagementsystemboot.dao.ProductDao;
import com.tyss.forestrymanagementsystemboot.dto.ProductBean;

@Service
public class ProductServicesImpl implements ProductServices
{
	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<ProductBean> getAllProduct() 
	{
		return productDao.getAllProduct();
	}

	@Override
	public boolean deleteProduct(int productId) {
		return productDao.deleteProduct(productId);
	}

	@Override
	public boolean addProduct(ProductBean product) {
		return productDao.addProduct(product);
	}

	@Override
	public ProductBean searchProduct(int productId) {
		return productDao.searchProduct(productId);
	}

	@Override
	public boolean modifyProduct(ProductBean productBean) 
	{
		return productDao.modifyProduct(productBean);
	}

	@Override
	public ProductBean getProductById(int productId) {
		return productDao.getProductById(productId);
	}
}
