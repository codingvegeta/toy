package com.example.kdt_coin.contact.service;

import com.example.kdt_coin.contact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ContactService {
    @Autowired
    ContactRepository cr;

    public int insertContact(HashMap<String, String> contact) {
        return cr.insertContact(contact);
    }
    public int insertSubscribe(HashMap<String, String> subscribe) {
        return cr.insertSubscribe(subscribe);
    }
}
