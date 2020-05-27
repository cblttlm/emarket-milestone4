package com.emarket.emarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emarket.emarket.entity.BuyerEntity;
import com.emarket.emarket.repository.BuyerRepository;

@Service
public class BuyerBusiness implements BuyerService{
	@Autowired
	private BuyerRepository userRepository;
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
		return userRepository.findById(id);
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
	public List<BuyerEntity> findAllUsers(){
		return userRepository.findAll();
	}

	 /**
     * @Title: createUser
     * <p>Description: create buyer information
     * </p>
     * @param user
     * @return buyer information
     * @author: chenbl
     * @version 1.0
     */
	public BuyerEntity createUser(BuyerEntity user){
		return userRepository.saveAndFlush(user);
	}

	/**
     * @Title: updateUser
     * <p>Description: update buyer information
     * </p>
     * @param user
     * @return buyer information
     * @author: chenbl
     * @version 1.0
     */
	public BuyerEntity updateUser(BuyerEntity user) {
		return userRepository.save(user);
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

	public void delete(Integer id) {
		userRepository.delete(id);
	}
}
