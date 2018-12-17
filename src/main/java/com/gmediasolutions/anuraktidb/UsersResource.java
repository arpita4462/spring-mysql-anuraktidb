package com.gmediasolutions.anuraktidb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/users")
public class UsersResource {

    @Autowired
    UsersRepository usersRepository;

//  Get method
    @GetMapping(value = "/all")
    public List<Users> getAll() {
        return usersRepository.findAll();
    }
//	post method
    @PostMapping(value = "/createUser")
    public List<Users> persist(@RequestBody final Users users) {
        usersRepository.save(users);
        return usersRepository.findAll();
    }
}

