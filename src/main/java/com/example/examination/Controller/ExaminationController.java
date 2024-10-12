package com.example.examination.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/rishabh/learn/test")
public class ExaminationController {
    @GetMapping("")
    public String test() {
           return "hello world!!";
    }

    @PostMapping("")
    public String postTest() {
        return "hello world!!";
    }
}
