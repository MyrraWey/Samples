package com.zinitsolutions.baseactivity.activities;

import com.zinitsolutions.baseactivity.activities.strategies.BaseDrawerLoadingStrategy;
import com.zinitsolutions.baseactivity.activities.strategies.ThirdLoadingStrategy;

/**
 * Created by dmitrij on 5/13/16.
 */
public class ThirdActivity extends BaseDrawerActivity {
    @Override
    protected BaseDrawerLoadingStrategy getLoadingStrategy() {
        return new ThirdLoadingStrategy();
    }
}
