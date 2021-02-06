package com.demon.api.pojo.image;

import lombok.Data;

import javax.persistence.Table;

/**
 * @ClassName Image
 * @Descriotion 图片
 * @Author Demon
 * @Date 2020/10/20 20:43
 **/
@Table(name = "api_images")
@Data
public class Image {
    private Integer id;

}
