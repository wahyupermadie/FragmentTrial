package com.example.wahyu.fragmenttrial.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.wahyu.fragmenttrial.fragment.Tab1Fragment;
import com.example.wahyu.fragmenttrial.fragment.Tab2Fragment;

/**
 * Created by WAHYU on 5/17/2017.
 */

public class TabFragmentPageAdapter extends FragmentPagerAdapter {
    // nama tab
    String[] title = new String[]{
      "TAB 1","TAB 2"
    };

    public TabFragmentPageAdapter(FragmentManager fm){
     super(fm);
    }

    // manipulasi tampilan fragment dilayar
    @Override
    public Fragment getItem(int position){
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new Tab1Fragment();
                break;
            case 1:
                fragment = new Tab2Fragment();
                break;
            default:
                fragment = null;
                break;
        }
        return fragment;
    }
    @Override
    public CharSequence getPageTitle(int position){
        return title[position];
    }

    @Override
    public int getCount(){
        return title.length;
    }
}
