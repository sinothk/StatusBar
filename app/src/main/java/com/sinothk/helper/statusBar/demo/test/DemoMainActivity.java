package com.sinothk.helper.statusBar.demo.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

import com.sinothk.helper.statusBar.StatusBarUtil;
import com.sinothk.helper.statusBar.demo.R;

public class DemoMainActivity extends AppCompatActivity {

    public static final String EXTRA_IS_TRANSPARENT = "is_transparent";
//    private TextView mTvStatusAlpha;
    private RelativeLayout mRootLayout;
//    private Button mBtnChangeBackground;
    private boolean isBgChanged;
//    private SeekBar mSbChangeAlpha;

//    private boolean isTransparent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        isTransparent =  true;//getIntent().getBooleanExtra(EXTRA_IS_TRANSPARENT, false);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_status_bar);

        // 透明
        StatusBarUtil.setTransparent(this);
//        mRootLayout = (RelativeLayout) findViewById(R.id.root_layout);
//        mRootLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.bg_monkey));

        //
//        StatusBarUtil.setTranslucent(this, StatusBarUtil.DEFAULT_STATUS_BAR_ALPHA);
//        mRootLayout = (RelativeLayout) findViewById(R.id.root_layout);
//        mRootLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.bg_monkey));

//        StatusBarUtil.setTranslucent(DemoMainActivity.this, 50);


//        mBtnChangeBackground = (Button) findViewById(R.id.btn_change_background);
//        mTvStatusAlpha = (TextView) findViewById(R.id.tv_status_alpha);
//        mSbChangeAlpha = (SeekBar) findViewById(R.id.sb_change_alpha);
//
//        mBtnChangeBackground.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                isBgChanged = !isBgChanged;
//                if (isBgChanged) {
//                    mRootLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.bg_girl));
//                } else {
//                    mRootLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.bg_monkey));
//                }
//            }
//        });

//        if (!isTransparent) {
//            mSbChangeAlpha.setVisibility(View.VISIBLE);
//            setSeekBar();
//        } else {
//            mSbChangeAlpha.setVisibility(View.GONE);
//        }
    }

//    @Override
//    protected void setStatusBar() {
//
//    }

//    private void setSeekBar() {
//        mSbChangeAlpha.setMax(255);
//        mSbChangeAlpha.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                mAlpha = progress;
//                StatusBarUtil.setTranslucent(DemoMainActivity.this, mAlpha);
//                mTvStatusAlpha.setText(String.valueOf(mAlpha));
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });
//        mSbChangeAlpha.setProgress(StatusBarUtil.DEFAULT_STATUS_BAR_ALPHA);
//    }
}
