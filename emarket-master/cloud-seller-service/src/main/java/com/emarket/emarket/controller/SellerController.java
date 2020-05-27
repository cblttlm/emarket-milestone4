package com.emarket.emarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emarket.emarket.entity.SellerEntity;
import com.emarket.emarket.service.SellerService;

@RestController
@RequestMapping("/api/seller")
//@CrossOrigin(origins="http://localhost:4200")
public class SellerController {
	@Autowired
	private SellerService sellerService;

	 /**
     * @Title: findUserById
     * <p>Description: get seller information from userid
     * </p>
     * @param id userid
     * @return seller information
     * @author: chenbl
     * @version 1.0
     */
	public SellerEntity findUserById(Integer id) {
		return sellerService.findUserById(id);
	}
	 /**
     * @Title: findAllUsers
     * <p>Description: get all seller information from userid
     * </p>
     * @param
     * @return seller information list
     * @author: chenbl
     * @version 1.0
     */
	@GetMapping
	public List<SellerEntity> findAllUsers(){

		return sellerService.findAllUsers();
	}

	 /**
     * @Title: regist
     * <p>Description: create seller information
     * </p>
     * @param seller
     * @return seller information
     * @author: chenbl
     * @version 1.0
     */
	public ResponseEntity<SellerEntity> regist(SellerEntity seller){
		SellerEntity sellerEntity = sellerService.createUser(seller);
		return ResponseEntity.status(HttpStatus.CREATED).body(sellerEntity);
	}

	 /**
     * @Title: update
     * <p>Description: update seller information
     * </p>
     * @param seller
     * @return seller information
     * @author: chenbl
     * @version 1.0
     */
	@PutMapping
	public ResponseEntity<SellerEntity> update(SellerEntity seller){
		SellerEntity sellerEntity = sellerService.updateUser(seller);
		return ResponseEntity.ok(sellerEntity);
	}
	 /**
     * @Title: delete
     * <p>Description: delete seller information by id
     * </p>
     * @param id
     * @return delete success information
     * @author: chenbl
     * @version 1.0
     */
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		sellerService.delete(id);
		return ResponseEntity.ok("Delete user successfully.");
	}
}
