package com.example.nglibrary.http;



/**
 * 数据返回的监听
 * Created by zhangzz on 2018/8/29.
 */
public interface OnHttpResponseListener {
    /**
     * 网络请求成功
     *
     */
    void onHttpRequestSuccess();

    /**
     * 网络请求失败，或者服务器处理失败

     */
    void onHttpRequestError();

    void showProgress();
    void hideProgress();
}