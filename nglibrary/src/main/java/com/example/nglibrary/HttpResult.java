package com.example.nglibrary;

import java.io.Serializable;

/**
 * Created by zhangzz on 2018/8/29
 */
public class HttpResult<T> implements Serializable {
    public String code;
    public String msg;
    public boolean hasmore;
    public T data;

    public static String SUCCESS = "000";
    public static String SIGN_OUT = "101";//token验证失败
    public static String SHOWTOAST = "102";//显示Toast

    public boolean isSuccess() {
        return SUCCESS.equals(code);
    }

    public boolean isTokenInvalid() {
        return SIGN_OUT.equals(code);
    }

    public boolean isShowToast() {
        return SHOWTOAST.equals(code);
    }

    public boolean hasMore() {
        return hasmore;
    }
}

