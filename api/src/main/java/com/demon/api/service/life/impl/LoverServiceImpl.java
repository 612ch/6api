package com.demon.api.service.life.impl;

import com.demon.api.mapper.life.LoverMapper;
import com.demon.api.pojo.life.Lover;
import com.demon.api.service.life.LoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName LoverServiceImpl
 * @Descriotion 土味情话
 * @Author Demon
 * @Date 2021/2/5 1:49
 **/
@Service
public class LoverServiceImpl implements LoverService {
    @Autowired
    private LoverMapper loverMapper;

    @Override
    public Lover getLover() {
        return loverMapper.getLover();
    }
}
