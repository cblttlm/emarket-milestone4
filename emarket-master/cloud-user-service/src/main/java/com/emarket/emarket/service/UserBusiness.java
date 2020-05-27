package com.emarket.emarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.emarket.emarket.entity.UserEntity;
import com.emarket.emarket.repository.UserRepository;

@Service
public class UserBusiness implements UserService{
	@Autowired
	private UserRepository userRepository;

	public Page<UserEntity> findAll(int page, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}
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
		return userRepository.findById(id);
	}
	 /**
     * @Title: findAllUsers
     * <p>Description: get all user information from userid
     * </p>
     * @param id
     * @return user information list
     * @author: chenbl
     * @version 1.0
     */
	public List<UserEntity> findAllUsers(){
		return userRepository.findAll();
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
	public UserEntity registUser(UserEntity user){
		return userRepository.saveAndFlush(user);
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
	public UserEntity updateUser(UserEntity user) {
		return userRepository.save(user);
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
	public void delete(Integer id) {
		userRepository.delete(id);
	}
}
