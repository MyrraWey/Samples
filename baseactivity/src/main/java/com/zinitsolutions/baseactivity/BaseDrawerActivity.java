package com.zinitsolutions.baseactivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.design.widget.NavigationView.OnNavigationItemSelectedListener;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.FrameLayout;

public abstract class BaseDrawerActivity extends AppCompatActivity {
    private DrawerLayout mDrawer;
    private NavigationView mNavigation;
    private Toolbar mToolbar;

    private ActionBarDrawerToggle mDrawerToggle;

    private final OnNavigationItemSelectedListener mNavigationItemSelectedListener = new OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            Intent intent;

            switch (item.getItemId()) {
                case R.id.navigation_drawer_first:
                    intent = new Intent(getApplicationContext(), FirstActivity.class);
                    startActivity(intent);
                    break;
                case R.id.navigation_drawer_second:
                    intent = new Intent(getApplicationContext(), SecondActivity.class);
                    startActivity(intent);
                    break;
                case R.id.navigation_drawer_third:
                    intent = new Intent(getApplicationContext(), ThirdActivity.class);
                    startActivity(intent);
                    break;
                case R.id.navigation_drawer_send_email:
                    AlertDialog.Builder dialog = new AlertDialog.Builder(getApplicationContext())
                            .setTitle("Send email")
                            .setMessage("Here you can send email to developer")
                            .setPositiveButton(android.R.string.ok, null)
                            .setNeutralButton(android.R.string.cancel, null);
                    dialog.show();
                    break;
            }

            mDrawer.closeDrawer(GravityCompat.START);

            return true;
        }
    };

    public abstract int getView();

    public abstract int getDefaultNavigationItem();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getView());

        mDrawer = (DrawerLayout) findViewById(R.id.base_drawer_layout);
        mNavigation = (NavigationView) findViewById(R.id.base_drawer_navigation_view);
        mToolbar = (Toolbar) findViewById(R.id.base_drawer_toolbar);

        setSupportActionBar(mToolbar);

        mDrawerToggle = new ActionBarDrawerToggle(
                this,
                mDrawer,
                mToolbar,
                R.string.drawer_open,
                R.string.drawer_close
        );
        mDrawer.addDrawerListener(mDrawerToggle);

        mNavigation.setNavigationItemSelectedListener(mNavigationItemSelectedListener);
        mNavigation.setCheckedItem(getDefaultNavigationItem());
    }

    @Override
    public void setContentView(int layoutResID) {
        DrawerLayout baseLayout = (DrawerLayout) getLayoutInflater()
                .inflate(R.layout.activity_base_drawer, null);
        FrameLayout content = (FrameLayout) baseLayout.findViewById(R.id.base_drawer_content);
        getLayoutInflater().inflate(layoutResID, content, true);

        super.setContentView(baseLayout);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public void onBackPressed() {
        if (mDrawer.isDrawerOpen(GravityCompat.START)) {
            mDrawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
