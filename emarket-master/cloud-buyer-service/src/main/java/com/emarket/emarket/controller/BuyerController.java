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

import com.emarket.emarket.entity.BuyerEntity;
import com.emarket.emarket.service.BuyerService;

@RestController
@RequestMapping("/api/buyer")
public class BuyerController {
	@Autowired
	private BuyerService userService;
	 /**
     * @Title: findUserById
     * <p>Description: get buyer information from userid
     * </p>
     * @param id userid
     * @return buyer information
     * @author: chenbl
     * @version 1.0
     */

	public BuyerEntity findUserById(Integer id) {
		return userService.findUserById(id);
	}
	 /**
     * @Title: findAllUsers
     * <p>Description: get all buyer information from userid
     * </p>
     * @param
     * @return buyer information list
     * @author: chenbl
     * @version 1.0
     */
	@GetMapping
	public List<BuyerEntity> findAllUsers(){

		return userService.findAllUsers();
	}
	 /**
     * @Title: regist
     * <p>Description: regist buyer information
     * </p>
     * @param user
     * @return buyer information
     * @author: chenbl
     * @version 1.0
     */
	@PostMapping
	public ResponseEntity<BuyerEntity> regist(BuyerEntity user){
		BuyerEntity userEntity = userService.createUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(userEntity);
	}

	 /**
     * @Title: update
     * <p>Description: update buyer information
     * </p>
     * @param user
     * @return buyer information
     * @author: chenbl
     * @version 1.0
     */
	@PutMapping
	public ResponseEntity<BuyerEntity> update(BuyerEntity user){
		BuyerEntity userEntity = userService.updateUser(user);
		return ResponseEntity.ok(userEntity);
	}

	 /**
     * @Title: delete
     * <p>Description: delete buyer information by id
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
