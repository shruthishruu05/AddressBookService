package com.bridgelabz.addressbookservice.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import lombok.ToString;

public @ToString class AddressBookDTO {
	
	@NotEmpty(message="name cannot be null")
	@Pattern(regexp = "^[A-Z][a-zA-Z]{2,}([ ][A-Z][a-zA-Z]*)?$",message ="firstName Invalid")
    public String name;
	
	@Pattern(regexp = "[a-zA-Z]{3,}[\s](([a-zA-Z]{3,})+)",message ="Address Invalid")
    public String address;
	
	@Pattern(regexp = "^[A-Z|a-z]{3,}$",message ="city Invalid")
    public String city;
	
	@Pattern(regexp = "^[A-Z|a-z]{3,}$",message ="state Invalid")
    public String state;
	
	@Pattern(regexp = "^([0-9]{3})([\s]?)([0-9]{3})$",message ="zip code Invalid")
    public String zip;
	
	@Pattern(regexp = "^(([+]?[1-9][0-9])?)([6-9][0-9]{9})$",message ="Phone number Invalid")
    public String phoneNumber;
	
}
