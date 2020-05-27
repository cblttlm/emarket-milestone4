package com.emarket.emarket.service;

import java.util.List;

import com.emarket.emarket.entity.AdminEntity;

public interface AdminService {


	 /**
     * @Title: findAllUsers
     * <p>Description: get all user information from userid
     * </p>
     * @param
     * @return user information list
     * @author: chenbl
     * @version 1.0
     */
	public List<AdminEntity> findAllUsers();

	 /**
     * @Title: findUserById
     * <p>Description: get user information from userid
     * </p>
     * @param id userid
     * @return user information
     * @author: chenbl
     * @version 1.0
     */
	public AdminEntity findUserById(Integer id);

	 /**
     * @Title: regist
     * <p>Description: create user information
     * </p>
     * @param user
     * @return user information
     * @author: chenbl
     * @version 1.0
     */
	public AdminEntity registUser(AdminEntity user);

	 /**
     * @Title: update
     * <p>Description: update user information
     * </p>
     * @param user
     * @return user information
     * @author: chenbl
     * @version 1.0
     */
	public AdminEntity update(AdminEntity user);


	 /**
     * @Title: delete
     * <p>Description: delete user information by id
     * </p>
     * @param id
     * @return delete success information
     * @author: chenbl
     * @version 1.0
     */
	public void delete(Integer id);
}
