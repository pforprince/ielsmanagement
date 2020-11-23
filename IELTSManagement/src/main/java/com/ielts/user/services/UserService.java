package com.ielts.user.services;

import com.ielts.user.models.User;
import com.ielts.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Transactional
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

	@Transactional
	public User updateUser(User user) {
		User updatedUser = null;
		try {
			updatedUser=this.userRepository.save(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return updatedUser;
	}

	@Transactional
	public boolean deleteUser(User user) {
		boolean isDeleted = false;
		try {
			this.userRepository.delete(user);
			isDeleted=true;
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
