package com.example.andreea.runawayfinal4;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class RunIt extends Fragment {


    public RunIt() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_run_it, container, false);
    }

    public void onResume(){
        super.onResume();

        // Set title bar
        ((MainActivity) getActivity())
                .setTitle("Run it!");

    }

}
