package com.demon.api.controller.life;

import com.demon.api.service.SayingService;
import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName SayingController
 * @Descriotion 程序名言Controller
 * @Author ChenHao
 * @Date 2020/10/19 19:07
 **/
@RestController
@RequestMapping("saying")
@Api(tags = "程序名言")
@EnableSwaggerBootstrapUI
public class SayingController {
    @Autowired
    SayingService sayingService;

    @RequestMapping(value = "/getSaying", method = {RequestMethod.GET,RequestMethod.POST})
    @ApiOperation(value = "获取程序名言",notes = "随机获取一句程序名言")
    public ResponseEntity<String> getSaying(){

        return ResponseEntity.ok("test");
    }


}
