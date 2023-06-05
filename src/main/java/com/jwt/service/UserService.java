package com.jwt.service;

import com.jwt.dao.RoleDao;
import com.jwt.dao.UserDao;
import com.jwt.entity.Role;
import com.jwt.entity.User;
import org.hibernate.loader.custom.RootReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public User registerNewUser(User user) {
        return userDao.registerNewUser(user);
    }

    public User changeUserRole(String userName, String roleName) {
        return userDao.changeUserRole( userName,  roleName);
    }
}
