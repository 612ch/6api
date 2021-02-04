package com.demon.api.mapper;

import com.demon.api.pojo.Lover;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

/**
 * @ClassName LoverMapper
 * @Descriotion 土味情话
 * @Author Demon
 * @Date 2021/2/5 1:50
 **/

public interface LoverMapper extends Mapper<Lover> {

    @Select("select * from api_lover where del_flag='0' order by rand() limit 1")
    Lover getLover();

}
