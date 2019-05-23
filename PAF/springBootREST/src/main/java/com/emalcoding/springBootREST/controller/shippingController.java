package com.emalcoding.springBootREST.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emalcoding.springBootREST.dao.shippingDao;
import com.emalcoding.springBootREST.model.shipping;

@RestController
@RequestMapping("/company")
public class shippingController {
	
	@Autowired
	shippingDao ShippingDao;
	
	/*to save an shipping*/
	@PostMapping("/shippings")
	public shipping createshipping(@Valid @RequestBody shipping ship) {
		return ShippingDao.save(ship);
	}

	/*get all shippings*/
	@GetMapping("/shippings")
	public List<shipping> getAllshipping(){
		return ShippingDao.findAll();
	}
	
	/*get shipping by shipid*/
	@GetMapping("/shippings/{id}")
	public ResponseEntity<shipping> getshippingById(@PathVariable(value="id") Long shipid) {
		
		shipping ship=ShippingDao.findOne(shipid);
		
		if(ship==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(ship);
		}

	/*update an shipping by shipid*/
	@PutMapping("/shippings/{id}")
	public ResponseEntity<shipping> updateshipping(@PathVariable(value="id") Long shipid,@Valid @RequestBody shipping shipDetails){
		
		shipping ship=ShippingDao.findOne(shipid);
		if(ship==null) {
			return ResponseEntity.notFound().build();
		}
		ship.setName(shipDetails.getName());
		ship.setAddress(shipDetails.getAddress());
		ship.setDate(shipDetails.getDate());
		ship.setMail(shipDetails.getMail());
		ship.setPhonenum(shipDetails.getPhonenum());
		
		shipping updateshipping=ShippingDao.save(ship);
		return ResponseEntity.ok().body(updateshipping);
	}
	
	/*Delete an shipping*/
	@DeleteMapping("/shippings/{id}")
	public ResponseEntity<shipping> deleteshipping(@PathVariable(value="id") Long shipid){
		
		shipping ship=ShippingDao.findOne(shipid);
		if(ship==null) {
			return ResponseEntity.notFound().build();
		}
		ShippingDao.delete(ship);
		
		return ResponseEntity.ok().build();
	}
	
	
	
}
