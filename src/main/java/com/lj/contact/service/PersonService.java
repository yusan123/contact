package com.lj.contact.service;

import com.lj.contact.bean.Person;
import com.lj.contact.dao.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by yusen on 2024/7/22 0:11.
 */
@Service
public class PersonService {
    @Autowired
    private PersonMapper personMapper;

    public List<Person> getAll() {
        return personMapper.getAll();
    }
}
