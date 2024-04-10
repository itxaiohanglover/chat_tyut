package com.tyut.chat.dao;



import com.tyut.chat.entity.Friend;
import com.tyut.chat.entity.Message;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MessageDao {
    List<Message> getMessages(Friend friend);
    void insert(Message message);
    void deleteByMeAndFriend(Friend friend);
}
