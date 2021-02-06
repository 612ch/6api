package com.demon.api.controller.image;

import com.demon.api.service.image.ImageService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ImageController
 * @Descriotion 图片
 * @Author Demon
 * @Date 2020/10/20 20:44
 **/
@RestController
@RequestMapping("image")
@Api(tags = "高清图片")
public class ImageController {
    @Autowired
    ImageService imageService;


}
