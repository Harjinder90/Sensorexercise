package com.example.harjinderkaur.sensorandstorageapp;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentGreen extends Fragment {


    private int count;
    private final String FILENAME = "420NA6AS";
    public FragmentGreen() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View rootView = inflater.inflate(R.layout.fragment_fragment_green, container, false);
        rootView.findViewById(R.id.buttonMinus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UpdateCount(count - 1);
            }
        });


        rootView.findViewById(R.id.buttonPlus).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                UpdateCount(count + 1);
            }
        });

        return rootView;

    }
    @Override
    public void onPause() {
        super.onPause();
        SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
        sharedPref.edit().putInt("count",count).commit();
    }

    @Override
    public void onResume() {
        super.onResume();
        SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
        count = sharedPref.getInt("count",0);
        UpdateCount(count);
    }

    private void UpdateCount(int nbr) {
        count = nbr;
        TextView textView = getView().findViewById(R.id.textViewNbr);
        textView.setText(Integer.toString(count));
    }
    }






