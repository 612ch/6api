package com.demon.api.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @ClassName ExceptionEnum
 * @Descriotion 异常信息枚举
 * @Author Demon
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
    /*CONTINUE(100, "Continue","内部服务器错误","出现此错误码请及时反馈或等待修复"),
    MAINTENANCE(110, "Maintenance","接口暂时维护中","接口暂时关闭维护中，请注意相关公告"),
    RESTRICT_IP(120, "Restrict_IP","IP请求来源受限","设置了IP白名单，来源IP不在白名单内"),
    RESTRICT_NUMBER(130, "Restrict_NUM","分钟请求频率超限","API超出了分钟调用最大频率被暂时限制"),
    NO_AUTH(140, "No_auth","API没有调用权限","该API只有特定用户才可以调用，也可能是被禁用"),
    NUM_LACK(150, "Number_Lack","接口可用次数不足","接口可用次数不足，请在接口列表查看"),
    UNAPPLY(160, "Nn_apply","账号未申请该接口","请先在对应的接口文档页面申请接口");*/
    CONTINUE(100, "Continue","继续"),
    SWITCHING_PROTOCOLS(101, "Switching Protocols","交换协议"),
    PROCESSING(102, "Processing","处理"),
    CHECKPOINT(103, "Checkpoint","检查点"),
    OK(200, "OK","操作成功"),
    CREATED(201, "Created","对象创建成功"),
    ACCEPTED(202, "Accepted","请求已经被接受"),
    NON_AUTHORITATIVE_INFORMATION(203, "非授权信息",""),
    NO_CONTENT(204, "No Content","操作执行成功"),
    RESET_CONTENT(205, "Reset Content","重置内容"),
    PARTIAL_CONTENT(206, "Partial Content","部分内容"),
    MULTI_STATUS(207, "Multi-Status","多状态"),
    ALREADY_REPORTED(208, "Already Reported","已提交"),
    IM_USED(226, "IM Used",""),
    MULTIPLE_CHOICES(300, "Multiple Choices",""),
    MOVED_PERMANENTLY(301, "Moved Permanently","资源已被移除"),
    FOUND(302, "Found",""),
    MOVED_TEMPORARILY(302, "Moved Temporarily",""),
    SEE_OTHER(303, "See Other","重定向"),
    NOT_MODIFIED(304, "Not Modified",""),
    USE_PROXY(305, "Use Proxy",""),
    TEMPORARY_REDIRECT(307, "Temporary Redirect",""),
    PERMANENT_REDIRECT(308, "Permanent Redirect",""),
    BAD_REQUEST(400, "Bad Request","参数列表错误"),
    UNAUTHORIZED(401, "Unauthorized","未授权"),
    PAYMENT_REQUIRED(402, "Payment Required",""),
    FORBIDDEN(403, "Forbidden","访问受限，授权过期"),
    NOT_FOUND(404, "Not Found","资源，服务未找到"),
    METHOD_NOT_ALLOWED(405, "Method Not Allowed","不允许的http方法"),
    NOT_ACCEPTABLE(406, "Not Acceptable",""),
    PROXY_AUTHENTICATION_REQUIRED(407, "Proxy Authentication Required",""),
    REQUEST_TIMEOUT(408, "Request Timeout",""),
    CONFLICT(409, "Conflict","资源冲突或者资源被锁定"),
    GONE(410, "Gone",""),
    LENGTH_REQUIRED(411, "Length Required",""),
    PRECONDITION_FAILED(412, "Precondition Failed",""),
    PAYLOAD_TOO_LARGE(413, "Payload Too Large",""),
    REQUEST_ENTITY_TOO_LARGE(413, "Request Entity Too Large",""),
    URI_TOO_LONG(414, "URI Too Long",""),
    REQUEST_URI_TOO_LONG(414, "Request-URI Too Long",""),
    UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type","不知道的数据(媒体)类型"),
    REQUESTED_RANGE_NOT_SATISFIABLE(416, "Requested range not satisfiable",""),
    EXPECTATION_FAILED(417, "Expectation Failed",""),
    I_AM_A_TEAPOT(418, "I'm a teapot",""),
    INSUFFICIENT_SPACE_ON_RESOURCE(419, "Insufficient Space On Resource",""),
    METHOD_FAILURE(420, "Method Failure",""),
    DESTINATION_LOCKED(421, "Destination Locked",""),
    UNPROCESSABLE_ENTITY(422, "Unprocessable Entity",""),
    LOCKED(423, "Locked",""),
    FAILED_DEPENDENCY(424, "Failed Dependency",""),
    TOO_EARLY(425, "Too Early",""),
    UPGRADE_REQUIRED(426, "Upgrade Required",""),
    PRECONDITION_REQUIRED(428, "Precondition Required",""),
    TOO_MANY_REQUESTS(429, "Too Many Requests","请求过多被限制"),
    REQUEST_HEADER_FIELDS_TOO_LARGE(431, "Request Header Fields Too Large",""),
    UNAVAILABLE_FOR_LEGAL_REASONS(451, "Unavailable For Legal Reasons",""),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error","系统内部错误!"),
    NOT_IMPLEMENTED(501, "Not Implemented","接口未实现"),
    BAD_GATEWAY(502, "Bad Gateway",""),
    SERVICE_UNAVAILABLE(503, "Service Unavailable",""),
    GATEWAY_TIMEOUT(504, "Gateway Timeout",""),
    HTTP_VERSION_NOT_SUPPORTED(505, "HTTP Version not supported",""),
    VARIANT_ALSO_NEGOTIATES(506, "Variant Also Negotiates",""),
    INSUFFICIENT_STORAGE(507, "Insufficient Storage",""),
    LOOP_DETECTED(508, "Loop Detected",""),
    BANDWIDTH_LIMIT_EXCEEDED(509, "Bandwidth Limit Exceeded",""),
    NOT_EXTENDED(510, "Not Extended",""),
    NETWORK_AUTHENTICATION_REQUIRED(511, "Network Authentication Required","");


    /*自定义错误*/

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
}
