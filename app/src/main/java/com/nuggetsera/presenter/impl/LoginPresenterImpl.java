package com.nuggetsera.presenter.impl;

/*
 *  @项目名：  NuggetsEra 
 *  @包名：    com.nuggetsera.presenter.impl
 *  @文件名:   LoginPresenterImpl
 *  @创建者:   Administrator
 *  @创建时间:  2018/8/16 16:13
 *  @描述：    登录界面的Presenter接口的实现类
 */

import com.nuggetsera.presenter.LoginPresenter;
import com.nuggetsera.ui.LoginActivity;

public class LoginPresenterImpl implements LoginPresenter {

    private LoginActivity mLoginActivity;

    public LoginPresenterImpl(LoginActivity loginActivity) {
        mLoginActivity = loginActivity;
    }
}
