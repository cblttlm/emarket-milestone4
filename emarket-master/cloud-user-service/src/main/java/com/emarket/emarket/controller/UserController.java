package com.emarket.emarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.emarket.emarket.entity.UserEntity;
import com.emarket.emarket.service.UserService;

@RestController
@RequestMapping("/api/user")
//@CrossOrigin(origins="http://localhost:4200")
public class UserController {
	@Autowired
	private UserService userService;
	 /**
     * @Title: findUserById
     * <p>Description: get user information from userid
     * </p>
     * @param id userid
     * @return user information
     * @author: chenbl
     * @version 1.0
     */
	public UserEntity findUserById(Integer id) {
		return userService.findUserById(id);
	}
	 /**
     * @Title: findAllUsers
     * <p>Description: get all user information from userid
     * </p>
     * @param
     * @return user information list
     * @author: chenbl
     * @version 1.0
     */
	@GetMapping
	public List<UserEntity> findAllUsers(){

		return userService.findAllUsers();
	}
	 /**
     * @Title: regist
     * <p>Description: create user information
     * </p>
     * @param user
     * @return user information
     * @author: chenbl
     * @version 1.0
     */
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<UserEntity> regist(@RequestBody UserEntity user){
		UserEntity userEntity = userService.registUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(userEntity);
	}
	 /**
     * @Title: update
     * <p>Description: update user information
     * </p>
     * @param user
     * @return user information
     * @author: chenbl
     * @version 1.0
     */
	@PutMapping
	public ResponseEntity<UserEntity> update(UserEntity user){
		UserEntity userEntity = userService.updateUser(user);
		return ResponseEntity.ok(userEntity);
	}

	 /**
     * @Title: delete
     * <p>Description: delete user information by id
     * </p>
     * @param id
     * @return delete success information
     * @author: chenbl
     * @version 1.0
     */
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		userService.delete(id);
		return ResponseEntity.ok("Delete user successfully.");
	}
}
