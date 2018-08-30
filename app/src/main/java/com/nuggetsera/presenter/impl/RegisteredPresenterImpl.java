package com.nuggetsera.presenter.impl;

/*
 *  @项目名：  NuggetsEra 
 *  @包名：    com.nuggetsera.presenter.impl
 *  @文件名:   RegisteredPresenterImpl
 *  @创建者:   Administrator
 *  @创建时间:  2018/8/21 10:01
 *  @描述：    注册第一个界面presenter接口的实现类
 */

import com.nuggetsera.presenter.RegisteredPresenter;
import com.nuggetsera.ui.RegisteredActivity;

public class RegisteredPresenterImpl implements RegisteredPresenter {

    private RegisteredActivity mRegisteredActivity;

    public RegisteredPresenterImpl(RegisteredActivity registeredActivity) {
        mRegisteredActivity = registeredActivity;
    }
}
