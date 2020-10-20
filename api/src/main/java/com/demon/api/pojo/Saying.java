package com.demon.api.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName Saying
 * @Descriotion 程序名言dto
 * @Author ChenHao
 * @Date 2020/10/20 12:47
 **/
@Table(name = "api_saying")
@Data
public class Saying {
    @Id
    private Long id;//ID
    private String content;// 品牌名称

}
