package com.zinitsolutions.baseactivity.activities;

import com.zinitsolutions.baseactivity.activities.strategies.BaseDrawerLoadingStrategy;
import com.zinitsolutions.baseactivity.activities.strategies.SecondLoadingStrategy;

/**
 * Created by dmitrij on 5/13/16.
 */
public class SecondActivity extends BaseDrawerActivity {
    @Override
    protected BaseDrawerLoadingStrategy getLoadingStrategy() {
        return new SecondLoadingStrategy();
    }
}
