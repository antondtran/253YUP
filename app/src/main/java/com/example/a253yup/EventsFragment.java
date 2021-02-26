package com.example.a253yup;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class EventsFragment extends Fragment implements View.OnClickListener{
    View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);







    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_events, container, false);

        TextView textView = view.findViewById(R.id.textView5);
        TextView textView2 = view.findViewById(R.id.textView6);
        TextView textView3 = view.findViewById(R.id.textView7);

        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
        textView3.setOnClickListener(this);


        return view;


    }


    @Override
    public void onClick(View v) {
        Toast.makeText(getContext(), "Event added", Toast.LENGTH_SHORT).show();

    }
}