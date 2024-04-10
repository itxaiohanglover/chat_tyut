package com.tyut.chat.dao;


import com.tyut.chat.entity.Lobby;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LobbyDao {
    List<Lobby> getAll();
    void insert(Lobby lobby);
}
