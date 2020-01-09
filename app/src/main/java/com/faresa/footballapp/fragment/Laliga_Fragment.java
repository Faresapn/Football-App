package com.faresa.footballapp.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.faresa.footballapp.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Laliga_Fragment extends Fragment {


    public Laliga_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_laliga_, container, false);
    }

}
