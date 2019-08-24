package com.biter.lekima.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangdong
 * @date 2019-08-11
 */
@RestController
public class PortalController {

    @Value("${server.port}")
    private int port;

    @RequestMapping("/")
    public String index() {
<<<<<<< Updated upstream
        return "hello lekima-admin service!";
=======
        return "hello lekima-admin service. port is " + port;
>>>>>>> Stashed changes
    }

}
