package com.shop2.myapp.service;

import com.shop2.myapp.dto.SampleDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SampleService {
    public List<SampleDto> findAll() throws Exception;
    public SampleDto getSample(String id) throws Exception;
}
