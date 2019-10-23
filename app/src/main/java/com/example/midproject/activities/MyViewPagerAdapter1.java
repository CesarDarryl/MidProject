package com.example.midproject.activities;

import android.view.View;
import android.view.ViewGroup;

interface MyViewPagerAdapter1 {
    Object instantiateItem(ViewGroup container, int position);

    int getCount();

    boolean isViewFromObject(View view, Object obj);

    void destroyItem(ViewGroup container, int position, Object object);
}
