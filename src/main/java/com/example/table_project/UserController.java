package com.example.table_project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/getting")
    public List<User> getALLUsers(){
        return (List<User>)
        userRepository.findAll();
    }
@PostMapping("/posting")
 public User creatUser(@RequestBody User user)
 {
    return  userRepository.save(user);
 }


    }
    

