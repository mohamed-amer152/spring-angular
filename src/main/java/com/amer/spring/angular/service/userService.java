package com.amer.spring.angular.service;

import java.util.List;

import com.amer.spring.angular.entity.Users;

public interface userService {

	Users save ( Users u ) ;
	
	List<Users> findall() ;
	
	Users findByuserEmail (String userEmail ) ;
	
	List<Users> delete ( int UserId) ;
	
}
