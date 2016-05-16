package com.zinitsolutions.baseactivity.activities.strategies;

import com.zinitsolutions.baseactivity.R;

/**
 * Created by dmitrij on 5/16/16.
 */
public class SecondLoadingStrategy implements BaseDrawerLoadingStrategy {
    @Override
    public int getView() {
        return R.layout.activity_second;
    }

    @Override
    public int getDefaultNavigationItem() {
        return R.id.navigation_drawer_second;
    }

    @Override
    public String getActionBarTitle() {
        return "Second Activity";
    }

    @Override
    public boolean isDisplayHomeAsUpEnabled() {
        return true;
    }
}
