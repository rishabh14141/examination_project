package com.example.examination.Controller;

import com.example.examination.Model.Users;
import com.example.examination.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @PostMapping
    public Users createUser(@RequestBody Users user) {
        return userRepository.save(user);
    }
}
