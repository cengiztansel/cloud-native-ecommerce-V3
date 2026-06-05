package com.quantumshop.userservice.controller;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.quantumshop.userservice.model.UserEntity;
import com.quantumshop.userservice.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<UserEntity> all() {
        return service.findAll();
    }

    @PostMapping
    public UserEntity create(
            @RequestBody UserEntity user) {

        return service.save(user);
    }
}
