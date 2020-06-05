package com.sya.admin.controller;

import com.sya.admin.config.Config;
import com.sya.admin.controller.AdminRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author sya
 * @Description
 * @date 2020-06-01 15:33
 */
@RestController
@RequestMapping("/admin")
public class AdminController{

    @Autowired
    private LoadBalancerClient loadBalancer;
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private AdminRemote adminRemote;
    @Autowired
    private Config config;

    /**
     * 从所有服务中选择一个服务（轮询）
     */
    @RequestMapping("/discover")
    public String discover() {
        System.out.println(String.format("my name is:%s,pwd is:%s",config.getName(),config.getPwd()));
        return adminRemote.getIndex();
//        ServiceInstance serviceInstance = loadBalancer.choose("");
//        System.out.println("服务地址：" + serviceInstance.getUri());
//        System.out.println("服务名称：" + serviceInstance.getServiceId());
//
//        String callServiceResult = new RestTemplate().getForObject(serviceInstance.getUri().toString() + "/member/index", String.class);
//        System.out.println(callServiceResult);
//        return callServiceResult;



    }
}
