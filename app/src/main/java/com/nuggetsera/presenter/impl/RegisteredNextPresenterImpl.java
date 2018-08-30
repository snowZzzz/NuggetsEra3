package com.nuggetsera.presenter.impl;

/*
 *  @项目名：  NuggetsEra 
 *  @包名：    com.nuggetsera.presenter.impl
 *  @文件名:   RegisteredNextPresenterImpl
 *  @创建者:   Administrator
 *  @创建时间:  2018/8/21 10:17
 *  @描述：    注册第二个界面presenter接口的实现类
 */

import com.nuggetsera.presenter.RegisteredNextPresenter;
import com.nuggetsera.ui.RegisteredNextActivity;

public class RegisteredNextPresenterImpl
        implements RegisteredNextPresenter
{

    private RegisteredNextActivity mRegisteredNextActivity;

    public RegisteredNextPresenterImpl(RegisteredNextActivity registeredNextActivity) {
        mRegisteredNextActivity = registeredNextActivity;
    }
}
