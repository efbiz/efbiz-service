package org.efbiz.controller;

import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * User: Joni
 * Email: joni@efbiz.org
 * Date: 2017/3/29
 */
@RefreshScope
@RestController
@Api
public class ProductServiceController {

    @Autowired
    DiscoveryClient discoveryClient;

    @Value("${msg:unknown}")
    private String msg;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printProductInfo() {
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        return serviceInstance.getServiceId() + " (" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + ")" + "===>Say " + msg;
    }
}

