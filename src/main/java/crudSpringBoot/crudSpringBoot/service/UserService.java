package crudSpringBoot.crudSpringBoot.service;


import crudSpringBoot.crudSpringBoot.entity.User;

public class UserService {
    public User createUser() {

        User user = new User("Esteban",  "Garcia", "Gonzalez", "XXXXXXXXXXXXXXXXXXXXXXX", "1234");
    return user;
    }
}
