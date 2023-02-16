package com.example.newsapp.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.newsapp.fragments.FollowingFragment;
import com.example.newsapp.fragments.AllNewsFragment;
import com.example.newsapp.fragments.ResourseCenterFragment;

public class MyNewsPagerAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    public MyNewsPagerAdapter(@NonNull FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new AllNewsFragment();
            case 1:
                return new FollowingFragment();
            case 2:
                return new ResourseCenterFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
