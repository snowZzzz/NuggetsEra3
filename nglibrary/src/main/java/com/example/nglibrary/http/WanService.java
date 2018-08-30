package com.example.nglibrary.http;


import com.example.nglibrary.AppConst;

import com.example.nglibrary.ResponseData;
import com.example.nglibrary.bean.LoginBean;
import com.example.nglibrary.http.rxjavahelper.RxObserver;
import com.example.nglibrary.http.rxjavahelper.RxResultHelper;
import com.example.nglibrary.http.rxjavahelper.RxSchedulersHelper;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okrx2.adapter.ObservableBody;

import java.util.HashMap;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

/**
 * user：lqm
 * desc：玩Android提供的api接口
 * www.wanandroid.com
 */

public class WanService {
    private static String registUrl = AppConst.BASE_URL + "user/login";

    /**
     * 演示如何调用网络框架
     */
    private void showMethed() {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobilePhone", "18813918090");
        map.put("password", "111111");

        WanService.requestPost(map, new OnHttpResponseListener() {
            @Override
            public void onHttpRequestSuccess() {

            }

            @Override
            public void onHttpRequestError() {

            }

            @Override
            public void showProgress() {

            }

            @Override
            public void hideProgress() {

            }
        });
    }

    /**
     *
     */
    public static Observable<ResponseData<LoginBean>> regist(HashMap<String, String> map) {
        String jsonStr = new Gson().toJson(map);
        return OkGo.<ResponseData<LoginBean>>post(registUrl)
                .upJson(jsonStr)
                .converter(new JsonConvert<ResponseData<LoginBean>>() {
                })
                .adapt(new ObservableBody<ResponseData<LoginBean>>());
    }

    public static Observable<ResponseData<LoginBean>> getCollectData() {
        return OkGo.<ResponseData<LoginBean>>
                get("http://mobile.weather.com.cn/data/forecast/101010100.html?_=1381891660081")
                .converter(new JsonConvert<ResponseData<LoginBean>>() {
                })
                .adapt(new ObservableBody<ResponseData<LoginBean>>());
    }

    public static void requestPost(HashMap map, final OnHttpResponseListener listener) {

        WanService.regist(map)
                .compose(RxSchedulersHelper.io_main())
                .compose(RxResultHelper.handleResult2())
                .subscribe(new RxObserver<LoginBean>() {
                    @Override
                    public void _onSubscribe(Disposable d) {
                        listener.showProgress();
                    }

                    @Override
                    public void _onNext(LoginBean userBean) {
                        userBean.getArea();
                        listener.onHttpRequestSuccess();
                    }

                    @Override
                    public void _onError(String errorMessage) {
                        String err = errorMessage;
                        listener.onHttpRequestError();
                    }

                    @Override
                    public void _onComplete() {
                        listener.hideProgress();
                    }
                });
    }

    public static void requestGet(HashMap map, final OnHttpResponseListener listener) {
        WanService.getCollectData()
                .compose(RxSchedulersHelper.io_main())
                .compose(RxResultHelper.handleResult2())
                .subscribe(new RxObserver<LoginBean>() {
                    @Override
                    public void _onSubscribe(Disposable d) {
                        listener.showProgress();
                    }

                    @Override
                    public void _onNext(LoginBean userBean) {
                        userBean.getArea();
                        listener.onHttpRequestSuccess();
                    }

                    @Override
                    public void _onError(String errorMessage) {
                        listener.onHttpRequestError();
                    }

                    @Override
                    public void _onComplete() {
                        listener.hideProgress();
                    }
                });
    }

}
