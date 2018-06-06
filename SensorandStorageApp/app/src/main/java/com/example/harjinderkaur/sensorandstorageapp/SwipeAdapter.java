package com.example.harjinderkaur.sensorandstorageapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.harjinderkaur.sensorandstorageapp.FragmentBlue;
import com.example.harjinderkaur.sensorandstorageapp.FragmentGreen;

public class SwipeAdapter extends FragmentStatePagerAdapter {
    public SwipeAdapter(FragmentManager fm)
    {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new FragmentBlue();
        }
            return new FragmentGreen();



    }

    @Override
    public int getCount() {
        return 2;
    }
}
