package com.example.kdt_coin.contact.repository;

import com.example.kdt_coin.mapper.ContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class ContactRepository {
    @Autowired
    ContactMapper cm;

    public int insertContact(HashMap<String, String> contact) {
        return cm.insertContact(contact);
    }
    public int insertSubscribe(HashMap<String, String> subscribe) {
        return cm.insertSubscribe(subscribe);
    }
}
