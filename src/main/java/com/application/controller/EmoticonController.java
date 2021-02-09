package com.application.controller;

import com.application.po.EmoticonPo;
import com.application.service.EmoticonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emoticon")
public class EmoticonController {

    @Autowired
    EmoticonService emoticonService;

    @GetMapping
    public List<EmoticonPo> list(String name) {
        return emoticonService.list(name);
    }

}
