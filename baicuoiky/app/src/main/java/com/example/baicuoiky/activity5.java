package com.example.baicuoiky;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class activity5 extends Fragment {

   LinearLayout tt,tt1,tt2;
   TextView dx;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_5,container,false);
tt=view.findViewById(R.id.ttcanhan1);
tt.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent =new Intent(getActivity(),Profile.class);
        startActivity(intent);
    }
});

        tt1=view.findViewById(R.id.ttcanhan2);
        tt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });
        tt2=view.findViewById(R.id.ls);
        tt2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), lichsu.class);
                startActivity(intent);
            }
        });
        dx=view.findViewById(R.id.dx);
        dx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder alertDialogbuilder = new AlertDialog.Builder(getActivity());
                alertDialogbuilder.setTitle("Đăng Xuất");
                alertDialogbuilder.setMessage("Bạn có muốn đăng xuất không ?");
                alertDialogbuilder.setCancelable(false).setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getActivity(),Login.class);
                        startActivity(intent);
                    }
                }).setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alertDialogbuilder.show();
            }
        });


        return view;
    }
}
