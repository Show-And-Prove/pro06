package com.shop2.myapp.service;


import com.shop2.myapp.dto.UserDto;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AjaxService {
    public List<UserDto> userList() throws Exception;
    public UserDto getUser(String id) throws Exception;
    public UserDto getLogin(String id, String pw) throws Exception;

}
