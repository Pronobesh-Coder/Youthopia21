package com.example.youthopia21;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;


public class EventsFragment extends Fragment {


    ImageView le1,le2,le3,le4,le5,le6,le7,le8,le9,ge1,ge2,ge3;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_events,container,false);
        le1 = v.findViewById(R.id.le_1);
        le2 = v.findViewById(R.id.le_2);
        le3 = v.findViewById(R.id.le_3);
        le4 = v.findViewById(R.id.le_4);
        le5 = v.findViewById(R.id.le_5);
        le6 = v.findViewById(R.id.le_6);
        le7 = v.findViewById(R.id.le_7);
        le8 = v.findViewById(R.id.le_8);
        le9 = v.findViewById(R.id.le_9);
        ge1 = v.findViewById(R.id.ge1);
        ge2 = v.findViewById(R.id.ge2);
        ge3 = v.findViewById(R.id.ge3);

        le1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),e1.class));

            }
        });
        le2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),e2.class));

            }
        });
        le3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),e3.class));

            }
        });
        le4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),e4.class));

            }
        });
        le5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),e5.class));

            }
        });
        le6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),e6.class));

            }
        });
        le7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),e7.class));

            }
        });
        le8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),e8.class));

            }
        });
        le9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),e9.class));

            }
        });

        ge1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),g1.class));

            }
        });
        ge2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),g2.class));

            }
        });
        ge3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),g3.class));

            }
        });

        return v;
    }

    }
