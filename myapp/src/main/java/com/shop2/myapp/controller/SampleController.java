package com.shop2.myapp.controller;

import com.shop2.myapp.dto.SampleDto;
import com.shop2.myapp.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/sample/")
public class SampleController {
    @Autowired
    SampleService sampleService;

    @GetMapping("list")
    public String sampleList(Model model) throws Exception{
        List<SampleDto> list = sampleService.findAll();
        model.addAttribute("list", list);
        return "sample/list";
    }

    @GetMapping("detail")
    public String sampleDetail(@RequestParam("id") String id, Model model) throws Exception{
        SampleDto sample = sampleService.getSample(id);
        model.addAttribute("sample", sample);
        return "sample/detail";
    }

}
