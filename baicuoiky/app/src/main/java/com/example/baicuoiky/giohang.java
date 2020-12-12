package com.example.baicuoiky;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class giohang extends AppCompatActivity {
Button dau1,dau2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giohang);
        dau1 = (Button) findViewById(R.id.dau12);
        dau1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(giohang.this,MainActivity.class);
                startActivity(intent);

            }
        });


        dau2 = (Button) findViewById(R.id.ban);
        dau2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder alertDialogbuilder = new AlertDialog.Builder(giohang.this);

                alertDialogbuilder.setMessage("Đã đặt hàng thành công ");
                alertDialogbuilder.setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent =new Intent(giohang.this,MainActivity.class);
                        startActivity(intent);
                    }
                });

                alertDialogbuilder.show();

            }
        });

    }
}