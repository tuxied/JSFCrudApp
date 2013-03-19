package com.facade;

import com.dao.UserDAO;
import com.model.User;

public class UserFacade {
	private UserDAO userDAO = new UserDAO();

	public User isValidLogin(String email, String password) {
		userDAO.beginTransaction();
		User user = userDAO.findUserByEmail(email);

		if (user == null || !user.getPassword().equals(password)) {
			return null;
		}

		return user;
	}
}