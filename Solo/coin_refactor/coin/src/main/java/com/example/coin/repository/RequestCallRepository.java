package com.example.coin.repository;


import com.example.coin.dto.RequestCallDto;
import com.example.coin.mapper.RequestCallMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RequestCallRepository {

    RequestCallMapper requestCallMapper;

    @Autowired
    public RequestCallRepository(RequestCallMapper requestCallMapper) {
        this.requestCallMapper = requestCallMapper;
    }

    public int insertContact(RequestCallDto requestCallDto) {
        return requestCallMapper.insertContact(requestCallDto);
    }
}
