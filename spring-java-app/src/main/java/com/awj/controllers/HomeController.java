package com.awj.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Radu on 14/01/16.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    @CrossOrigin
    public String index(){
        return "Hello, Universe!:)";
    }
}
