package com.hoperlady.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hoperlady.R;
import com.hoperlady.hockeyapp.FragmentHockeyApp;


/**
 * Created by user88 on 11/28/2015.
 */
public class HomePage extends FragmentHockeyApp {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.home_page, container, false);


    }


}


