package com.zinitsolutions.baseactivity.activities;

import com.zinitsolutions.baseactivity.activities.strategies.BaseDrawerLoadingStrategy;
import com.zinitsolutions.baseactivity.activities.strategies.FirstLoadingStrategy;

/**
 * Created by dmitrij on 5/13/16.
 */
public class FirstActivity extends BaseDrawerActivity {
    @Override
    protected BaseDrawerLoadingStrategy getLoadingStrategy() {
        return new FirstLoadingStrategy();
    }
}
