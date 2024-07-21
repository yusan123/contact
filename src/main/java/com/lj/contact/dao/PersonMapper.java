package com.lj.contact.dao;

import com.lj.contact.bean.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by yusen on 2024/7/22 0:07.
 */
@Mapper
public interface PersonMapper {
    List<Person> getAll();
}
