package com.example.youthopia21;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;


public class HomeFragment extends Fragment {


    private ConstraintLayout goToAboutSchool, goToAboutYouth;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home,container,false);


        goToAboutSchool = v.findViewById(R.id.school_click);
        goToAboutYouth = v.findViewById(R.id.youth_click);

        goToAboutSchool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),AboutSchool.class));
            }
        });

        goToAboutYouth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), AboutYouthopia.class));
            }
        });
        return v;

    }
}
