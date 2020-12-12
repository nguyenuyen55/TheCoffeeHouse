package com.example.baicuoiky;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.fragment.app.Fragment;


public class fragment_thucuong extends Fragment {
    GridView gridView;
    String []ten={
            "Macaca Phủ socola","Mít sấy","Cơm cháy Chà Bông","Cà phê lúa mạch đá","Cà phê lúa mạch nóng","socola lúa mạch đá xay","socola lúa mạch nóng",
            "Macca Phủ socola", "cà phê sữa nóng","cà phê đá"

    };
    String[] gia={"45.000 đ","20.000 đ","35.000 đ","69.000 đ","69.000 đ","69.000 đ","69.000 đ","79.000 đ","49.000 đ","32.000 đ"


    };
    int[] hinh={
            R.drawable.maca,R.drawable.mit,R.drawable.comchay, R.drawable.imgbook,R.drawable.imgbook,R.drawable.imgbook,R.drawable.imgbook,R.drawable.imgbook,R.drawable.imgbook,R.drawable.imgbook
    };
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment_thucuong() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_thucuong.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment_thucuong newInstance(String param1, String param2) {
      fragment_thucuong fragment = new fragment_thucuong();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View row= inflater.inflate(R.layout.fragment_phobien, container, false);

        gridView= row.findViewById(R.id.girdview);
        gridViewAdapter gridViewAdapter=new gridViewAdapter(getActivity(),ten,hinh,gia);
        gridView.setAdapter(gridViewAdapter);
        return row;
    }
}