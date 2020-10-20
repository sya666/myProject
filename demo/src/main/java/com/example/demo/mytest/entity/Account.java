package com.example.demo.mytest.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

/**
 * @author sya
 * @Description
 * @date 2020-09-25 11:13
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Account {

    String attr_acc_open_id;
    String attr_acc_open_name;

}
