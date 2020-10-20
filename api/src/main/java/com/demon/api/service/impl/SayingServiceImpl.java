package com.demon.api.service.impl;

import com.demon.api.mapper.SayingMapper;
import com.demon.api.pojo.Saying;
import com.demon.api.service.SayingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName SayingService
 * @Descriotion 程序名言ServiceImpl
 * @Author ChenHao
 * @Date 2020/10/19 19:10
 **/

@Service
public class SayingServiceImpl implements SayingService {
    @Autowired
    private SayingMapper sayingMapper;

    @Override
    public Saying getSaying() {
        return sayingMapper.getSaying();
    }
}
