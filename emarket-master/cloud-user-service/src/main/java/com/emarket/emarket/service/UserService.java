package com.emarket.emarket.service;

import java.util.List;

import com.emarket.emarket.entity.UserEntity;

public interface UserService {

	 /**
     * @Title: findUserById
     * <p>Description: get user information from userid
     * </p>
     * @param id userid
     * @return seller information
     * @author: chenbl
     * @version 1.0
     */
	public List<UserEntity> findAllUsers();

	 /**
     * @Title: findAllUsers
     * <p>Description: get all user information from userid
     * </p>
     * @param id
     * @return user information list
     * @author: chenbl
     * @version 1.0
     */
	public UserEntity findUserById(Integer id);

	 /**
     * @Title: regist
     * <p>Description: create user information
     * </p>
     * @param user
     * @return user information
     * @author: chenbl
     * @version 1.0
     */
	public UserEntity registUser(UserEntity user);

	 /**
     * @Title: update
     * <p>Description: update user information
     * </p>
     * @param user
     * @return user information
     * @author: chenbl
     * @version 1.0
     */
	public UserEntity updateUser(UserEntity user);


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
