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
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MemberInfo {

    List<Account> accountList;
    String memberId;
    String openId;
    String pushStatus;
}
