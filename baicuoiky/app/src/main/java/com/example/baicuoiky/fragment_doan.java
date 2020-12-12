package com.example.baicuoiky;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.fragment.app.Fragment;


public class fragment_doan extends Fragment {
    GridView gridView;
    String []ten={
           "Macaca Phủ socola","Mít sấy","Cơm cháy Chà Bông"

    };
    String[] gia={"45.000 đ","20.000 đ","35.000 đ"


    };
    int[] hinh={
            R.drawable.maca,R.drawable.mit,R.drawable.comchay
    };
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment_doan() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_doan.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment_doan newInstance(String param1, String param2) {
        fragment_doan fragment = new fragment_doan();
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