package com.personal.expensetracker.service;

import java.util.List;

import com.personal.expensetracker.model.User;

public interface UserService {
	void addUser(User u);
	User findByEmailAndPassword(String email, String password);
	void editUser(User u);
	void deleteUser(long id);
	User getUserById(long id);
	List<User> getAllUsers();
}
