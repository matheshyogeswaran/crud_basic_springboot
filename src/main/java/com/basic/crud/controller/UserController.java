package com.basic.crud.controller;

import com.basic.crud.model.User;
import com.basic.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entities")
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getAllEntities() {
        return service.getAllEntities();
    }

    @GetMapping("/{id}")
    public User getEntityById(@PathVariable Long id) {
        return service.getEntityById(id);
    }

    @PostMapping
    public User createEntity(@RequestBody User entity) {
        return service.createEntity(entity);
    }

    @PutMapping("/{id}")
    public User updateEntity(@PathVariable Long id, @RequestBody User entity) {
        return service.updateEntity(id, entity);
    }

    @DeleteMapping("/{id}")
    public void deleteEntity(@PathVariable Long id) {
        service.deleteEntity(id);
    }
}
