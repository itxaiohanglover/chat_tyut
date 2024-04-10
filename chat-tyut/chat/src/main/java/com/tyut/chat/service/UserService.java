package com.tyut.chat.service;

import com.tyut.chat.entity.User;
import com.tyut.chat.entity.UserSearch;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    void insertOne(User user);
    User getOneByEmail(String email);
    void updateByUser(User user);
    User getOneById(String id);
    List<UserSearch> getByKeyword(String keyword);
    UserSearch getOnline(String id);
    List<UserSearch> getFriendList(String id);
}
