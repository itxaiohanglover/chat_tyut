package com.tyut.chat.service.impl;

import com.tyut.chat.dao.GroupMsgDao;
import com.tyut.chat.entity.GroupMsg;
import com.tyut.chat.entity.GroupMsgQuery;
import com.tyut.chat.service.GroupMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupMsgServiceImp implements GroupMsgService {
    @Autowired
    private GroupMsgDao groupMsgDao;

    @Override
    public void insert(GroupMsg groupMsg) {
        groupMsgDao.insert(groupMsg);
    }

    @Override
    public List<GroupMsgQuery> getByGroupId(String id) {
        return groupMsgDao.getByGroupId(id);
    }

    @Override
    public void deleteByGroupId(String id) {
        groupMsgDao.deleteByGroupId(id);
    }
}
