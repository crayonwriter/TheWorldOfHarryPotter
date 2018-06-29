package com.example.android.theworldofharrypotter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

import com.example.android.theworldofharrypotter.CreaturesFragment;
import com.example.android.theworldofharrypotter.CuriousShopsFragment;
import com.example.android.theworldofharrypotter.FamousLocationsFragment;
import com.example.android.theworldofharrypotter.NotableEventsFragment;
import com.example.android.theworldofharrypotter.SpellsFragment;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FamousLocationsFragment();
        } else if (position == 1) {
            return new NotableEventsFragment();
        } else if (position == 2) {
            return new CuriousShopsFragment();
        } else if (position == 3) {
            return new CreaturesFragment();
        } else {
            return new SpellsFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.locations);
        } else if (position == 1) {
            return mContext.getString(R.string.events);
        } else if (position == 2) {
            return mContext.getString(R.string.shops);
        } else if (position == 3) {
            return mContext.getString(R.string.creatures);
        } else {
            return mContext.getString(R.string.spells);
        }
    }



}
