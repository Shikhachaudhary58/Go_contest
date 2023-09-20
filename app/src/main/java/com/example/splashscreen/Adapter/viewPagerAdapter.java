package com.example.splashscreen.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.splashscreen.fragmant_withdraw;
import com.example.splashscreen.fragment_deposit;

public class viewPagerAdapter extends FragmentStateAdapter {
    public viewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public viewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    public viewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new fragment_deposit();
            case 1:
                return new fragmant_withdraw();
            default:
                return new fragment_deposit();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
