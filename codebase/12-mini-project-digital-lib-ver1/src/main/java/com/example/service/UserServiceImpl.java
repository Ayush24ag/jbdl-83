package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.entity.Transaction;
import com.example.entity.User;
@Component
public class UserServiceImpl implements UserService {
	@Autowired
	private com.example.repository.UserRepository userRepo;
	public User addNewUser(User u) {
		User user=userRepo.save(u);
		return user;
	}

	@Override
	public boolean checkAvailability(int bookId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Transaction> chkTransactionByUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
