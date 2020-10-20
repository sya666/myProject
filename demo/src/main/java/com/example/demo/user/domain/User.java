package com.example.demo.user.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author sya
 * @Description
 * @date 2020-08-31 17:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @TableId(type = IdType.AUTO)
    private Integer userId;
    private String userName;
    private Integer userSex;
    private Integer userAge;
    private LocalDate userBirthday;
    private LocalDateTime updateTime;
    private LocalDateTime createTime;

    public User(Integer userId, String userName, LocalDate userBirthday) {
        this.userId = userId;
        this.userName = userName;
        this.userBirthday = userBirthday;
    }
}
