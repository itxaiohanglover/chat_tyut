package com.tyut.chat.service.impl;

import com.tyut.chat.dao.CodeDao;
import com.tyut.chat.entity.VerifyCode;
import com.tyut.chat.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeServiceImp implements CodeService {

    @Autowired
    private CodeDao codeDao;

    @Override
    public void insertOne(VerifyCode code) {
        codeDao.insertOne(code);
    }

    @Override
    public void deleteOne(String email) {
        codeDao.deleteOne(email);
    }

    @Override
    public VerifyCode getOne(String email) {
        return codeDao.getOne(email);
    }
}
