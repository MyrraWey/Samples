package com.zinitsolutions.baseactivity.activities.strategies;

import com.zinitsolutions.baseactivity.R;

/**
 * Created by dmitrij on 5/16/16.
 */
public class ThirdLoadingStrategy implements BaseDrawerLoadingStrategy {
    @Override
    public int getView() {
        return R.layout.activity_third;
    }

    @Override
    public int getDefaultNavigationItem() {
        return R.id.navigation_drawer_third;
    }

    @Override
    public String getActionBarTitle() {
        return "Third Activity";
    }

    @Override
    public boolean isDisplayHomeAsUpEnabled() {
        return true;
    }
}
