package com.tyut.chat.service;

import com.tyut.chat.entity.Member;
import com.tyut.chat.entity.UserSearch;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MemberService {
    void insert(Member member);
    List<UserSearch> getByGroupId(String id);
    Member getByIds(Member member);
    void deleteByGroupId(String id);
    void deleteMember(Member member);
    List<Integer> getMembersId(String id);
}
