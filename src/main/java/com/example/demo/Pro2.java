package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pro2 {
    @RequestMapping("/")
	public String getName(){
        String studentName ="IamNeo";
        return "Welcome "+studentName+"!";
	}
}