package com.bridgelabz.addressbookservice.services;

import java.util.List;

import com.bridgelabz.addressbookservice.dto.AddressBookDTO;
import com.bridgelabz.addressbookservice.model.AddressBookData;

public interface IAddressBookService {
	List<AddressBookData> getAddressBookDataData();
	AddressBookData getAddressBookDataDataById(int id);
	AddressBookData createAddressBookDataData(AddressBookDTO addressBookDTO);
	AddressBookData updatedAddressBookDataData(AddressBookDTO addressBookDTO);
	void deleteAddressBookDataData(int id);
}
