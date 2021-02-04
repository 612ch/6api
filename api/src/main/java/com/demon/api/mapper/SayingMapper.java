package com.demon.api.mapper;

import com.demon.api.pojo.Saying;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

/**
 * @ClassName SayingMapper
 * @Descriotion 程序名言Mapper
 * @Author ChenHao
 * @Date 2020/10/19 19:20
 **/


public interface SayingMapper extends Mapper<Saying> {

    @Select("select * from api_saying where del_flag='0' order by rand() limit 1")
    Saying getSaying();


}
