package com.bridgelabz.addressbookservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class AddressBookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressBookServiceApplication.class, args);
		log.info("Addrress book app started");
	}

}
