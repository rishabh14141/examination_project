package com.example.examination.Controller;

import com.example.examination.Dto.Request.CreateTestDto;
import com.example.examination.Model.Tests;
import com.example.examination.Repository.TestRepository;
import com.example.examination.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping("")
    public Tests createTest(@RequestBody Tests test) {
        return testService.createTest(test);
    }

    @PutMapping("")
    public Tests updateTest(@RequestBody Tests test) {
        return testService.updateTest(test);
    }
}
