package com.emarket.emarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.emarket.emarket.entity.OrderEntity;
import com.emarket.emarket.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService orderService;
	 /**
     * @Title: getOrderList
     * <p>Description: get order information list by buyid
     * </p>
     * @param
     * @return order information list
     * @author: chenbl
     * @version 1.0
     */
	@GetMapping
	public List<OrderEntity> getOrderList(@RequestParam("buyid") String buyid){
		return orderService.getOrderEntityList(buyid);
	}
	 /**
     * @Title: saveOrder
     * <p>Description: save order information
     * </p>
     * @param order
     * @return
     * @author: chenbl
     * @version 1.0
     */
	@RequestMapping(value = "/saveorder",method = RequestMethod.POST)
	@ResponseBody
	public void saveOrder(@RequestBody OrderEntity order){
		orderService.saveOrderEntity(order);
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
		orderService.delete(id);
		return ResponseEntity.ok("Delete user successfully.");
	}

}
