package com.tyss.fms.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.tyss.fms.dto.ContractBean;
import com.tyss.fms.dto.ProductBean;

public class ProductDaoImpl implements ProductDao {
	private List<ProductBean> productList = new ArrayList<ProductBean>();

	@Override
	public List<ProductBean> getAllProduct() {
		return productList;
	}

	@Override
	public boolean deleteProduct(String productId) 
	{
		for (ProductBean productBean : productList) {
			if (productBean.getProductId().equalsIgnoreCase(productId)) 
			{
				productList.remove(productBean);
				System.out.println("Product has been removed");
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean addProduct(ProductBean product) 
	{
		productList.add(product);
		return true;
	}

	@Override
	public boolean searchProduct(String productId) {
		for (ProductBean productBean : productList) {
			if (productBean.getProductId().equalsIgnoreCase(productId)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateQuantity(String productId) 
	{
		for (ProductBean productBean : productList) {
			if (productBean.getProductId().equalsIgnoreCase(productId)) {
				productBean.setProductQuantity(productBean.getProductQuantity() + 1);
				return true;
			}
		}
		return false;
	}
}
