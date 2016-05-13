package com.zinitsolutions.baseactivity;

/**
 * Created by dmitrij on 5/13/16.
 */
public class SecondActivity extends BaseDrawerActivity {
    @Override
    public int getView() {
        return R.layout.activity_second;
    }

    @Override
    public int getDefaultNavigationItem() {
        return R.id.navigation_drawer_second;
    }
}
