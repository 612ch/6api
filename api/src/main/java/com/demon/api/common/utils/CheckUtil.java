package com.demon.api.common.utils;

/**
 * @ClassName ChickUtil
 * @Descriotion 检查工具类
 * @Author Demon
 * @Date 2021/2/2 23:08
 **/
public class CheckUtil {

    /**
     * 检查是否为空
     *
     * @param str String
     * @return boolean
     */
    public static boolean isNull(String... str) {
        boolean flog = false;
        try {
            if (null == str) {
                flog = true;
            }
            for (String text : str) {
                if (null == text || "".equals(text) || "null".equals(text) || "NULL".equals(text)
                        || "" == text || "" == text.trim() || "".equals(text.trim())) {
                    flog = true;
                    break;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return flog;
    }
}
