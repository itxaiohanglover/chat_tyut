package com.tyut.chat.service.impl;

import com.tyut.chat.dao.LobbyDao;
import com.tyut.chat.entity.Lobby;
import com.tyut.chat.service.LobbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LobbyServiceImp implements LobbyService {
    @Autowired
    private LobbyDao lobbyDao;
    @Override
    public List<Lobby> getAll() {
        return lobbyDao.getAll();
    }

    @Override
    public void insert(Lobby lobby) {
        lobbyDao.insert(lobby);
    }
}
