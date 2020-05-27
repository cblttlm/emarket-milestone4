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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emarket.emarket.entity.AdminEntity;
import com.emarket.emarket.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	 /**
     * @Title: findUserById
     * <p>Description: get user information from userid
     * </p>
     * @param id userid
     * @return user information
     * @author: chenbl
     * @version 1.0
     */
	public AdminEntity findUserById(Integer id) {
		return adminService.findUserById(id);
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
	public List<AdminEntity> findAllUsers(){

		return adminService.findAllUsers();
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
	@PostMapping
	public ResponseEntity<AdminEntity> regist(AdminEntity user){
		AdminEntity userEntity = adminService.registUser(user);
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
	public ResponseEntity<AdminEntity> update(AdminEntity user){
		AdminEntity userEntity = adminService.update(user);
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
		adminService.delete(id);
		return ResponseEntity.ok("Delete user successfully.");
	}
}
