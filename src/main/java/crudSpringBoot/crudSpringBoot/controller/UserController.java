package crudSpringBoot.crudSpringBoot.controller;

import crudSpringBoot.crudSpringBoot.entity.User;
import crudSpringBoot.crudSpringBoot.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService = new UserService();

    @GetMapping("/")
    public User createUser() {
        return userService.createUser();
    }
}
