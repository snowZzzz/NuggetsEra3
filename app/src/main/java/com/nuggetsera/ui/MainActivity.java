package com.nuggetsera.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.nuggetsera.R;
import com.nuggetsera.view.MainView;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity
        extends BaseActivity implements MainView
{


    @BindView(R.id.tv_user_name)
    TextView     mTvUserName;
    @BindView(R.id.tv_announcement)
    TextView     mTvAnnouncement;
    @BindView(R.id.tv_gold_number)
    TextView     mTvGoldNumber;
    @BindView(R.id.tv_force_number)
    TextView     mTvForceNumber;
    @BindView(R.id.iv_invite_friends)
    ImageView    mIvInviteFriends;
    @BindView(R.id.iv_obtain_force)
    ImageView    mIvObtainForce;
    @BindView(R.id.iv_gold_act)
    ImageView    mIvGoldAct;
    @BindView(R.id.iv_nuggets_secret)
    ImageView    mIvNuggetsSecret;
    @BindView(R.id.ll_above)
    LinearLayout mLlAbove;
    @BindView(R.id.iv_homepage_ranking)
    ImageView    mIvHomepageRanking;
    @BindView(R.id.tv_force_value)
    TextView     mTvForceValue;
    @BindView(R.id.tv_gold_value)
    TextView     mTvGoldValue;

    private long lasttime = 0;

    @Override
    public int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        super.init();
    }


    @OnClick({R.id.tv_user_name,
              R.id.tv_announcement,
              R.id.iv_invite_friends,
              R.id.iv_obtain_force,
              R.id.iv_gold_act,
              R.id.iv_nuggets_secret,
              R.id.tv_force_value,
              R.id.tv_gold_value})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_user_name:     //我的
                goTo(MyActivity.class);

                break;
            case R.id.tv_announcement:  //公告

                break;
            case R.id.iv_invite_friends: //邀请好友

                break;
            case R.id.iv_obtain_force:   //获取原力

                break;
            case R.id.iv_gold_act:       //紫金活动

                break;
            case R.id.iv_nuggets_secret: //掘金秘籍

                break;
            case R.id.tv_force_value:    //原力值

                break;
            case R.id.tv_gold_value:     //紫金

                break;
        }
    }

    @Override
    public void onBackPressed() {
        long n = Calendar.getInstance().getTimeInMillis();

        if (n - lasttime < 2000) {
            setResult(RESULT_OK);
            super.onBackPressed();
        } else {
            Toast.makeText(this, "再按一次退出应用", Toast.LENGTH_SHORT).show();
            lasttime = n;
        }
    }
}
