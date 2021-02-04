package com.demon.api.controller.life;

import com.demon.api.common.vo.Result;
import com.demon.api.mapper.LoverMapper;
import com.demon.api.pojo.Lover;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName LoverController
 * @Descriotion 土味情话
 * @Author Demon
 * @Date 2021/2/5 1:47
 **/

@RestController
@RequestMapping("lover")
@Api(tags = "土味情话")
public class LoverController {

    @Autowired
    LoverMapper loverMapper;

    @RequestMapping(value = "/getLover", method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "获取土味情话", notes = "随机获取一句土味情话")
    public Result<String> getLover() {
        Lover lover = loverMapper.getLover();
        return Result.success(lover.getContent());
    }

}
