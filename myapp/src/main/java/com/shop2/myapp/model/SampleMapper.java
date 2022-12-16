package com.shop2.myapp.model;

import com.shop2.myapp.dto.SampleDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SampleMapper {
    public List<SampleDto> findAll() throws Exception;
    public SampleDto getSample(String id) throws Exception;
}
