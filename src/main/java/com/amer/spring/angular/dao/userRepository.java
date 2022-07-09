package com.amer.spring.angular.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amer.spring.angular.entity.Users;

public interface userRepository extends JpaRepository<Users, Integer> {
	
	Users findByMail (String userEmail ) ;

}
