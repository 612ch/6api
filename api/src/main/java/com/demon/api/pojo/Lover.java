package com.demon.api.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName Lover
 * @Descriotion 土味情话
 * @Author Demon
 * @Date 2021/2/5 1:50
 **/
@Table(name = "api_lover")
@Data
public class Lover {

    @Id
    private Long id;

    /**
     * 内容
     */
    private String content;
    /**
     * 删除标记
     */
    private String delFlag;
}
