package com.tyut.chat.service.impl;

import com.tyut.chat.dao.FriendDao;
import com.tyut.chat.entity.Friend;
import com.tyut.chat.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendServiceImp implements FriendService {

    @Autowired
    private FriendDao friendDao;

    @Override
    public List<Integer> findMyFriends(String id) {
        return friendDao.findMyFriends(id);
    }

    @Override
    public void insert(Friend friend) {
        friendDao.insert(friend);
    }

    @Override
    public Friend getByMeAndFriend(Friend friend) {
        return friendDao.getByMeAndFriend(friend);
    }

    @Override
    public void deleteFriend(Friend friend) {
        friendDao.deleteFriend(friend);
    }
}
