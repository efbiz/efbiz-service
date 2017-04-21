package org.efbiz.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User: Joni
 * Email: joni@efbiz.org
 * Date: 2017/3/29
 */
@FeignClient(name = "products")
public interface ServiceProductClient {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String printProductInfo();
}
