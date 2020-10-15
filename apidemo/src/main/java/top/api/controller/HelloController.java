package top.api.controller;

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
public class HelloController {
    /*设计力求简洁，直到无法更简洁。*/

    @GetMapping("sayHello")
    public ResponseEntity<String> helloWorld(){

        return ResponseEntity.ok("hello,你好啊");
    }

}
