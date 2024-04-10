package com.tyut.chat.service;

import com.tyut.chat.entity.Lobby;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LobbyService {
    List<Lobby> getAll();
    void insert(Lobby lobby);
}
