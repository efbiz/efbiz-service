package org.efbiz.hystrix;

import org.efbiz.feign.ServiceProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * User: Joni
 * Email: joni@efbiz.org
 * Date: 2017/3/29
 */
@Service
public class HystrixWrappedServiceProductClient implements ServiceProductClient {

    @Autowired
    private ServiceProductClient serviceProductClient;

    @Override
    @HystrixCommand(fallbackMethod = "fallBackCall")
    public String printProductInfo() {
        return serviceProductClient.printProductInfo();
    }

    public String fallBackCall() {
        return "FAILED SERVICE B CALL! - FALLING BACK";
    }
}
