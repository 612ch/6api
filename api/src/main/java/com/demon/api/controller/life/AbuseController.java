package com.demon.api.controller.life;

import com.demon.api.common.vo.Result;
import com.demon.api.pojo.life.Abuse;
import com.demon.api.service.life.AbuseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName AbuseController
 * @Descriotion 骂人宝典
 * @Author Demon
 * @Date 2021/2/6 18:24
 **/
@RestController
@RequestMapping("abuse")
@Api(tags = "口吐芬芳")
public class AbuseController {
    @Autowired
    AbuseService abuseService;

    @RequestMapping(value = "/getAbuse", method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "获取骂人宝典", notes = "随机口吐芬芳的一句话")
    public Result<String> getAbuse() {
        Abuse abuse = abuseService.getAbuse();
        return Result.success(abuse.getContent());
    }

}
