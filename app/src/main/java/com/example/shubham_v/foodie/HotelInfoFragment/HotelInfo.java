package com.example.shubham_v.foodie.HotelInfoFragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shubham_v.foodie.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelInfo extends Fragment {


    public HotelInfo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hotel_info, container, false);
    }

}
