package top.api.controller;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Descriotion hello
 * @Author ChenHao
 * @Date 2020/10/15 17:09
 **/

@RestController
@RequestMapping("hello")
@Api(tags = "hello模块")
@EnableSwaggerBootstrapUI
public class HelloController {
    /*设计力求简洁，直到无法更简洁。*/

    @GetMapping("sayHello")
    @ApiOperation(value = "sayHello", notes = "给你问好啊")
    public ResponseEntity<String> helloWorld(){

        return ResponseEntity.ok("hello,你好啊");
    }

}
