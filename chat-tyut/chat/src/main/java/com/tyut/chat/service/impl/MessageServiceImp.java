package com.tyut.chat.service.impl;

import com.tyut.chat.dao.MessageDao;
import com.tyut.chat.entity.Friend;
import com.tyut.chat.entity.Message;
import com.tyut.chat.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImp implements MessageService {

    @Autowired
    private MessageDao messageDao;

    @Override
    public void insert(Message message) {
        messageDao.insert(message);
    }

    @Override
    public List<Message> getMessages(Friend friend) {
        return messageDao.getMessages(friend);
    }

    @Override
    public void deleteByMeAndFriend(Friend friend) {
        messageDao.deleteByMeAndFriend(friend);
    }
}
