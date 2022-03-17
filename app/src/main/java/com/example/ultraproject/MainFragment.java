package com.example.ultraproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainFragment extends Fragment implements View.OnClickListener{
    private Button button_calculator_fragment;
    private Button button_color_helper_fragment;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, null);

        button_color_helper_fragment = view.findViewById(R.id.bt_color_helper);
        button_calculator_fragment = (Button) view.findViewById(R.id.fragment_calculator_change);
        button_calculator_fragment.setOnClickListener(this);
        button_color_helper_fragment.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        switch (view.getId()){
            case R.id.fragment_calculator_change:
                transaction.setReorderingAllowed(true);
                transaction.replace(R.id.MainActivity, Calculator.class, null);
                transaction.commit();
                break;
            case R.id.bt_color_helper:
                transaction.setReorderingAllowed(true);
                transaction.replace(R.id.MainActivity, CHRelatedFragment.class, null);
                transaction.commit();
                break;
        }
    }
}