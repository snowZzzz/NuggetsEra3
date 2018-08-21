package com.nuggetsera.ui;

/*
 *  @项目名：  NuggetsEra 
 *  @包名：    com.nuggetsera.ui
 *  @文件名:   RegisteredActivity
 *  @创建者:   Administrator
 *  @创建时间:  2018/8/16 16:52
 *  @描述：    注册第一个页面
 */

import android.text.InputType;
import android.view.View;
import android.widget.Button;

import com.nuggetsera.R;
import com.nuggetsera.presenter.RegisteredPresenter;
import com.nuggetsera.presenter.impl.RegisteredPresenterImpl;
import com.nuggetsera.view.RegisteredView;
import com.nuggetsera.widget.FixedEditView;
import com.nuggetsera.widget.GetCodeEditView;
import com.nuggetsera.widget.ReturnView;
import com.nuggetsera.widget.UnderLineEditText;

import butterknife.BindView;
import butterknife.OnClick;

public class RegisteredActivity extends BaseActivity implements RegisteredView{


    @BindView(R.id.btn_next)
    Button          mBtnNext;
    @BindView(R.id.et_register_tel)
    FixedEditView   mEtRegisterTel;
    @BindView(R.id.et_auth_code)
    GetCodeEditView mEtAuthCode;
    @BindView(R.id.tv_return)
    ReturnView      mTvReturn;

    private RegisteredPresenter mRegisteredPresenter;

    @Override
    public int getLayoutResId() {
        return R.layout.activity_registered;
    }


    @Override
    protected void init() {
        super.init();
        mRegisteredPresenter = new RegisteredPresenterImpl(this);

        mTvReturn.getTvText().setText("登录");

        //设置号码输入框
        setRegisterTel();

        //设置验证码输入框
        setAuthCode();

    }


    @OnClick({R.id.tv_return,
              R.id.btn_next})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_return:            //返回登录界面
                goTo(LoginActivity.class);
                break;
            case R.id.btn_next:             //下一步
                goTo(RegisteredNextActivity.class);
                break;
        }
    }


    private void setRegisterTel() {
        UnderLineEditText fixEdit = mEtRegisterTel.getFixEdit();
        fixEdit.setInputType(InputType.TYPE_CLASS_PHONE);

    }

    private void setAuthCode() {

        UnderLineEditText fixEdit = mEtAuthCode.getFixEdit();
        fixEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

}
