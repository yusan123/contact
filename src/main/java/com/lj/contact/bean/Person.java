package com.lj.contact.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by yusen on 2024/7/21 23:59.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private Integer id;
    private String personName;
    private String gender;
//    private LocalDate birthday;
    private Date birthday;
    private String address;
    private String company;
    private String email;
    private String avatar;
    private String ringtones;
    private String status;
    private String remark;
    private Date inputTime;
    private Date updateTime;
}
