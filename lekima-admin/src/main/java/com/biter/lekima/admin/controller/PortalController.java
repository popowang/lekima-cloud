package com.biter.lekima.admin.controller;

import com.biter.lekima.admin.dba.repository.BoxInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private BoxInfoMapper boxInfoMapper;

    @RequestMapping("/")
    public String index() {
        return "hello lekima-admin service. port is " + port;
    }

    @RequestMapping("/showBox")
    public String showBoxInfo() {
        Integer count = boxInfoMapper.countBox();
        return String.valueOf(count);
    }

}
