package com.amer.spring.angular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amer.spring.angular.dao.userRepository;
import com.amer.spring.angular.entity.Users;

@Service
public class userServiceImpl implements userService {

	@Autowired
	private userRepository repo ;
	
	@Override
	public Users save(Users u) {
		// TODO Auto-generated method stub
		repo.save(u);
		return u;
	}

	@Override
	public List<Users> findall() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Users findByuserEmail(String userEmail) {
		// TODO Auto-generated method stub
		return repo.findByMail(userEmail);
	}

	@Override
	public List<Users> delete(int UserId) {
		// TODO Auto-generated method stub
		repo.deleteById(UserId);
		return repo.findAll();
	}

}
