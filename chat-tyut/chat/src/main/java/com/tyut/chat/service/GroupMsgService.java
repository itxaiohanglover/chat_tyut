package com.tyut.chat.service;

import com.tyut.chat.entity.GroupMsg;
import com.tyut.chat.entity.GroupMsgQuery;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GroupMsgService {
    void insert(GroupMsg groupMsg);
    List<GroupMsgQuery> getByGroupId(String id);
    void deleteByGroupId(String id);
}
