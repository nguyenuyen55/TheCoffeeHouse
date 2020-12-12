package com.example.baicuoiky;

import android.media.MediaDrm;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class activity2 extends Fragment {
TabLayout tabLayout;
ViewPager viewPager;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View row= inflater.inflate(R.layout.donhang, container, false);
        tabLayout =row.findViewById(R.id.tab_layout);
        viewPager =row.findViewById(R.id.view);
        View_pager view_pager =new View_pager(getFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(view_pager);
        tabLayout.setupWithViewPager(viewPager);



        return row;
    }
}