package com.sya.config.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sya
 * @Description
 * @date 2020-06-01 14:45
 */
@RestController
@RequestMapping("/member/")
public class MemberController {

    @RequestMapping("index")
    public String getIndex(){
        return "Hello World member2";
    }
}
