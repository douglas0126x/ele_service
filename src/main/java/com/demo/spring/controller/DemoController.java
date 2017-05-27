package com.demo.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * spring mvc controller test
 * @author yaoxj
 * @time 2017年5月27日上午9:53:29
 */
@Controller
public class DemoController {

    @RequestMapping("/demo")
    public String index(){
        return "demo";
    }
}