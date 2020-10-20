package com.example.demo.user.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author sya
 * @Description
 * @date 2020-08-31 17:01
 */
@RestController
public class UserController {


    @RequestMapping("/export")

    @ResponseBody

    public void export(HttpServletResponse response) {
    }

}
