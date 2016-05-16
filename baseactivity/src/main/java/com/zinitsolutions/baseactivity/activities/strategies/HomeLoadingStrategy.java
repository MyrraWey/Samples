package com.zinitsolutions.baseactivity.activities.strategies;

import com.zinitsolutions.baseactivity.R;

/**
 * Created by dmitrij on 5/16/16.
 */
public class HomeLoadingStrategy implements BaseDrawerLoadingStrategy {
    @Override
    public int getView() {
        return R.layout.activity_home;
    }

    @Override
    public int getDefaultNavigationItem() {
        return -1;
    }

    @Override
    public String getActionBarTitle() {
        return "Home Activity";
    }

    @Override
    public boolean isDisplayHomeAsUpEnabled() {
        return false;
    }
}
