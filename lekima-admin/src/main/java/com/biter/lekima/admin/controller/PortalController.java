package com.biter.lekima.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangdong
 * @date 2019-08-11
 */
@RestController
public class PortalController {

    @RequestMapping("/")
    public String index() {
        // develop编辑
        // develop第二次编辑
        return "hello lekima-admin service!";
    }

}
