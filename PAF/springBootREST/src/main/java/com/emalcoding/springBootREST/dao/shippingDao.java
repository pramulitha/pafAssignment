package com.emalcoding.springBootREST.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.emalcoding.springBootREST.model.shipping;
import com.emalcoding.springBootREST.repository.shippingRepository;

public class shippingDao {
	
	@Autowired
	shippingRepository ShippingRepository;
	
	public shipping save(shipping ship) {
		return ShippingRepository.save(ship);
	}
	
	public List<shipping> findAll(){
		return ShippingRepository.findAll();
	}
	
	public shipping findOne(Long shipid) {
		return ShippingRepository.findOne(shipid);
		
	}
	
	public void delete(shipping ship) {
		ShippingRepository.delete(ship);
	}

}