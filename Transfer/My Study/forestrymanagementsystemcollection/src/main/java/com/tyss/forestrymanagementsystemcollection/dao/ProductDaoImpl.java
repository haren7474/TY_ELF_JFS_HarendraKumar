package com.tyss.forestrymanagementsystemcollection.dao;

import java.util.ArrayList;
import java.util.List;

import com.tyss.forestrymanagementsystemcollection.dto.ProductBean;

public class ProductDaoImpl implements ProductDao {
	private static List<ProductBean> pList = new ArrayList<ProductBean>();

	static {
		pList.add(new ProductBean(101, "Timber", 100, 20, "1 Year warranty", 3));
		pList.add(new ProductBean(102, "Stem", 60, 20, "1 Year warranty", 3));
		pList.add(new ProductBean(103, "Leaf", 150, 10, "1 Year warranty", 3));
	}

	@Override
	public List<ProductBean> getAllProduct() {
		return pList;
	}

	@Override
	public boolean deleteProduct(int productId) {
		boolean isDeleted = false;
		for (ProductBean productBean : pList) {
			if (productBean.getProductId() == productId) {
				isDeleted = true;
				pList.remove(productBean);
				break;
			}
		}
		return isDeleted;
	}

	@Override
	public boolean addProduct(ProductBean product) {
		boolean canBeAdded = true;
		for (ProductBean productBean : pList) {
			if (productBean.getProductId() == product.getProductId()) {
				canBeAdded = false;
				break;
			}
		}
		if (canBeAdded == true) {
			pList.add(product);
		}
		return canBeAdded;
	}

	@Override
	public ProductBean searchProduct(int productId) {
		ProductBean keepBean = null;
		for (ProductBean productBean : pList) {
			if (productBean.getProductId() == productId) {
				keepBean = productBean;
			}
		}
		return keepBean;
	}

	@Override
	public boolean updateQuantity(int productId, int newQuantity) {
		boolean isModified = false;
		for (ProductBean productBean : pList) {
			if (productBean.getProductId() == productId) {
				isModified = true;
				productBean.setProductQuantity(newQuantity);
				;
				break;
			}
		}
		return isModified;
	}
}
