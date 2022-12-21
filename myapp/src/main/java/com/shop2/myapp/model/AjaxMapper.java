package com.shop2.myapp.model;

import com.shop2.myapp.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AjaxMapper {
    public List<UserDto> userList() throws Exception;
    public UserDto getUser(String id) throws Exception;
    public UserDto getLogin(String id, String pw) throws Exception;
}
