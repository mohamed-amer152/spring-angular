package com.amer.spring.angular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amer.spring.angular.entity.Users;
import com.amer.spring.angular.service.userServiceImpl;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class userController {
	
	
	@Autowired
	private userServiceImpl service ;
	
	// saveing user to db or update
	@PostMapping("/save")
	public Users save(@RequestBody Users users)
	{
		service.save(users);
		return  users;
	}
	
	
	// getting all the user list 
	@GetMapping("/list")
	public List<Users> findall()
	{
		return service.findall() ;
	}
	
	
	// getting user based on useremail 
	@GetMapping("/find/{userEmail}")
	public Users find(@PathVariable String userEmail )
	{
		return service.findByuserEmail(userEmail);
	}
	
	
	
	// delete user based on id 
		@DeleteMapping("/delete/{UserId}")
		public List<Users> delete(@PathVariable int UserId )
		{
			return service.delete(UserId);
		}
		
		
	
	
	
	

}
