package com.bah.msd.mcc.repository;

import org.springframework.data.repository.CrudRepository;

import com.bah.msd.mcc.pojos.Customers;

public interface CustomersRepository extends CrudRepository<Customers, Long> {

}