package com.shop2.myapp.service;

import com.shop2.myapp.dto.UserDto;
import com.shop2.myapp.model.AjaxMapper;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AjaxServiceImpl implements AjaxService{

    @Autowired
    AjaxMapper ajaxMapper;

    @Override
    public List<UserDto> userList() throws Exception {
        return ajaxMapper.userList();
    }

    @Override
    public UserDto getUser(String id) throws Exception {
        return ajaxMapper.getUser(id);
    }

    @Override
    public UserDto getLogin(String id, String pw) throws Exception{
        return ajaxMapper.getLogin(id, pw);
    }

}
