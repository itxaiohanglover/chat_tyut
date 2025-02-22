package com.tyut.chat.service.impl;

import com.tyut.chat.dao.NoticeDao;
import com.tyut.chat.entity.Notice;
import com.tyut.chat.entity.NoticeQuery;
import com.tyut.chat.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImp implements NoticeService {
    @Autowired
    private NoticeDao noticeDao;

    @Override
    public void insert(Notice notice) {
        noticeDao.insert(notice);
    }

    @Override
    public Notice getByFromAndTo(Notice notice) {
        return noticeDao.getByFromAndTo(notice);
    }

    @Override
    public List<NoticeQuery> getByFromOrTo(String id) {
        return noticeDao.getByFromOrTo(id);
    }

    @Override
    public Notice getById(String id) {
        return noticeDao.getById(id);
    }

    @Override
    public void deleteById(String id) {
        noticeDao.deleteById(id);
    }
}
