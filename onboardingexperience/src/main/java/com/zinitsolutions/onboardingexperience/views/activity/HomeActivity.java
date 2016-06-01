package com.zinitsolutions.onboardingexperience.views.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.zinitsolutions.onboardingexperience.R;

/**
 * Created by dmitrij on 6/1/16.
 */
public class HomeActivity extends AppCompatActivity {
    private Button mOnboarding;

    private final OnClickListener mOnboardingClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this, PagerActivity.class);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mOnboarding = (Button) findViewById(R.id.activity_home_onboarding);
        mOnboarding.setOnClickListener(mOnboardingClickListener);
    }
}
