package com.demon.api.mapper.life;

import com.demon.api.pojo.life.Abuse;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

/**
 * @ClassName AbuseMapper
 * @Descriotion 骂人宝典
 * @Author Demon
 * @Date 2021/2/6 18:35
 **/

public interface AbuseMapper extends Mapper<Abuse> {

    @Select("select * from api_abuse where del_flag='0' order by rand() limit 1")
    Abuse getAbuse();
}
