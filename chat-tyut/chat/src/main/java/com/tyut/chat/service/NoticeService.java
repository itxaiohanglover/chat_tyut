package com.tyut.chat.service;

import com.tyut.chat.entity.Notice;
import com.tyut.chat.entity.NoticeQuery;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NoticeService {
    void insert(Notice notice);
    Notice getByFromAndTo(Notice notice);
    List<NoticeQuery> getByFromOrTo(String id);
    Notice getById(String id);
    void deleteById(String id);
}
