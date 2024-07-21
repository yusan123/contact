package com.lj.contact.controller;

import com.lj.contact.bean.Result;
import com.lj.contact.dao.PersonMapper;
import com.lj.contact.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yusen on 2024/7/22 0:04.
 */
@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/list")
    public Result getAll() {
        return Result.success(personService.getAll());
    }

}
