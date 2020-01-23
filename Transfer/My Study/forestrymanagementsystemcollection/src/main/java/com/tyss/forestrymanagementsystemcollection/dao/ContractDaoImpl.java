package com.tyss.forestrymanagementsystemcollection.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.tyss.forestrymanagementsystemcollection.dto.ContractBean;
import com.tyss.forestrymanagementsystemcollection.dto.ProductBean;
import com.tyss.forestrymanagementsystemcollection.factory.ForestryManagementSystemFactory;
import com.tyss.forestrymanagementsystemcollection.services.ProductServices;

public class ContractDaoImpl implements ContractDao {

	private static List<ContractBean> cList = new ArrayList<ContractBean>();
	static ProductServices productServices = ForestryManagementSystemFactory.instanceOfProductServies();

	static {
		cList.add(new ContractBean(501, 2, 101, 5, new Date(), "Wednesday", 10));
	}
	
	@Override
	public boolean deleteContract(int contractId) {
		boolean isDeleted = false;
		for (ContractBean contractBean : cList) {
			if (contractBean.getContractId() == contractId) {
				isDeleted = true;
				cList.remove(contractBean);
				break;
			}
		}
		return isDeleted;
	}

	@Override
	public boolean addContract(ContractBean contract) {
		boolean canBeAdded = true;
		// TO update stock quantity i.e. ExistingStockQuantity - contractQuantity
		int contractProductQuantity = contract.getQuantity();
		int productId = contract.getProductId();
		ProductBean product = productServices.searchProduct(productId);
		int stockUpdatedQuantity = product.getProductQuantity() - contractProductQuantity;

		for (ContractBean contractBean : cList) {
			if (contractBean.getContractId() == contract.getContractId()) {
				canBeAdded = false;
				break;
			}
		}
		if (canBeAdded == true) {
			cList.add(contract);
			productServices.updateQuantity(productId, stockUpdatedQuantity);
		}
		return canBeAdded;
	}

	@Override
	public List<ContractBean> getAllContract() {
		return cList;
	}

	@Override
	public boolean modifyContract(int contractId, int contractNewQuantity) {
		boolean isModified = false;
		for (ContractBean contractBean : cList) {
			if (contractBean.getContractId() == contractId) {
				isModified = true;

				int productId = contractBean.getProductId();
				ProductBean product = productServices.searchProduct(productId);
				int stockUpdatedQuantity = product.getProductQuantity()
						- (contractNewQuantity - contractBean.getQuantity());
				productServices.updateQuantity(productId, stockUpdatedQuantity);

				contractBean.setQuantity(contractNewQuantity);
				break;
			}
		}
		return isModified;
	}

}
