package com.bridgelabz.addressbookservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bridgelabz.addressbookservice.dto.AddressBookDTO;

import lombok.Data;
@Entity
@Table(name="addressbook_table")
public @Data class AddressBookData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="address_id")
	private int addressId;

	private String name;
	
    private String address;
	
	private String city;

    private String state;
	
    private String zip;
	
    private String phoneNumber;
	

	public AddressBookData(AddressBookDTO addressbookDTO) {
		this.updateAddressBook(addressbookDTO);
	}
	public void updateAddressBook(AddressBookDTO addressbookDTO) {
		this.name = addressbookDTO.name;
		this.address = addressbookDTO.address;
		this.city = addressbookDTO.city;
		this.state = addressbookDTO.state;
		this.zip = addressbookDTO.zip;
		this.phoneNumber = addressbookDTO.phoneNumber;
	}
	public AddressBookData()
	{
		
	}
	
}
