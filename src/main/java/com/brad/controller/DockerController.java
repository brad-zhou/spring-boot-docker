package com.brad.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoubd
 * @Date 2018/11/19 16:51
 * @@Description
 */
@RestController
public class DockerController {
    @GetMapping("/")
    public String index() {
        return "Hello Docker!";
    }
}
