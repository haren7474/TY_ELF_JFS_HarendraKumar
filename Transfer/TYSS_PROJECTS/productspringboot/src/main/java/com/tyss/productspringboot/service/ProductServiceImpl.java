package com.tyss.productspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.productspringboot.dao.ProductDAO;
import com.tyss.productspringboot.dto.ProductBean;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO dao;
	
	@Override
	public boolean addProduct(ProductBean bean) {
		return dao.addProduct(bean);
	}

	@Override
	public boolean deleteProduct(int id) {
		return dao.deleteProduct(id);
	}

	@Override
	public boolean updateProduct(ProductBean productBean) {
		return dao.updateProduct(productBean);
	}

	@Override
	public ProductBean getProduct(int id) {
		return dao.getProduct(id);
	}

	@Override
	public List<ProductBean> getAllProducts() {
		return dao.getAllProducts();
	}

}
