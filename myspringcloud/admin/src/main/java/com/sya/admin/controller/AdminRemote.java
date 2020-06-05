package com.sya.admin.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sya
 * @Description
 * @date 2020-06-01 17:29
 */
@FeignClient(name= "myspringcloud-member")
public interface AdminRemote {

    @RequestMapping(value = "/member/index")
    public String getIndex() ;
}
