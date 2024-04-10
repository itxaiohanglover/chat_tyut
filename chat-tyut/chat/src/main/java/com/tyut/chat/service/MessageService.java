package com.tyut.chat.service;

import com.tyut.chat.entity.Friend;
import com.tyut.chat.entity.Message;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MessageService {
    void insert(Message message);
    List<Message> getMessages(Friend friend);
    void deleteByMeAndFriend(Friend friend);
}
