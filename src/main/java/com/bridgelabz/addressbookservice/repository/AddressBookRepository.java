package com.bridgelabz.addressbookservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.addressbookservice.model.AddressBookData;

public interface AddressBookRepository extends JpaRepository<AddressBookData, Integer>{
	
}
