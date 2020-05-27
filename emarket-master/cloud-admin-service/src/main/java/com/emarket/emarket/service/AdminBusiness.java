package com.emarket.emarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emarket.emarket.entity.AdminEntity;
import com.emarket.emarket.repository.AdminRepository;

@Service
public class AdminBusiness implements AdminService{
	@Autowired
	private AdminRepository adminRepository;

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
		return adminRepository.findById(id);
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
	public List<AdminEntity> findAllUsers(){
		return adminRepository.findAll();
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
	public AdminEntity registUser(AdminEntity user){
		return adminRepository.saveAndFlush(user);
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
	public AdminEntity update(AdminEntity user) {
		return adminRepository.save(user);
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
		adminRepository.delete(id);
	}
}
