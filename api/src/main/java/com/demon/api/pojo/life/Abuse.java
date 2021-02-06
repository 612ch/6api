package com.demon.api.pojo.life;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName Abuse
 * @Descriotion
 * @Author Demon
 * @Date 2021/2/6 18:35
 **/
@Table(name = "api_abuse")
@Data
public class Abuse {
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
