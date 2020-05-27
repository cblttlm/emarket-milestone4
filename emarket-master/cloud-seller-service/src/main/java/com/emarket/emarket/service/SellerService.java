package com.emarket.emarket.service;

import java.util.List;

import com.emarket.emarket.entity.SellerEntity;

public interface SellerService {

	 /**
     * @Title: findAllUsers
     * <p>Description: get all seller information from userid
     * </p>
     * @param
     * @return seller information list
     * @author: chenbl
     * @version 1.0
     */
	public List<SellerEntity> findAllUsers();

	 /**
     * @Title: findUserById
     * <p>Description: get seller information from userid
     * </p>
     * @param id userid
     * @return seller information
     * @author: chenbl
     * @version 1.0
     */
	public SellerEntity findUserById(Integer id);

	 /**
     * @Title: createUser
     * <p>Description: create seller information
     * </p>
     * @param user
     * @return seller information
     * @author: chenbl
     * @version 1.0
     */
	public SellerEntity createUser(SellerEntity user);

	 /**
     * @Title: updateUser
     * <p>Description: update seller information
     * </p>
     * @param user
     * @return seller information
     * @author: chenbl
     * @version 1.0
     */
	public SellerEntity updateUser(SellerEntity user);

	 /**
     * @Title: delete
     * <p>Description: delete seller information by id
     * </p>
     * @param id
     * @return delete success information
     * @author: chenbl
     * @version 1.0
     */
	public void delete(Integer id);
}
