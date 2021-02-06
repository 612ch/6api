package com.demon.api.service.image.impl;

import com.demon.api.mapper.life.AbuseMapper;
import com.demon.api.pojo.life.Abuse;
import com.demon.api.service.life.AbuseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName AbuseServiceImpl
 * @Descriotion 骂人宝典
 * @Author Demon
 * @Date 2021/2/6 18:34
 **/

@Service
public class AbuseServiceImpl implements AbuseService {
    @Autowired
    AbuseMapper abuseMapper;

    @Override
    public Abuse getAbuse() {
        return abuseMapper.getAbuse();
    }
}
