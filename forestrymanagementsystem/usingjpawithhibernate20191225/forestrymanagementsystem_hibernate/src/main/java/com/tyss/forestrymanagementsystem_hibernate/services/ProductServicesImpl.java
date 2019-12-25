package com.tyss.forestrymanagementsystem_hibernate.services;

import java.util.List;

import com.tyss.forestrymanagementsystem_hibernate.dao.ProductDao;
import com.tyss.forestrymanagementsystem_hibernate.dto.ProductBean;
import com.tyss.forestrymanagementsystem_hibernate.factory.ForestryManagementSystemFactory;

public class ProductServicesImpl implements ProductServices
{
	ProductDao productDao =ForestryManagementSystemFactory.instanceOfProductDaoImpl();
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
	public boolean updateQuantity(int productId, int newQuantity) 
	{
		return productDao.updateQuantity(productId, newQuantity);
	}
}
