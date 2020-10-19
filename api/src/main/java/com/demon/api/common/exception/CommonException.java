package com.demon.api.common.exception;

import com.demon.api.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @ClassName CommonException
 * @Descriotion 通用异常监听
 * @Author ChenHao
 * @Date 2020/10/19 23:09
 **/

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CommonException extends Exception{
    private ExceptionEnum exceptionEnum;
}
