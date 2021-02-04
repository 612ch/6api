package com.demon.api.common.vo;

import com.demon.api.common.enums.ExceptionEnum;
import lombok.Data;

/**
 * @ClassName ExceptionResult
 * @Descriotion 异常结果VO
 * @Author Demon
 * @Date 2020/10/19 23:10
 **/

@Data
public class ExceptionResult {
    private String timestamp;
    private int status;
    private String error;
    private String message;


    public ExceptionResult(ExceptionEnum em) {
        this.status = em.getCode();
        this.error = em.getReasonPhrase();
        this.message = em.getMsg();
        this.timestamp = Long.toString(System.currentTimeMillis());
    }
}
