package com.emalcoding.springBootREST.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emalcoding.springBootREST.model.shipping;

public interface shippingRepository extends JpaRepository<shipping, Long> {

}
