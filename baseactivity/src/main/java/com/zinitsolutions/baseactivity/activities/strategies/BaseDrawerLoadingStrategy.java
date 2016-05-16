package com.zinitsolutions.baseactivity.activities.strategies;

/**
 * Created by dmitrij on 5/16/16.
 */
public interface BaseDrawerLoadingStrategy {
    int getView();

    int getDefaultNavigationItem();

    String getActionBarTitle();

    boolean isDisplayHomeAsUpEnabled();

    int[] getHiddenNavigationItems();
}
