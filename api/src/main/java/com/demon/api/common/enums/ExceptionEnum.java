package com.demon.api.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @ClassName ExceptionEnum
 * @Descriotion 异常信息枚举
 * @Author ChenHao
 * @Date 2020/10/19 23:06
 **/

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {
        /*
        * 错误代码	错误消息	解释帮助
        100	内部服务器错误	出现此错误码请及时反馈或等待修复
        110	接口暂时维护中	接口暂时关闭维护中，请注意相关公告
        120	IP请求来源受限	设置了IP白名单，来源IP不在白名单内
        130	分钟请求频率超限	API超出了分钟调用最大频率被暂时限制
        140	API没有调用权限	该API只有特定用户才可以调用，也可能是被禁用
        150	接口可用次数不足	接口可用次数不足，请在接口列表查看
        160	账号未申请该接口	请先在对应的接口文档页面申请接口，点此查看帮助
        170	Referer请求来源受限	设置了Referer白名单，来源Referer不在白名单内
        230	key错误或为空	请检查apikey是否填写错误，点此查看帮助
        240	缺少key参数	请检查是否传递了key参数，如变量请检查是否赋值
        250	数据返回为空	数据查询或转换失败，请确保输入值正确或重试
        260	关键词不得为空	请检查word参数是否传递了空值
        270	缺少有效数据	接口需要传递数据，请参考接口文档的说明
        280	缺少必要的参数	缺少必填的参数，请根据接口文档检查
        290	超过最大输入字节限制	超出最大字符，请查看对应的接口文档说明
        * */
    CONTINUE(100, "Continue","内部服务器错误","出现此错误码请及时反馈或等待修复"),
    MAINTENANCE(110, "Maintenance","接口暂时维护中","接口暂时关闭维护中，请注意相关公告"),
    RESTRICT_IP(120, "Restrict_IP","IP请求来源受限","设置了IP白名单，来源IP不在白名单内"),
    RESTRICT_NUMBER(130, "Restrict_NUM","分钟请求频率超限","API超出了分钟调用最大频率被暂时限制"),
    NO_AUTH(140, "No_auth","API没有调用权限","该API只有特定用户才可以调用，也可能是被禁用"),


    /*自定义错误*/

    ;
    /**
     * 状态码
     */
    private int code;
    /**
     * 原因
     */
    private String reasonPhrase;
    /**
     * 提示消息
     */
    private String msg;
    /**
     * 解释帮助
     */
    private String help;
}
