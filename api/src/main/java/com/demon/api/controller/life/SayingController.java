package com.demon.api.controller.life;

import com.demon.api.common.vo.Result;
import com.demon.api.pojo.life.Saying;
import com.demon.api.service.life.SayingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName SayingController
 * @Descriotion 程序名言Controller
 * @Author Demon
 * @Date 2020/10/19 19:07
 **/

@RestController
@RequestMapping("saying")
@Api(tags = "程序名言")
public class SayingController {
    @Autowired
    SayingService sayingService;

    @RequestMapping(value = "/getSaying", method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "获取程序名言", notes = "随机获取一句程序名言")
    public Result<String> getSaying() {
        Saying saying = sayingService.getSaying();
        return Result.success(saying.getContent());
    }


}
