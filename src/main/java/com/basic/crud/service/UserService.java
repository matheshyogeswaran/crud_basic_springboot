package com.basic.crud.service;

import com.basic.crud.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllEntities();
    User getEntityById(Long id);
    User createEntity(User entity);
    User updateEntity(Long id, User entity);
    void deleteEntity(Long id);
}
