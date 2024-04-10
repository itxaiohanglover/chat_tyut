package com.tyut.chat.dao;


import com.tyut.chat.entity.VerifyCode;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CodeDao {
    void insertOne(VerifyCode code);
    void deleteOne(String email);
    VerifyCode getOne(String email);
}
