package com.example.youthopia21;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;


public class HomeFragment extends Fragment {


    private ConstraintLayout goToAboutSchool, goToAboutYouth, update;
    private TextView donaDrive;

    SliderView sliderView;
    int[] images = {R.drawable.so1,
    R.drawable.so2,
    R.drawable.so3,
    R.drawable.so4};


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home,container,false);


        goToAboutSchool = v.findViewById(R.id.school_click);
        goToAboutYouth = v.findViewById(R.id.youth_click);
        sliderView = v.findViewById(R.id.imageSlider);
        donaDrive = v.findViewById(R.id.don_click);
        update = v.findViewById(R.id.updates_click);


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

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), updated_page.class));
            }
        });

        SliderAdapter sliderAdapter = new SliderAdapter(images);
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();


        donaDrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), DonationDrive.class));
            }
        });

        return v;

    }
}
