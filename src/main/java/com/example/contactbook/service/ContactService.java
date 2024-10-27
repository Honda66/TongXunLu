package com.example.contactbook.service;

import com.example.contactbook.model.Contact;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

public interface ContactService {
    List<Contact> getAllContacts();
    Optional<Contact> getContactById(Long id);
    @Transactional
    Contact createContact(Contact contact);
    @Transactional
    Contact updateContact(Long id, Contact updatedContact);
    @Transactional
    void deleteContact(Long id);
}