package com.example.splashscreen;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class fragments extends FragmentPagerAdapter {

    private int tabno;

    public fragments(@NonNull FragmentManager fm, int behavior, int tabno) {
        super(fm, behavior);
        this.tabno = tabno;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0: return new fragment1();
            case 1: return new fragment2();
            case 2: return new fragment3();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabno;
    }


}
