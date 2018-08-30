package com.example.nglibrary.http;

import android.content.Context;

import com.example.nglibrary.ResponseData;
import com.example.nglibrary.UserBean;
import com.lzy.okgo.OkGo;
import com.lzy.okrx2.adapter.ObservableBody;

import java.util.HashMap;

import io.reactivex.Observable;

/**
 * Created by zhangzz on 2018/8/29
 */
public class HttpManager<T> {
    private static HttpManager instance;

    public static HttpManager getInstance() {
        if (instance == null) {
            instance = new HttpManager();
        }

        return instance;
    }
    /**
     *
     */
    public Observable<ResponseData<UserBean>> regist(HashMap<String, String> map, String url) {
        return OkGo.<ResponseData<UserBean>>post(url)
                .params(map)
                .converter(new JsonConvert<ResponseData<UserBean>>() {
                })
                .adapt(new ObservableBody<ResponseData<UserBean>>());
    }

    public Observable<ResponseData<T>> getCollectData(String url) {
        return OkGo.<ResponseData<T>>
                get(url)
                .converter(new JsonConvert<ResponseData<T>>() {
                })
                .adapt(new ObservableBody<ResponseData<T>>());
    }
}
