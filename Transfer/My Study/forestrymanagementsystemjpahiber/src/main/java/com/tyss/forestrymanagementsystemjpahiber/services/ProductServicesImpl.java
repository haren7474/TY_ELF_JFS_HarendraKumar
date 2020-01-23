package com.tyss.forestrymanagementsystemjpahiber.services;

import java.util.List;

import com.tyss.forestrymanagementsystemjpahiber.dao.ProductDao;
import com.tyss.forestrymanagementsystemjpahiber.dto.ProductBean;
import com.tyss.forestrymanagementsystemjpahiber.factory.ForestryManagementSystemFactory;

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

	@Override
	public ProductBean getProductById(int productId) {
		return productDao.getProductById(productId);
	}
}
