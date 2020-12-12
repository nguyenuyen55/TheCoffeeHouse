package com.example.baicuoiky;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class activity1 extends Fragment {
    private ImageView orderbtn;
    private ImageView option;
    TextView profile;
    ImageView tb1;
    Button chitiet;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_test,container,false);
//        orderbtn = (ImageView) view.findViewById(R.id.orderbtn);
//        orderbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(),MenuApp.class);
//                startActivity(intent);
//            }
//        });
        profile= view.findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Profile.class);
                startActivity(intent);
            }
        });
        tb1=view.findViewById(R.id.tb1);
        tb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),thongbaoo.class);
                startActivity(intent);
            }
        });
        chitiet =  view.findViewById(R.id.chitiet);
        chitiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ChiTietUuDai.class);
                startActivity(intent);
            }
        });
        return view;
    }

}
