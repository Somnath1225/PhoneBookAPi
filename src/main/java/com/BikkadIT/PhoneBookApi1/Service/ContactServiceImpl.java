package com.BikkadIT.PhoneBookApi1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.PhoneBookApi1.ContactRepository.ContactRepository;
import com.BikkadIT.PhoneBookApi1.Controller.ContactController;
import com.BikkadIT.PhoneBookApi1.Model.Contact;

;
@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;
	
	
}
