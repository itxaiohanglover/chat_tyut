package com.tyut.chat.dao;


import com.tyut.chat.entity.Member;
import com.tyut.chat.entity.UserSearch;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface MemberDao {
    void insert(Member member);
    List<UserSearch> getByGroupId(String id);
    Member getByIds(Member member);
    void deleteByGroupId(String id);
    void deleteMember(Member member);
    List<Integer> getMembersId(String id);
}
