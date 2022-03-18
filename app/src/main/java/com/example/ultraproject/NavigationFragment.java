package com.example.ultraproject;

import android.annotation.SuppressLint;
import android.os.Bundle;
<<<<<<< HEAD
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

=======
>>>>>>> 7f7b838 (test)
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Arrays;
=======
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
>>>>>>> 7f7b838 (test)

import com.example.ultraproject.Calculator.Calculator;
import com.example.ultraproject.ColorHelper.CHRelatedFragment;

public class NavigationFragment extends Fragment implements NavigationToFragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

<<<<<<< HEAD
    private String[] items;
    private ArrayList<String> listItems;
    private ArrayAdapter<String> adapter;
    private ListView listView;

=======
>>>>>>> 7f7b838 (test)
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            getArguments().getString(ARG_PARAM1);
            getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        @SuppressLint("InflateParams") View view = inflater.inflate(R.layout.fragment_main, null);

<<<<<<< HEAD
        Button button_colorHelper = view.findViewById(R.id.bt_color_helper);
        Button button_calculator = view.findViewById(R.id.bt_calculator);

        navigation(button_colorHelper);
        navigation(button_calculator);

        listView = view.findViewById(R.id.listview);
        EditText editText = view.findViewById(R.id.text_search);
        initList();

        editText.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().equals("")) {
                    initList();
                } else {
                    searchItem(s.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }

        });
=======
        Button button_color_helper_fragment = view.findViewById(R.id.bt_color_helper);
        Button button_calculator_fragment = view.findViewById(R.id.fragment_calculator_change);

        navigation(button_color_helper_fragment);
        navigation(button_calculator_fragment);
>>>>>>> 7f7b838 (test)

        return view;
    }

<<<<<<< HEAD
    public final void searchItem(String textToSearch) {
        for (String item : items) {
            String textToSearch1 = textToSearch.toLowerCase();
            if (!item.toLowerCase().contains(textToSearch1)) {
                listItems.remove(item);
            }
        }

        adapter.notifyDataSetChanged();
    }


        public final void initList() {
        items = new String[]{"Calculator", "Color helper"};
        listItems = new ArrayList<>(Arrays.asList(items));
        adapter = new ArrayAdapter<>(getContext(), R.layout.list_item, R.id.text_item, listItems);
        listView.setAdapter(adapter);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public final void navigation(Button button) {
=======
    @SuppressLint("NonConstantResourceId")
    @Override
    public void navigation(Button button) {
>>>>>>> 7f7b838 (test)
        button.setOnClickListener(view -> {
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            switch (view.getId()) {
<<<<<<< HEAD
                case R.id.bt_calculator:
=======
                case R.id.fragment_calculator_change:
>>>>>>> 7f7b838 (test)
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
        });
    }
}
<<<<<<< HEAD

=======
>>>>>>> 7f7b838 (test)
