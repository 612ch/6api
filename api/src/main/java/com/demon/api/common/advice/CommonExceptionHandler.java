package com.demon.api.common.advice;

import com.demon.api.common.exception.CommonException;
import com.demon.api.common.vo.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @ClassName CommonExceptionHandler
 * @Descriotion 通用异常处理
 * @Author ChenHao
 * @Date 2020/10/19 23:09
 **/

@ControllerAdvice
public class CommonExceptionHandler {
    @ExceptionHandler(CommonException.class)
    public ResponseEntity<ExceptionResult> handleException(CommonException e){
        return ResponseEntity.status(e.getExceptionEnum().getCode())
                .body(new ExceptionResult(e.getExceptionEnum()));
    }
}
