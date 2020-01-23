package com.tyss.forestrymanagementsystemcollection.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.tyss.forestrymanagementsystemcollection.dto.BillingBean;
import com.tyss.forestrymanagementsystemcollection.dto.ContractBean;
import com.tyss.forestrymanagementsystemcollection.dto.ProductBean;
import com.tyss.forestrymanagementsystemcollection.dto.UserBean;
import com.tyss.forestrymanagementsystemcollection.factory.ForestryManagementSystemFactory;
import com.tyss.forestrymanagementsystemcollection.services.ContractServices;
import com.tyss.forestrymanagementsystemcollection.services.ProductServices;
import com.tyss.forestrymanagementsystemcollection.services.UserServices;

public class BillingDaoImpl implements BillingDao {
	static UserServices userServices = ForestryManagementSystemFactory.instanceOfCustomerServices();
	BillingBean billBean = null;
	static ProductServices productServices = ForestryManagementSystemFactory.instanceOfProductServies();
	static ContractServices contractServices = ForestryManagementSystemFactory.instanceOfContractServices();
	private static List<BillingBean> billingList = new ArrayList<BillingBean>();

	static {
		billingList.add(new BillingBean(5001, 501, "Sweta", "Prakhar", "Jatin", "Timber", 10, 20.0, 200.0, 150, 50,
				false, new Date(), "Thu Dec 26 20:59:57 IST 2019", "Wednesday"));
	}

	@Override
	public List<BillingBean> getAllBills() {
		List<BillingBean> resultList = new ArrayList<BillingBean>();

		for (BillingBean billingBean : billingList) {

			BillingBean toAddBillingBean = new BillingBean();
			ContractBean toAddContractBean = null;
			ProductBean toAddProductBean = null;

			List<ContractBean> contractList = contractServices.getAllContract();
			for (ContractBean contractBean : contractList) {

				if (contractBean.getContractId() == billingBean.getContractId()) {
					toAddContractBean = contractBean;
					toAddBillingBean.setBillId(billingBean.getBillId());
					toAddBillingBean.setContractId(billingBean.getContractId());
					toAddBillingBean.setQuantity(contractBean.getQuantity());
					toAddBillingBean.setDeliveryDate(contractBean.getDeliveryDate());
					toAddBillingBean.setDeliveryDay(contractBean.getDay());
					toAddBillingBean.setBillTimestamp(billingBean.getBillTimestamp());
					break;
				}
			}
			List<ProductBean> productList = productServices.getAllProduct();
			for (ProductBean productBean : productList) {
				if (toAddContractBean.getProductId() == productBean.getProductId()) {
					toAddBillingBean.setProductName(productBean.getProductName());
					toAddBillingBean.setPrice(productBean.getProductPrice());

					double billedAmount = productBean.getProductPrice() * toAddContractBean.getQuantity();
					toAddBillingBean.setBilledAmount(billedAmount);
					toAddBillingBean.setPaidAmount(billingBean.getPaidAmount());
					toAddBillingBean.setLeftToPay(billedAmount - billingBean.getPaidAmount());
					toAddProductBean = productBean;
					break;
				}
			}

			List<UserBean> userList = userServices.getAllUser();
			for (UserBean userBean : userList) {
				if (userBean.getUserId() == toAddProductBean.getProductOwnerId()) {
					toAddBillingBean.setOwnerName(userBean.getFullName());
				}
				if (userBean.getUserId() == toAddContractBean.getCustomerId()) {
					toAddBillingBean.setCustomerName(userBean.getFullName());
				}
				if (userBean.getUserId() == toAddContractBean.getHaulierId()) {
					toAddBillingBean.setHaulierName(userBean.getFullName());
				}

			}
			resultList.add(toAddBillingBean);
		}
		return resultList;
	}

	@Override
	public boolean updateBill(int billId, double paidAmount) {
		boolean isModified = false;
		for (BillingBean billingBean : billingList) {
			if (billingBean.getBillId() == billId) {
				isModified = true;
				billingBean.setPaidAmount(paidAmount);
				break;
			}
		}
		return isModified;
	}

	@Override
	public boolean generateBill(BillingBean bill) {
		boolean canBeAdded = true;
		for (BillingBean billingBean : billingList) {
			if (billingBean.getBillId() == bill.getBillId()) {
				canBeAdded = false;
				break;
			}
		}
		if (canBeAdded == true) {
			billingList.add(bill);
		}
		return canBeAdded;
	}

	@Override
	public boolean isContractIdPresent(int contractId) {
		boolean isPresent = false;
		for (BillingBean billingBean : billingList) {
			if (billingBean.getContractId() == contractId) {
				isPresent = true;
				break;
			}
		}
		return isPresent;
	}
}
