package com.tyut.chat.dao;


import com.tyut.chat.entity.GroupMsg;
import com.tyut.chat.entity.GroupMsgQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GroupMsgDao {
    void insert(GroupMsg groupMsg);
    List<GroupMsgQuery> getByGroupId(String id);
    void deleteByGroupId(String id);
}
