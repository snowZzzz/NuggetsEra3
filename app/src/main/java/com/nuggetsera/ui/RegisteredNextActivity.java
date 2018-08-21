package com.nuggetsera.ui;

/*
 *  @项目名：  NuggetsEra 
 *  @包名：    com.nuggetsera.ui
 *  @文件名:   RegisteredNextActivity
 *  @创建者:   Administrator
 *  @创建时间:  2018/8/16 17:35
 *  @描述：    注册第二个页面
 */

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.nuggetsera.R;
import com.nuggetsera.presenter.RegisteredNextPresenter;
import com.nuggetsera.presenter.impl.RegisteredNextPresenterImpl;
import com.nuggetsera.view.RegisteredNextView;
import com.nuggetsera.widget.FixedEditView;
import com.nuggetsera.widget.ReturnView;
import com.nuggetsera.widget.UnderLineEditText;

import butterknife.BindView;
import butterknife.OnClick;

public class RegisteredNextActivity
        extends BaseActivity implements RegisteredNextView
{
    @BindView(R.id.tv_return)
    ReturnView    mTvReturn;
    @BindView(R.id.btn_complete)
    Button        mBtnComplete;
    @BindView(R.id.iv_update_icon)
    ImageView     mIvUpdateIcon;
    @BindView(R.id.et_user_name)
    FixedEditView mEtUserName;
    @BindView(R.id.et_invite_code)
    FixedEditView mEtInviteCode;
    @BindView(R.id.et_password)
    FixedEditView mEtPassword;
    @BindView(R.id.et_next_password)
    FixedEditView mEtNextPassword;

    private RegisteredNextPresenter mRegisteredNextPresenter;

    @Override
    public int getLayoutResId() {
        return R.layout.activity_registered_next;
    }

    @Override
    protected void init() {
        super.init();

        mRegisteredNextPresenter = new RegisteredNextPresenterImpl(this);

        mTvReturn.getTvText().setText("上一步");

        //设置昵称输入框
        setEtUserName();

        //设置邀请码输入框
        setEtInviteCode();

        //设置密码输入框
        setEtPassword();

        //设置确认密码输入框
        setEtNextPassword();

    }



    @OnClick({R.id.tv_return,
              R.id.btn_complete,
              R.id.iv_update_icon})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:        //上一步
                goTo(RegisteredActivity.class);
                break;
            case R.id.btn_complete:     //完成注册
                goTo(LoginActivity.class);
                break;
            case R.id.iv_update_icon:   //上传头像
                break;
        }
    }


    private void setEtUserName() {
        mEtUserName.getFixText().setText("昵"+"\u3000\u3000"+"称");
        UnderLineEditText fixEdit = mEtUserName.getFixEdit();
        fixEdit.setHint("请输入昵称");

    }

    private void setEtInviteCode() {
        mEtInviteCode.getFixText().setText("邀  请  码");
        UnderLineEditText fixEdit = mEtInviteCode.getFixEdit();
        fixEdit.setHint("请输入邀请码");

    }

    private void setEtPassword() {
        mEtPassword.getFixText().setText("设置密码");
        UnderLineEditText fixEdit = mEtPassword.getFixEdit();
        fixEdit.setHint("请输入登录密码");
        //设置输入内容为密码不可见
        fixEdit.setTransformationMethod(PasswordTransformationMethod.getInstance());

    }

    private void setEtNextPassword() {
        mEtNextPassword.getFixText().setText("确认密码");
        UnderLineEditText fixEdit = mEtNextPassword.getFixEdit();
        fixEdit.setHint("请重新输入登录密码");
        //设置输入内容为密码不可见
        fixEdit.setTransformationMethod(PasswordTransformationMethod.getInstance());

    }
}
