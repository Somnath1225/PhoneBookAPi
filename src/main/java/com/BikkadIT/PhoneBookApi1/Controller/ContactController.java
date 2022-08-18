package com.BikkadIT.PhoneBookApi1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


import com.BikkadIT.PhoneBookApi1.Model.Contact;
import com.BikkadIT.PhoneBookApi1.Service.ContactService;

@RestController
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	
	
}
