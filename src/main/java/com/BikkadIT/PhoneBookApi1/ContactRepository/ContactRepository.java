package com.BikkadIT.PhoneBookApi1.ContactRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.PhoneBookApi1.Model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
