package com.example.examination.Service;

import com.example.examination.Manager.TestManager;
import com.example.examination.Model.Tests;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestManager testManager;

    public Tests createTest(Tests test) {
        return testManager.createTest(test);
    }

    public Tests updateTest(Tests test) {
        return testManager.updateTest(test);
    }
}
