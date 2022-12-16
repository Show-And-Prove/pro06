package com.shop2.myapp.service;

import com.shop2.myapp.dto.SampleDto;
import com.shop2.myapp.model.SampleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleServiceImpl implements SampleService{

    @Autowired
    SampleMapper sampleMapper;

    @Override
    public List<SampleDto> findAll() throws Exception {
        return sampleMapper.findAll();
    }

    @Override
    public SampleDto getSample(String id) throws Exception {
        return sampleMapper.getSample(id);
    }
}
