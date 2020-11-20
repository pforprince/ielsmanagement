package com.example.ielts.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ielts.models.User;
import com.example.ielts.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User saveUser(User user) {
		User returnedUser = null;
		try {
			this.userRepository.save(user);
			returnedUser = user;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnedUser;
	}

	public User updateUser(User user) {
		User updatedUser = null;
		try {
			this.userRepository.save(user);
			updatedUser = user;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return updatedUser;
	}

	public boolean deleteUser(User user) {
		boolean isDeleted = false;
		try {
			this.userRepository.delete(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isDeleted;
	}
	// The below method is used to fetch the student or users of a particular
	// institue
//	public getUsersByInstitue() {
//		
//	}
}
