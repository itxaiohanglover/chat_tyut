package com.tyut.chat.service;

import com.tyut.chat.entity.Group;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GroupService {
    void insert(Group group);
    Integer getCount();
    void idPlus();
    List<Group> getMyGroup(String id);
    List<Group> getByKeyword(String keyword);
    void deleteById(String id);
    void updateById(Group group);
}
