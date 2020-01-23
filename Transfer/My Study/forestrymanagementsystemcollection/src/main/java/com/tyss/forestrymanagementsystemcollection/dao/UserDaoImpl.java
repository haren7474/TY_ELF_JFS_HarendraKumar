package com.tyss.forestrymanagementsystemcollection.dao;

import java.util.ArrayList;
import java.util.List;

import com.tyss.forestrymanagementsystemcollection.dto.UserBean;

public class UserDaoImpl implements UserDao {
	private static List<UserBean> customerList = new ArrayList<UserBean>();

	static
	{
		customerList.add(new UserBean(1, "Admin", "Haren", "Center Rd", "Austin Town", "Bangalore", 560045,
				"haren@gmail.com", "9916771904", "Haren@123"));
		customerList.add(new UserBean(2, "Customer", "Sweta", "Center Rd", "Austin Town", "Bangalore", 560045,
				"sweta@gmail.com", "9916771905", "Haren@123"));
		customerList.add(new UserBean(3, "Owner", "Jatin", "Center Rd", "Austin Town", "Bangalore", 560045,
				"Jatin@gmail.com", "9916771906", "Haren@123"));
		customerList.add(new UserBean(4, "Scheduler", "Swati", "Center Rd", "Austin Town", "Bangalore", 560046,
				"Swati@gmail.com", "9916771907", "Haren@123"));
		customerList.add(new UserBean(5, "Haulier", "Prakhar", "Center Rd", "Austin Town", "Bangalore", 560046,
				"Prakhar@gmail.com", "9916771908", "Haren@123"));
	}

	@Override
	public List<UserBean> getAllUser() {
		return customerList;
	}

	@Override
	public boolean modifyUser(int userId, String email) {
		boolean isModified = false;
		for (UserBean userBean : customerList) {
			if (userBean.getUserId() == userId) {
				isModified = true;
				userBean.setEmail(email);
				break;
			}
		}
		return isModified;
	}

	@Override
	public boolean deleteUser(int userId) {
		boolean isDeleted = false;
		for (UserBean userBean : customerList) {
			if (userBean.getUserId() == userId) {
				isDeleted = true;
				customerList.remove(userBean);
				break;
			}
		}
		return isDeleted;
	}

	@Override
	public boolean addUser(UserBean user) {
		boolean canBeAdded = true;
		for (UserBean userBean : customerList) {
			if (userBean.getUserId() == user.getUserId()) {
				canBeAdded = false;
				break;
			}
		}
		if (canBeAdded == true) {
			customerList.add(user);
		}
		return canBeAdded;
	}

	@Override
	public UserBean signIn(int userId, String password) {
		UserBean keepBean = null;
		for (UserBean userBean : customerList) {
			if (userBean.getUserId() == userId && userBean.getPassword().equalsIgnoreCase(password)) {
				keepBean = userBean;
			}
		}
		return keepBean;
	}

	public String getUserName(int userId) {
		for (UserBean userBean : customerList) {
			if (userBean.getUserId() == userId) {
				return userBean.getFullName();
			}
		}
		return null;
	}

	public List<UserBean> getUserWithGivenType(String userType) {

		List<UserBean> typeSpecificList = new ArrayList<UserBean>();

		for (UserBean userBean : customerList) {
			if (userBean.getUserType().equalsIgnoreCase(userType)) {
				typeSpecificList.add(userBean);
			}
		}
		return typeSpecificList;

	}
}
