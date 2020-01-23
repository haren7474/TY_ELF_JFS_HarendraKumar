package com.tyss.retailermaintenencesystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.retailermaintenencesystem.dto.ProductBean;
import com.tyss.retailermaintenencesystem.dto.UserBean;
import com.tyss.retailermaintenencesystem.exception.UserException;
import com.tyss.retailermaintenencesystem.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;

	@Override
	public ProductBean searchProduct(int id) {
		ProductBean bean = repository.findByproductId(id);
		if (bean != null) {
			return bean;
		} else {
			throw new UserException("Id does not exist");
		}
	}

	@Override
	public boolean addProduct(ProductBean bean) {

		ProductBean productBean = null;
		try {
			productBean = repository.save(bean);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}

		return true;
	}

	@Override
	public List<ProductBean> getAllProducts() {
		return repository.findAll();
	}

}
