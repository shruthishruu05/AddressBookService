package com.bridgelabz.addressbookservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookservice.dto.AddressBookDTO;
import com.bridgelabz.addressbookservice.exceptions.AddressBookException;
import com.bridgelabz.addressbookservice.model.AddressBookData;
import com.bridgelabz.addressbookservice.repository.AddressBookRepository;

@Service
public class AddressBookService implements IAddressBookService {
	
	@Autowired
	AddressBookRepository addressBookRepository;
	
	List<AddressBookData> addressDataList = new ArrayList<>();
	@Override
	public List<AddressBookData> getAddressBookDataData() {
		return addressBookRepository.findAll();
	}

	@Override
	public AddressBookData getAddressBookDataDataById(int contactId) {
		return addressBookRepository.findById(contactId)	
				.orElseThrow(() ->new AddressBookException("Address Book not found!"));
	}

	@Override
	public AddressBookData createAddressBookDataData(AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData=null;
		addressBookData = new AddressBookData(addressBookDTO);
		
		return addressBookRepository.save(addressBookData);	
	}

	@Override
	public AddressBookData updatedAddressBookDataData(int id,AddressBookDTO addressBookDTO) {
		
		AddressBookData addressBookData=this.getAddressBookDataDataById(id);
		addressBookData.updateAddressBook(addressBookDTO);
		return addressBookRepository.save(addressBookData);
	}

	@Override
	public void deleteAddressBookDataData(int id) {
		AddressBookData addressBookData=this.getAddressBookDataDataById(id);
		
		addressBookRepository.delete(addressBookData);
	}

}
