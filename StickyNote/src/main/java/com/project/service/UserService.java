package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.dao.UserDao;
import com.project.entity.StickyEntity;
import com.project.entity.UserEntity;
import com.project.exception.UserServiceException;

@Component
public class UserService {

	@Autowired
	private UserDao userDao;

	/* --------------------Registration-------------------------- */
	public void register(UserEntity user) {

		if (userDao.isUserPresent(user.getEmail())) { // User Present Or NOT by Email
			throw new UserServiceException("User already registered!");
		} else
			userDao.save(user);
	}

	/* --------------------Login-------------------------- */
	public UserEntity login(String email, String password) {
		if (userDao.isUserPresent1(email, password)) {
			return userDao.fetch(email);
		} else
			throw new UserServiceException("Email/Password incorrect!");
	}

}






/*
 * --------------------Fetch Sticky-------------------------- public
 * List<StickyEntity> checkStickey() { if (userDao.isStickeyPresent()) return
 * userDao.fetchStickeys(); else throw new
 * UserServiceException("Stickeys not Present"); }
 */