package com.zinitsolutions.baseactivity.activities;

import com.zinitsolutions.baseactivity.activities.strategies.BaseDrawerLoadingStrategy;
import com.zinitsolutions.baseactivity.activities.strategies.HomeLoadingStrategy;

/**
 * Created by dmitrij on 5/16/16.
 */
public class HomeActivity extends BaseDrawerActivity {
    @Override
    protected BaseDrawerLoadingStrategy getLoadingStrategy() {
        return new HomeLoadingStrategy();
    }
}
