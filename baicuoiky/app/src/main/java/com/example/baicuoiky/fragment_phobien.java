package com.example.baicuoiky;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

public class fragment_phobien extends Fragment {
GridView gridView;
String []ten={
        "Cà phê lúa mạch đá","Cà phê lúa mạch nóng","socola lúa mạch đá xay","socola lúa mạch nóng",
        "Macca Phủ socola", "cà phê sữa nóng","cà phê đá"

};
String[] gia={"69.000 đ","69.000 đ","69.000 đ","69.000 đ","79.000 đ","49.000 đ","32.000 đ"


};
int[] hinh={
        R.drawable.imgbook,R.drawable.imgbook,R.drawable.imgbook,R.drawable.imgbook,R.drawable.imgbook,R.drawable.imgbook,R.drawable.imgbook
};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View row= inflater.inflate(R.layout.fragment_phobien, container, false);

  gridView= row.findViewById(R.id.girdview);
  gridViewAdapter gridViewAdapter=new gridViewAdapter(getActivity(),ten,hinh,gia);
gridView.setAdapter(gridViewAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(getActivity(),giohang.class);
                    startActivity(intent);
                }

            }
        });

                return row;
    }
}