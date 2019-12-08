package com.tyss.fms.services;

import java.util.List;

import com.tyss.fms.dao.ProductDao;
import com.tyss.fms.dto.ProductBean;
import com.tyss.fms.factory.ForestryManagementSystemFactory;

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
	public boolean searchProduct(int productId) {
		return productDao.searchProduct(productId);
	}

	@Override
	public boolean updateQuantity(int productId, int newQuantity) 
	{
		return productDao.updateQuantity(productId, newQuantity);
	}
}
