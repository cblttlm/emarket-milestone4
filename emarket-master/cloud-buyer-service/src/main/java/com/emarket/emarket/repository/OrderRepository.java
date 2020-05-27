package com.emarket.emarket.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.emarket.emarket.entity.OrderEntity;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Integer>{

	public OrderEntity findById(Integer id);

	@Modifying
	@Transactional
	@Query(value = "select * from E_ORDER u where u.BUYERID=?1",nativeQuery = true)
	public List<OrderEntity> getOrderEntityList(@Param("buyid")String buyid);


//	@Modifying
//	@Transactional
//	@Query(value = "insert into E_ORDER(id,buyerid) values(?1,?2)",nativeQuery = true)
//	public List<OrderEntity> saveOrderEntityList(@Param("id") Integer id,@Param("buyerid") Integer buyerid);
}
