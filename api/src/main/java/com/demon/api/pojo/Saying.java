package com.demon.api.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName Saying
 * @Descriotion 程序名言dto
 * @Author Demon
 * @Date 2020/10/20 12:47
 **/
@Table(name = "api_saying")
@Data
public class Saying {
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
