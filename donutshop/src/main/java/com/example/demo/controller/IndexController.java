package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@RestController
//@SpringBootApplication
@Controller
public class IndexController {

//    @GetMapping("/")
//    String home() {
//        return "Hello World!";
//    }

    @GetMapping("/")
	public String getIndex() {
		return "index";
	}

}