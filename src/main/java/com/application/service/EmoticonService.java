package com.application.service;

import com.application.mapper.EmoticonMapper;
import com.application.po.EmoticonPo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Repository
public class EmoticonService extends ServiceImpl<EmoticonMapper, EmoticonPo> {

    @Resource
    EmoticonMapper emoticonMapper;

    public List<EmoticonPo> list(String name) {

        QueryWrapper<EmoticonPo> emoticonQuery = new QueryWrapper<>();
        emoticonQuery.lambda().like(EmoticonPo::getTag, name);
        return emoticonMapper.selectList(emoticonQuery);

    }

}
