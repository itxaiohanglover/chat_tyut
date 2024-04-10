package com.tyut.chat.dao;


import com.tyut.chat.entity.User;
import com.tyut.chat.entity.UserSearch;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
    void insertOne(User user);
    User getOneByEmail(String email);
    void updateByUser(User user);
    User getOneById(String id);
    List<UserSearch> getByKeyword(String keyword);
    UserSearch getOnline(String id);
    List<UserSearch> getFriendList(String id);
}
