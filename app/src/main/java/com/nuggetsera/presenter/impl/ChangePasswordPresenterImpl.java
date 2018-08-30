package com.nuggetsera.presenter.impl;

/*
 *  @项目名：  NuggetsEra 
 *  @包名：    com.nuggetsera.presenter.impl
 *  @文件名:   ChangePasswordPresenterImpl
 *  @创建者:   Administrator
 *  @创建时间:  2018/8/21 10:23
 *  @描述：    修改密码第一页presenter实现类
 */

import com.nuggetsera.presenter.ChangePasswordPresenter;
import com.nuggetsera.ui.ChangePasswordActivity;

public class ChangePasswordPresenterImpl implements ChangePasswordPresenter {


    private ChangePasswordActivity mChangePasswordActivity;

    public ChangePasswordPresenterImpl(ChangePasswordActivity changePasswordActivity) {
        mChangePasswordActivity = changePasswordActivity;
    }
}
