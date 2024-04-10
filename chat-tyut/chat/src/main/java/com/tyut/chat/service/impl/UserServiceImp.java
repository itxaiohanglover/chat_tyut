package com.tyut.chat.service.impl;

import com.tyut.chat.dao.UserDao;
import com.tyut.chat.entity.User;
import com.tyut.chat.entity.UserSearch;
import com.tyut.chat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
 public class UserServiceImp implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void insertOne(User user) {
        userDao.insertOne(user);
    }

    @Override
    public User getOneByEmail(String email) {
        return userDao.getOneByEmail(email);
    }

    @Override
    public void updateByUser(User user) {
        userDao.updateByUser(user);
    }

    @Override
    public User getOneById(String id) {
        return userDao.getOneById(id);
    }

    @Override
    public List<UserSearch> getByKeyword(String keyword) {
        return userDao.getByKeyword(keyword);
    }


    @Override
    public UserSearch getOnline(String id) {
        return userDao.getOnline(id);
    }

    @Override
    public List<UserSearch> getFriendList(String id) {
        return userDao.getFriendList(id);
    }
}
