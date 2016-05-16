package com.zinitsolutions.baseactivity.activities.strategies;

import com.zinitsolutions.baseactivity.R;

/**
 * Created by dmitrij on 5/16/16.
 */
public class FirstLoadingStrategy implements BaseDrawerLoadingStrategy {
    @Override
    public int getView() {
        return R.layout.activity_first;
    }

    @Override
    public int getDefaultNavigationItem() {
        return R.id.navigation_drawer_first;
    }

    @Override
    public String getActionBarTitle() {
        return "First Activity";
    }

    @Override
    public boolean isDisplayHomeAsUpEnabled() {
        return true;
    }
}
