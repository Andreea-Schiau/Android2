package com.example.andreea.runawayfinal4;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class FeelIt extends Fragment {


    public FeelIt() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_feel_it, container, false);
    }


    public void onResume(){
        super.onResume();

        // Set title bar
        ((MainActivity) getActivity()).setTitle("How do you feel?");

    }



}
