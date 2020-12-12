package com.example.baicuoiky;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class View_pager extends FragmentPagerAdapter {
    public View_pager(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:return new fragment_phobien();
            case 1:return new fragment_thucuong();
            case 2:return new fragment_doan();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title="";
        switch (position){

            case 0:title="Phổ biến";break;

            case 1:title="Thức uống ";break;
            case 2:title="Đồ ăn";break;

        }
return title;


    }
}
